package kz.halykbank.halykbank.repository;

import kz.halykbank.halykbank.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
