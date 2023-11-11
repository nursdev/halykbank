package kz.halykbank.halykbank.api;

import kz.halykbank.halykbank.dto.ReceiptDTO;
import kz.halykbank.halykbank.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/receipt")
@RequiredArgsConstructor
public class ReceiptRestController {

    private final ReceiptService receiptService;

    @GetMapping
    public List<ReceiptDTO> getList() {
        return receiptService.getList();
    }
}
