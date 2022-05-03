package lesson29.service.impl;

import lesson29.service.ZipAndUnzipService;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@Service
public class ZipAndUnzipImpl implements ZipAndUnzipService {

    private static final String ZIP = ".zip";

    @Override
    public Optional<String> zip(String source) {
        final File file1 = new File(source);
        final String newZipFileName = FilenameUtils.removeExtension(source) +ZIP;
        try (final ZipFile zipFile = new ZipFile(file1.getParent() + File.separator + FilenameUtils.getName(newZipFileName))){
            if (file1.isFile()) {
                zipFile.addFile(source);
            } else {
                zipFile.addFolder(file1);
            }
        } catch (IOException io) {
            System.out.printf("Возникли проблемы во время архивирования файла %s" + source);
        }
        return Optional.of(newZipFileName);
    }


    @Override
    public Optional<String> unzip(String file, String source) {
        final ZipFile zipFile = new ZipFile(source);
        final String parent = new File(source).getParent();
        try {
            zipFile.extractAll(parent);
        } catch (ZipException zipException) {
            System.out.printf("Возникли проблемы во время разархивирования файла %s" + source);
        }
        return Optional.of(parent);
    }
}
