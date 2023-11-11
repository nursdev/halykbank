package kz.halykbank.halykbank.service;

import kz.halykbank.halykbank.dto.ReceiptDTO;
import kz.halykbank.halykbank.mapper.ReceiptMapper;
import kz.halykbank.halykbank.repository.ReceiptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceiptService {
    private final ReceiptRepository receiptRepository;
    private final ReceiptMapper receiptMapper;

    public List<ReceiptDTO> getList() {
        return receiptMapper.toDTOList(receiptRepository.findAll());
    }
}
