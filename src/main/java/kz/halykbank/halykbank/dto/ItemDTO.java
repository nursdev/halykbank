package kz.halykbank.halykbank.dto;

import jakarta.persistence.*;
import kz.halykbank.halykbank.model.Organization;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO {

    private Long id;

    private String name;

    private Integer price;

    private OrganizationDTO organizationDTO;
}
