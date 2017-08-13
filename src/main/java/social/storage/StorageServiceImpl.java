package social.storage;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
public class StorageServiceImpl implements StorageService{
    @Override
    public void store(MultipartFile file) {
        try {
            Files.copy(file.getInputStream(), new File("/tmp/upload").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
