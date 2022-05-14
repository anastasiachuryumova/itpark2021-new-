package tech.itpark.mapper;

import org.mapstruct.Mapper;
import tech.itpark.domain.Client;
import tech.itpark.dto.ClientDto;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ClientMapper {

    ClientDto toDto(Client clientEntity);

    List<ClientDto> toDtos(List<Client> clientEntityList);

    default Optional<ClientDto> toOptional(Optional<Client> clientEntity) {
        return clientEntity.map(this::toDto);
    }
}
