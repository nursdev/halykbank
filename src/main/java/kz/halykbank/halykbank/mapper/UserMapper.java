package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.UserDTO;
import kz.halykbank.halykbank.model.Item;
import kz.halykbank.halykbank.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;



import java.util.ArrayList;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserMapper {



    public  UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setIin(user.getIin());
        userDTO.setName(user.getName());
        return userDTO;
    }

    public  User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setIin(userDTO.getIin());
        user.setName(userDTO.getName());
        return user;
    }


    public  List<UserDTO> toDTOList(List<User> users) {
        List<UserDTO> dtoList = new ArrayList<>();
        for (User user : users) {
            dtoList.add(toDTO(user));
        }
        return dtoList;
    }

    public  List<User> toEntityList(List<UserDTO> userDTOs) {
        List<User> users = new ArrayList<>();
        for (UserDTO userDTO : userDTOs) {
            users.add(toEntity(userDTO));
        }

        return users;
    }

}
