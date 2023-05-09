package EmployeeDetails.Controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import EmployeeDetails.Exception.Exception;
import EmployeeDetails.Repositary.Services;
import EmployeeDetails.model.EmployeDetails;
@RestController
@RequestMapping("/api/josh/")
public class Controller {
	@Autowired
	public Services Jpaservices;
	
	@PostMapping("/employee/post")
	public EmployeDetails PostEmployeeDetails(@RequestBody EmployeDetails employeedetails ) {
		return Jpaservices.save(employeedetails);
	}
	@GetMapping("/employee/get")
	public List<EmployeDetails> GetAllEmpDetails(){
		return Jpaservices.findAll();
	}
	@GetMapping("/employee/get/{EmpId}")
		public ResponseEntity<EmployeDetails> GetByEmpDetails(@PathVariable Integer EmpId) {
		EmployeDetails empditails=Jpaservices.findById(EmpId)
				.orElseThrow(()->new Exception("invalid empId"+EmpId));
		return ResponseEntity.ok(empditails);
		
	}
	@PutMapping("/employee/put/{EmpId}")
	public ResponseEntity<EmployeDetails> PutByEmpDetails(@PathVariable Integer EmpId,@RequestBody  EmployeDetails employeedetails ){
		EmployeDetails empditails = Jpaservices.findById(EmpId)
					 .orElseThrow(()->new Exception("emp id is not valid" +EmpId));
		
		empditails.setFirstName(employeedetails.getFirstName());
		empditails.setLastName(employeedetails.getFirstName());
		empditails.setEmailId(employeedetails.getEmailId());
		EmployeDetails updated=Jpaservices.save(empditails);
		return ResponseEntity.ok(updated);			
		
	}
	@DeleteMapping("/employee/delete/{EmpId}")
	public ResponseEntity<Map<String,Boolean>> DeleteById(@PathVariable Integer EmpId ){
		EmployeDetails empditails=Jpaservices.findById(EmpId)
				.orElseThrow(()->new Exception("emp id is not valid"+EmpId));
				Jpaservices.delete(empditails);
		Map<String,Boolean> repo = new HashMap<String,Boolean>();
		repo.put("deleted Secussfullay", Boolean.TRUE);
		return ResponseEntity.ok(repo);
		
		
	}
	

}
