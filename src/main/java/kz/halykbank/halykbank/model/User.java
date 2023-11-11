package kz.halykbank.halykbank.model;


import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.ast.Or;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "iin")
    private String iin;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user")
    private List<Organization> organizations = new ArrayList<>();




}
