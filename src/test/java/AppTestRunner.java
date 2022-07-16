import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {
    public static String run(String input) {
        input += "\n종료";   // 종료 자동화

        /*
        - 문자열을 입력으로 하는 Scanner 생성
        - 출력(System.out)이 특정 ByteArray를 가리킴
        - 출력(System.out)이 다시 제자리를 가리킴
         */
        Scanner sc = TestUtil.genScanner(input);

        ByteArrayOutputStream output = TestUtil.setOutByteArray();
        new App(sc).run();  // App 실행

        String rs = output.toString();

        TestUtil.clearSetOutByteArray(output);
        return rs;
    }
}
