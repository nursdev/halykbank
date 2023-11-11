package kz.halykbank.halykbank.dto;

import kz.halykbank.halykbank.model.Employee;
import kz.halykbank.halykbank.model.Item;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ReceiptDTO {

    private Long id;

    private LocalDateTime creationDate = LocalDateTime.now();

    private Integer totalPrice;

    private String phoneNumber;

    private EmployeeDTO employeeDTO;

    private List<ItemDTO> itemsDTOs;

}
