package kz.halykbank.halykbank.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private OrganizationDTO organizationDTO;



}
