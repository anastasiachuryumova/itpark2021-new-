package tech.itpark.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tech.itpark.domain.Client;
import tech.itpark.dto.ClientDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-14T16:39:44+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDto toDto(Client clientEntity) {
        if ( clientEntity == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setId( clientEntity.getId() );
        clientDto.setName( clientEntity.getName() );

        return clientDto;
    }

    @Override
    public List<ClientDto> toDtos(List<Client> clientEntityList) {
        if ( clientEntityList == null ) {
            return null;
        }

        List<ClientDto> list = new ArrayList<ClientDto>( clientEntityList.size() );
        for ( Client client : clientEntityList ) {
            list.add( toDto( client ) );
        }

        return list;
    }
}
