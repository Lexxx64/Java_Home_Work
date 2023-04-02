package Lesson2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystemDemo {
    public static void main(String[] args) {
        Path path = Path.of("file.txt");
        String text = "TEXT".repeat(100);
        try {
                Files.writeString(path, text);
            } catch(IOException e){
            }
    }
}

