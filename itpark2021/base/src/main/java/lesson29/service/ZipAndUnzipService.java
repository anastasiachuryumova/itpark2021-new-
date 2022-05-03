package lesson29.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ZipAndUnzipService {

    Optional<String> zip(String source);

    Optional<String> unzip(String file, String source);
}
