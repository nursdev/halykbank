package kz.halykbank.halykbank.service;

import kz.halykbank.halykbank.dto.UserDTO;
import kz.halykbank.halykbank.mapper.UserMapper;
import kz.halykbank.halykbank.model.User;
import kz.halykbank.halykbank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDTO> getList() {
        return UserMapper.toDTOList(userRepository.findAll());
    }
}
