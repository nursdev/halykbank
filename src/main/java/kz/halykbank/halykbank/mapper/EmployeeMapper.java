package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.EmployeeDTO;
import kz.halykbank.halykbank.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setPhone(employee.getPhone());

        // Assuming you have an EmployeeConverter to convert Employee to EmployeeDTO
        return employeeDTO;
    }

    public static Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setPhone(employeeDTO.getPhone());
        // Assuming you have an EmployeeConverter to convert EmployeeDTO to Employee

        return employee;
    }

    public static List<EmployeeDTO> toDTOList(List<Employee> employees) {
        return employees.stream()
                .map(EmployeeMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Employee> toEntityList(List<EmployeeDTO> employeeDTOs) {
        return employeeDTOs.stream()
                .map(EmployeeMapper::toEntity)
                .collect(Collectors.toList());
    }
}





