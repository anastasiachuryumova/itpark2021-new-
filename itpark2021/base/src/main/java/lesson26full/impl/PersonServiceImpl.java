package lesson26full.impl;

import lesson18.dto.Person;
import lesson25.spring.dao.PersonDao;
import lesson26full.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Override
    public void save(Person person) {

    }
}
