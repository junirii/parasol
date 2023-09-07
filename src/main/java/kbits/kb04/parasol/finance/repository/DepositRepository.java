package kbits.kb04.parasol.finance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kbits.kb04.parasol.finance.entity.Deposit;

@Repository
public interface DepositRepository extends JpaRepository<Deposit, Long>{
	Optional<Deposit> findBydepositNo(Long depositNo);
}
