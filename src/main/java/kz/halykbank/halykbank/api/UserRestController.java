package kz.halykbank.halykbank.api;

import kz.halykbank.halykbank.dto.UserDTO;
import kz.halykbank.halykbank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping
    public List<UserDTO> getList() {
        return userService.getList();
    }
}
