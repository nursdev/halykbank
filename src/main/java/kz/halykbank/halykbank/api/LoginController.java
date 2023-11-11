package kz.halykbank.halykbank.api;

import kz.halykbank.halykbank.dto.ConstantDTO;
import kz.halykbank.halykbank.model.User;
import kz.halykbank.halykbank.service.ConstantService;
import kz.halykbank.halykbank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping
    public String login(String login, String password) {
        Optional<User> optionalUser = userService.getUserByLogin(login);
        if (optionalUser.isEmpty()) return "no";
        if (optionalUser.get().getPassword().equals(password)) return optionalUser.get().getId().toString();
        return "no";
    }



}
