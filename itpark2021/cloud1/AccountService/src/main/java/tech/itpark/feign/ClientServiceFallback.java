package tech.itpark.feign;

import org.springframework.stereotype.Component;
import tech.itpark.feign.dto.ClientDto;

import java.util.Optional;

@Component
public class ClientServiceFallback implements ClientServiceClient{

    @Override
    public Optional<ClientDto> findById(Long id) {
        return Optional.empty();
    }
}
