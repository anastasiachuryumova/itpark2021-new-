package lesson39hw;

import lesson39hw.dto.CityDto;
import lesson39hw.service.CityDictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@Slf4j
@SpringBootApplication
public class AspectRunner {

    private static final String SAMARA = "SAMARA";
    private static final String TVER = "TVER";

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(AspectRunner.class, args);
        final CityDictionaryService cityDictionaryService = applicationContext.getBean(CityDictionaryService.class);
        final Set<CityDto> cities = cityDictionaryService.getCities();
        log.info("Получен списск городов {}", cities);

        final CityDto samara = cityDictionaryService.getCityByCode(SAMARA).orElse(null);
        log.info("Информация по городу с кодом {}:{}", SAMARA, samara);

        final CityDto tver = cityDictionaryService.getCityByCode(TVER).orElse(null);
        log.info("Информация по городу с кодом {}:{}", TVER, tver);
    }
}
