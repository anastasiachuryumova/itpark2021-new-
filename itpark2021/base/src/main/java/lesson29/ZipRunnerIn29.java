package lesson29;

import lesson29.service.ZipAndUnzipService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ZipRunnerIn29 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите параметры запуска программы и перезапустите ее");
            return;
        }
        System.out.println("Начал работу архиватор...");
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(ZipRunnerIn29.class, args);
        final ZipAndUnzipService zipAndUnzipService = applicationContext.getBean(ZipAndUnzipService.class);
        Arrays.stream(args).findFirst().ifPresentOrElse(file ->{
            final String zip = zipAndUnzipService.zip(file).orElseThrow(() -> new IllegalStateException("Невозможно выполнить архивацию"));
            System.out.printf("Архиватор успешно завершил свою работу.Результат %s", zip);
        }, () -> {
            System.out.println("Необходимо указать архивируемый файл в качестве запуска программы");
            System.exit(0);
        });
    }
}
