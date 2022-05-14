package tech.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.itpark.domain.Processing;

import java.util.Optional;

public interface ProcessingRepository extends JpaRepository<Processing, Long> {
    Processing findByCard(String card);

    Optional<Processing> findByAccountId(Long accountId);
}
