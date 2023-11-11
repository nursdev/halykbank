package kz.halykbank.halykbank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Table(name = "organization")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "organization")
    private List<Item> items;

}
