    package kz.halykbank.halykbank.dto;

    import jakarta.persistence.*;
    import kz.halykbank.halykbank.model.Item;
    import lombok.Data;

    @Data
    public class ConstantDTO {

        private Long id;

        private String name;

        private Integer value;

        private Item item;
    }
