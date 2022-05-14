package tech.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.itpark.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
