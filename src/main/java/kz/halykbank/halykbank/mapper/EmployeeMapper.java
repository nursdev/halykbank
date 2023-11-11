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





    public EmployeeDTO toDTO(Employee employee) {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());

        employeeDTO.setPhone(employee.getPhone());

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





