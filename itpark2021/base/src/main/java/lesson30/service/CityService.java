package lesson30.service;

import lesson30.model.City;

import java.util.Optional;

public interface CityService {

    Optional <City> findByCode (Integer code);
    City save (City city);
    void deleteByCode (Integer code);
}
