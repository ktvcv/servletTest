package demo.service;

import demo.model.File;
import demo.repo.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.util.Objects;

@Service
public class FileService {

    @Autowired
    private FileRepo fileRepo;

    public File store(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        Objects.requireNonNull(filename);
        String fileName = StringUtils.cleanPath(filename);
        File fileToDB = new File(fileName, file.getContentType(), file.getBytes());

        return fileRepo.save(fileToDB);
    }

    public File getFile(Integer id) {
        return fileRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
