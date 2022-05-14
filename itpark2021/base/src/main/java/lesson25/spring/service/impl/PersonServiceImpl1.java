package lesson25.spring.service.impl;

import lesson25.spring.dao.PersonDao;
import lesson25.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl1 implements PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonServiceImpl1(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void print() {
        personDao.save();
    }
}
