    package kz.halykbank.halykbank.dto;

    import jakarta.persistence.*;
    import kz.halykbank.halykbank.model.Item;
    import lombok.Data;
    import lombok.Getter;
    import lombok.Setter;

    @Getter
    @Setter
    public class ConstantDTO {

        private Long id;

        private String name;

        private Integer value;

        private ItemDTO itemDTO;
    }
