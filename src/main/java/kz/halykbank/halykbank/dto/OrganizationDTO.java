package kz.halykbank.halykbank.dto;

import jakarta.persistence.*;
import kz.halykbank.halykbank.model.Item;
import kz.halykbank.halykbank.model.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrganizationDTO {

    private Long id;

    private String name;

    private String address;

    private UserDTO userDTO;


    private List<ItemDTO> itemsDTOs;

}
