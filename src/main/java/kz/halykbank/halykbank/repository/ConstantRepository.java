package kz.halykbank.halykbank.repository;

import kz.halykbank.halykbank.model.Constant;
import org.aspectj.apache.bcel.generic.LOOKUPSWITCH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstantRepository extends JpaRepository<Constant, Long> {
}
