package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.UserDTO;
import kz.halykbank.halykbank.model.Item;
import kz.halykbank.halykbank.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserMapper {


    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setIin(user.getIin());
        userDTO.setName(user.getName());
        // Assuming you have an OrganizationConverter to convert List<Organization> to List<OrganizationDTO>
        userDTO.setOrganizationsDTOs(OrganizationMapper.toDTOList(user.getOrganizations()));

        return userDTO;
    }

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setIin(userDTO.getIin());
        user.setName(userDTO.getName());

        // Assuming you have an OrganizationConverter to convert List<OrganizationDTO> to List<Organization>
        user.setOrganizations(OrganizationMapper.toEntityList(userDTO.getOrganizationsDTOs()));

        return user;
    }

    public static List<UserDTO> toDTOList(List<User> users) {
        return users.stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<User> toEntityList(List<UserDTO> userDTOs) {
        return userDTOs.stream()
                .map(UserMapper::toEntity)
                .collect(Collectors.toList());
    }
}
