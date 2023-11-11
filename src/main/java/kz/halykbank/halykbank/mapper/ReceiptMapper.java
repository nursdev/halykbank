package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.ReceiptDTO;
import kz.halykbank.halykbank.model.Receipt;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ReceiptMapper {

    private final ItemMapper itemMapper;
    private final EmployeeMapper employeeMapper;

    public ReceiptDTO toDTO(Receipt receipt) {
        ReceiptDTO receiptDTO = new ReceiptDTO();
        receiptDTO.setId(receipt.getId());
        receiptDTO.setTotalPrice(receipt.getTotalPrice());
        receiptDTO.setCreationDate(receipt.getCreationDate());
        receiptDTO.setPhoneNumber(receipt.getPhoneNumber());
        receiptDTO.setItemsDTOs(itemMapper.toDtoList(receipt.getItems()));
        receiptDTO.setEmployeeDTO(employeeMapper.toDTO(receipt.getEmployee()));

        return receiptDTO;
    }

    public Receipt toModel(ReceiptDTO receiptDTO) {
        Receipt receipt = new Receipt();
        receipt.setId(receiptDTO.getId());
        receipt.setTotalPrice(receiptDTO.getTotalPrice());
        receipt.setPhoneNumber(receiptDTO.getPhoneNumber());
        receipt.setCreationDate(receiptDTO.getCreationDate());
        receipt.setItems(itemMapper.toEntityList(receiptDTO.getItemsDTOs()));
        receipt.setEmployee(employeeMapper.toModel(receiptDTO.getEmployeeDTO()));

        return receipt;
    }

    public List<ReceiptDTO> toDTOList(List<Receipt> receipts) {
        List<ReceiptDTO> receiptDTOS = new ArrayList<>();
        for (Receipt receipt : receipts) {
            receiptDTOS.add(toDTO(receipt));
        }

        return receiptDTOS;
    }
}