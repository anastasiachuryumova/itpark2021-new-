package lesson26full.config;

import lesson25.spring.dao.PersonDao;
import lesson25.spring.dao.impl.PersonDaoImpl;
import lesson26full.AccountService;
import lesson26full.PersonService;
import lesson26full.impl.AccountServiceImpl;
import lesson26full.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan({"lesson25", "lesson26full"})
public class AppConfig {

    @Bean("accountService")
    public AccountService accountService() {
        return new AccountServiceImpl(BigDecimal.ONE);
    }
    @Bean("accountService")
    public AccountService accountService1() {
        return new AccountServiceImpl(BigDecimal.ZERO);
    }
    @Bean
    public PersonService personService() {
        return new PersonServiceImpl(personDao());
    }
    @Bean
    public PersonDao personDao() {
        return new PersonDaoImpl();
            }
        }

