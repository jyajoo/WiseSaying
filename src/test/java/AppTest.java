import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void 테스트() {
        int rs = 10 + 20;
        assertEquals(30, rs);
    }

    @Test
    void 종료_스캐너_테스트() {
        String in = """
                종료
                """;
        Scanner sc = TestUtil.genScanner(in);
        String rs = sc.nextLine();
        assertEquals("종료", rs);
    }

    @Test
    void 출력_테스트() {
        ByteArrayOutputStream output = TestUtil.setOutByteArray();
        System.out.print("테스트");
        String rs = output.toString();
        TestUtil.clearSetOutByteArray(output);
        assertEquals("테스트", rs);
    }

    @Test
    void 시작_문구() {
        String rs = AppTestRunner.run("");
        assertTrue(rs.contains("== 명언 SSG =="));
        assertTrue(rs.contains("명령 ) "));
    }
}