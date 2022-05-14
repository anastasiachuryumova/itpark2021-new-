package tech.itpark.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tech.itpark.domain.Processing;
import tech.itpark.dto.ProcessingDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-14T17:17:56+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ProcessingMapperImpl implements ProcessingMapper {

    @Override
    public ProcessingDto toDto(Processing entity) {
        if ( entity == null ) {
            return null;
        }

        ProcessingDto processingDto = new ProcessingDto();

        processingDto.setId( entity.getId() );
        processingDto.setCard( entity.getCard() );
        processingDto.setAccountId( entity.getAccountId() );

        return processingDto;
    }
}
