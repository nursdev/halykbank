package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.ReceiptDTO;
import kz.halykbank.halykbank.model.Receipt;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


public class ReceiptMapper {

    public static ReceiptDTO toDTO(Receipt receipt) {
        ReceiptDTO receiptDTO = new ReceiptDTO();
        receiptDTO.setId(receipt.getId());
        receiptDTO.setCreationDate(receipt.getCreationDate());
        receiptDTO.setTotalPrice(receipt.getTotalPrice());

        // Assuming you have an ItemConverter to convert List<Item> to List<ItemDTO>
        receiptDTO.setItems(ItemMapper.toDTOList(receipt.getItems()));

        // Assuming you have an EmployeeConverter to convert Employee to EmployeeDTO
        receiptDTO.setEmployee(EmployeeMapper.toDTO(receipt.getEmployee()));

        return receiptDTO;
    }

    public static Receipt toEntity(ReceiptDTO receiptDTO) {
        Receipt receipt = new Receipt();
        receipt.setId(receiptDTO.getId());
        receipt.setCreationDate(receiptDTO.getCreationDate());
        receipt.setTotalPrice(receiptDTO.getTotalPrice());

        // Assuming you have an ItemConverter to convert List<ItemDTO> to List<Item>
        receipt.setItems(ItemMapper.toEntityList(receiptDTO.getItems()));

        // Assuming you have an EmployeeConverter to convert EmployeeDTO to Employee
        receipt.setEmployee(EmployeeMapper.toEntity(receiptDTO.getEmployee()));

        return receipt;
    }

    public static List<ReceiptDTO> toDTOList(List<Receipt> receipts) {
        return receipts.stream()
                .map(ReceiptMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Receipt> toEntityList(List<ReceiptDTO> receiptDTOs) {
        return receiptDTOs.stream()
                .map(ReceiptMapper::toEntity)
                .collect(Collectors.toList());
    }

}
