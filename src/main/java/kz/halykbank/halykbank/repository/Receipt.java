package kz.halykbank.halykbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Receipt extends JpaRepository<Receipt, Long> {
}
