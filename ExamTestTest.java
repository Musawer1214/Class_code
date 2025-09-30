import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExamTestTest {
    public static void main(String[] args) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured));
        try {
            examTest.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String expected = "Hello, World!" + System.lineSeparator();
        String actual = captured.toString();
        if (!expected.equals(actual)) {
            String expectedEscaped = expected.replace("\r", "\\r").replace("\n", "\\n");
            String actualEscaped = actual.replace("\r", "\\r").replace("\n", "\\n");
            throw new AssertionError("Expected output \"" + expectedEscaped + "\" but got \"" + actualEscaped + "\"");
        }

        System.out.println("Test passed.");
    }
}
