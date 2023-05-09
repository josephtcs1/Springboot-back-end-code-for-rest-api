package EmployeeDetails.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EmployeeDetails.model.EmployeDetails;
@Repository
public interface Services extends JpaRepository<EmployeDetails, Integer> {

}
