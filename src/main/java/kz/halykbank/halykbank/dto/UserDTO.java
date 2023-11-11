package kz.halykbank.halykbank.dto;

import jakarta.persistence.*;
import kz.halykbank.halykbank.model.Organization;
import kz.halykbank.halykbank.model.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class UserDTO {


    private Long id;

    private String iin;

    private String name;


    private List<OrganizationDTO> organizationsDTOs;

}
