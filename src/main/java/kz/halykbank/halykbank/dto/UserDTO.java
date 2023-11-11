package kz.halykbank.halykbank.dto;

import jakarta.persistence.*;
import kz.halykbank.halykbank.model.Organization;
import kz.halykbank.halykbank.model.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO  {

    private Long id;

    private String iin;

    private String name;

    private List<OrganizationDTO> organizationsDTOs;
}
