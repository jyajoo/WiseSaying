import java.io.*;
import java.util.Scanner;

public class TestUtil {

    /*
    문자열을 입력으로 하는 Scanner 생성
     */
    public static Scanner genScanner(String in) {
        ByteArrayInputStream input = new ByteArrayInputStream(in.getBytes());
        return new Scanner(input);
    }

    /*
    출력(System.out)이 특정 ByteArray를 가리킴
     */
    public static ByteArrayOutputStream setOutByteArray() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        return output;
    }

    /*
    출력(System.out)이 다시 제자리를 가리킴
     */
    public static void clearSetOutByteArray(ByteArrayOutputStream output) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
