package lesson29.shell;

/*
@Slf4j
@ShellComponent
@RequiredArgsConstructor
public class ZipAndUnzipInteraction {

    private final ZipAndUnzipService zipAndUnzipService;


    @ShellMethod(value = "Zip file", key = "zf")
    public void zip (
            @ShellOption({"-z", "--zip"}) String zip) {
        final ZipFile zipFile = new ZipFile(zip);
        zipFile.getFile();
        zipAndUnzipService.zip(zip);
        log.debug("Успешно архивирован файл {}", zip);
    }

    @ShellMethod(value = "Unzip file", key = "uzf")
    public void unzip (
            @ShellOption({"-uz", "--unzip"}) String unzip) {
        final ZipFile newZipFile = new ZipFile(unzip);
        newZipFile.getFile();
        zipAndUnzipService.unzip(unzip,unzip);
        log.debug("Успешно разархивирован файл {}", unzip);
    }

}
*/
