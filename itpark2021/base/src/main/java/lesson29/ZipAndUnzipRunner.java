package lesson29;

//@SpringBootApplication
/*public class ZipAndUnzipRunner {
    public static void main(String[] args) {
        if (args.length ==0) {
            System.out.println("Укажите параметры запуска программы и перезапустите ее");
            return;
        }
        System.out.println("Начал работу архиватор ...");
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(ZipAndUnzipRunner.class, args);
        final ZipAndUnzipService zipAndUnzipService = applicationContext.getBean(ZipAndUnzipService.class);
        Arrays.stream(args).findFirst().ifPresentOrElse(file ->{
            final String zip = zipAndUnzipService.zip(file).orElseThrow(() -> new IllegalStateException("Невозможно выполнить архивацию"));
            System.out.printf("Архиватор успешно завершил свою работу.Результат %s", zip);
            final String unzip = zipAndUnzipService.unzip(file, args.length >=2 ? args[1] : null).orElseThrow(() -> new IllegalStateException("Невозможно выполнить разархивацию"));
            System.out.printf("Архиватор успешно завершил свою работу.  Результат %s", unzip);
        }, () -> {
            System.out.println("Необходимо указать архивируемый файл в качестве запуска программы");
            System.exit(0);
        });
    }
}*/
