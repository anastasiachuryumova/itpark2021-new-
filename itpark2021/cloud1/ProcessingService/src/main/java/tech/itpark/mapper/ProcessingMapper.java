package tech.itpark.mapper;

import org.mapstruct.Mapper;
import tech.itpark.domain.Processing;
import tech.itpark.dto.ProcessingDto;

@Mapper
public interface ProcessingMapper {

    ProcessingDto toDto(Processing entity);
}
