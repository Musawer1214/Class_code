//Code 1a

// public class comparingstring {
//     public static void main(String[] args) {
//         String greeting = "Hello";

//         if (greeting == "Hello") {
//             System.out.println("Yes it is equal");
//         } else {
//             System.out.println("They are not equal");
//         }

//     }
    
// }
//Code 1b
// public class comparingstring {
//     public static void main(String[] args) {
//         String greeting = "Hello";

//         "Hello".equalsIgnoreCase(greeting);



//     }
    
// }
//The result of this one will not be equal 

// import java.util.*;
// public class cmdImp {
//     public static void main (String[] args ) {


//         Scanner in = new Scanner("C:\Users\Musawer-Hussain\OneDrive\Desktop\Class_code\test"("test.txt"));

//         System.out.println(in);


//     }
// }


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class cmdImp {
    public static void main(String[] args) throws java.io.IOException {
        Path file = Path.of("C:\\Users\\Musawer-Hussain\\OneDrive\\Desktop\\Class_code\\test.txt");
        if (!Files.exists(file)) {
            System.err.println("File not found: " + file);
            return;
        }
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
        }
    }
}


