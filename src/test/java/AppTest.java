import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void 테스트() {
        int rs = 10 + 20;
        assertEquals(30, rs);
    }

    @Test
    void 종료_테스트() {
        String in = """
                종료
                """;

        Scanner sc = TestUtil.genScanner(in);
        String rs = sc.nextLine();
        assertEquals("종료", rs);
    }
}