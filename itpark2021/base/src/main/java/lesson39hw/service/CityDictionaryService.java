package lesson39hw.service;

import lesson39hw.dto.CityDto;

import java.util.Optional;
import java.util.Set;

public interface CityDictionaryService {

    Set<CityDto> getCities();
    Optional<CityDto> getCityByCode(String code);
}
