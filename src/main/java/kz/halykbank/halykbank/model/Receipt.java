package kz.halykbank.halykbank.model;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "check")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    private Integer totalPrice;

    @OneToMany
    private List<Item> items;

    @PostConstruct
    public void creationDate() {
        creationDate = LocalDateTime.now();
    }
}
