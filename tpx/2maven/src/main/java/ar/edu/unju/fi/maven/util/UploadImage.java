package ar.edu.unju.fi.maven.util;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.multipart.MultipartFile;

public class UploadImage {
    private final static String UPLOADS_FOLDER = "src/main/resources/static/uploads";

    public Path getPath(String filename) {
        return Paths.get(UPLOADS_FOLDER).resolve(filename).toAbsolutePath();
    }
    public Resource load(String filename) throws MalformedURLException {
        Path path = getPath(filename);
        Resource resource = new UrlResource(path.toUri());
        if (!resource.exists() || !resource.isReadable()) {
            throw new RuntimeException("Error in path: " + path.toString());
        }
        return resource;
    }
    public String copy(MultipartFile image) throws IOException {
        String uniqueFilename = UUID.randomUUID().toString() + "-" + image.getOriginalFilename();
        Path path = getPath(uniqueFilename);
        Files.copy(image.getInputStream(), path);
        return uniqueFilename;
    }
    public boolean delete(String filename) {
        Path path = getPath(filename);
        File file = path.toFile();
        if (file.exists() && file.canRead()) {
            file.delete();
            return true;
        }
        return false;
    }
}
