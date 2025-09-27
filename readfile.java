import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class readfile {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("C:\\Users\\Musawer-Hussain\\OneDrive\\Desktop\\Class_code\\test.txt");

        
        System.out.println("Before write:\n" + Files.readString(file));

        
        Files.writeString(file, "\nThis is the new line written by code to the test file", StandardOpenOption.APPEND);

        
        System.out.println("\nAfter write:\n" + Files.readString(file));
    }
}
