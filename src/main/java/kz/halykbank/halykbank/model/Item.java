package kz.halykbank.halykbank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    @ManyToOne
    private Organization organization;
}
