package lesson29.repository;

import lesson29.model.ZipAndUnzip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipAndUnzipRepository extends JpaRepository<ZipAndUnzip, String> {
}
