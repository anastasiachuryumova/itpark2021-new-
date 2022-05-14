package lesson33hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"lesson26.service", "lesson33hw"})
public class ValuteWebRunner {
    public static void main(String[] args) {
        SpringApplication.run(ValuteWebRunner.class, args);
    }
}
