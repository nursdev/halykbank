package kz.halykbank.halykbank.api;

import kz.halykbank.halykbank.dto.ItemDTO;
import kz.halykbank.halykbank.service.ItemService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
@RequiredArgsConstructor
public class ItemRestController {

    private final ItemService itemService;

    @GetMapping
    public List<ItemDTO> getList() {
        return itemService.getList();
    }
}
