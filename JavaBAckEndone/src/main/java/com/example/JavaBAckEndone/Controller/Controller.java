package com.example.JavaBAckEndone.Controller;

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

import com.example.JavaBAckEndone.Exception.ExceptionFound;
import com.example.JavaBAckEndone.Repositary.JosephRepositary;
import com.example.JavaBAckEndone.model.JosephDetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/josh/")
public class Controller {
	@Autowired
	private JosephRepositary josephRepositary;
	//get joseph details
	@GetMapping("/joseph/get")
	public List<JosephDetails> josephAllDetails(){
		return josephRepositary.findAll();	
	}
	@PostMapping("/joseph/post")
	public JosephDetails josephPostdata(@RequestBody JosephDetails josephdetails ) {
		return josephRepositary.save(josephdetails);	
	}
   @PutMapping("/joseph/put/{id}") 
   
   public ResponseEntity<JosephDetails> updateJosephDetails(@RequestBody JosephDetails updatedetails,@PathVariable Long id ){
	   JosephDetails joshdetails=josephRepositary.findById(id)
			   .orElseThrow(()->new ExceptionFound("invalid Id" +id));
	   joshdetails.setFirstName(updatedetails.getFirstName());
	   joshdetails.setLastName(updatedetails.getLastName());
	   
	   JosephDetails updated =josephRepositary.save(joshdetails);
			   return ResponseEntity.ok(updated);  
   }
   //Get mapping by id
	@GetMapping("/joseph/get/{id}")
   public ResponseEntity<JosephDetails> getbyidjosephdetails(@PathVariable Long id){
	   JosephDetails josh=josephRepositary.findById(id)
				.orElseThrow(() -> new ExceptionFound("joseph id  not exist with id :" + id));
	   return ResponseEntity.ok(josh);
	   
   } 
	//delete details by id
	@DeleteMapping("/joseph/delete/{id}")
	public ResponseEntity<Map<String,Boolean>> deletejoseph(@PathVariable Long id){
		JosephDetails joseph =josephRepositary.findById(id)
				.orElseThrow(()-> new ExceptionFound("joseph id not exist with id" +id));
		josephRepositary.delete(joseph);
		Map<String,Boolean> responce = new HashMap<String,Boolean>();
		responce.put("delete Seccussful", Boolean.TRUE);
		return ResponseEntity.ok(responce);
		
	}
	
	 @PostMapping("/King/post")
	public JosephDetails joshPostDetails(@RequestBody JosephDetails josephposrDetails){
	
	return josephRepositary.save(josephposrDetails);
	
	}
	 @PutMapping("/King/put/{id}")
	 public ResponseEntity<JosephDetails>  updateJoshDitails(@PathVariable Long id, @RequestBody JosephDetails josephDetails ){
		 JosephDetails josh = josephRepositary.findById(id)
				 .orElseThrow(()->new ExceptionFound("id not exist with id " +id));
		 josh.setEmailId(josephDetails.getEmailId());
		 josh.setSalary(josephDetails.getSalary());
		 JosephDetails updted=josephRepositary.save(josh);
		 return ResponseEntity.ok(updted);	 
	 }
	 
	 @GetMapping("/King/get")
	 public List<JosephDetails> joshGetdetails(){
		 return josephRepositary.findAll();
	 }
	 
	

}
