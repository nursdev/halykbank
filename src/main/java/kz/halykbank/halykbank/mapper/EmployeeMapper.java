package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.EmployeeDTO;
import kz.halykbank.halykbank.model.Employee;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class EmployeeMapper {

    private final OrganizationMapper organizationMapper;


    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setPhoneNumber(employee.getPhoneNumber());
        employeeDTO.setOrganizationDTO(organizationMapper.toDTO(employee.getOrganization()));

        return employeeDTO;
    }

    public Employee toModel(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setOrganization(organizationMapper.toEntity(employeeDTO.getOrganizationDTO()));

        return employee;
    }

    public List<EmployeeDTO> toDtoList(List<Employee> employees) {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOS.add(toDTO(employee));
        }

        return employeeDTOS;
    }

    public List<Employee> toModelList(List<EmployeeDTO> employeeDTOS) {
        List<Employee> employees = new ArrayList<>();

        for (EmployeeDTO employeeDTO : employeeDTOS) {
            employees.add(toModel(employeeDTO));
        }

        return employees;
    }

}