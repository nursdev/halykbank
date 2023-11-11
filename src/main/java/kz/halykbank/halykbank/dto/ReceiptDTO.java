package kz.halykbank.halykbank.dto;

import kz.halykbank.halykbank.model.Employee;
import kz.halykbank.halykbank.model.Item;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ReceiptDTO {

    private Long id;

    private LocalDateTime creationDate = LocalDateTime.now();

    private Integer totalPrice;

    private List<ItemDTO> items;

    private EmployeeDTO employee;
}
