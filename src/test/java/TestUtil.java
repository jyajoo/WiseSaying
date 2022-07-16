import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TestUtil {

    /*
    문자열을 입력으로 하는 Scanner 생성
     */
    public static Scanner genScanner(String in) {
        ByteArrayInputStream input = new ByteArrayInputStream(in.getBytes());
        return new Scanner(input);
    }


}
