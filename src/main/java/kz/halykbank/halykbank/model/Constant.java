package kz.halykbank.halykbank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "constant")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Constant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private Integer value;

    @ManyToOne
    private Item item;


}
