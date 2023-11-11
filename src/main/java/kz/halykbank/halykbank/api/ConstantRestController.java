package kz.halykbank.halykbank.api;

import kz.halykbank.halykbank.dto.ConstantDTO;
import kz.halykbank.halykbank.mapper.ConstantMapper;
import kz.halykbank.halykbank.service.ConstantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/constant")
@RequiredArgsConstructor
public class ConstantRestController {

    private final ConstantService constantService;

    @GetMapping
    public List<ConstantDTO> getList() {
        return constantService.getList();
    }

    @GetMapping
    private List<ConstantDTO> getList() {
        return constantService.getConstantDTOList();
    }

}
