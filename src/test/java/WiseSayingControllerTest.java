import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WiseSayingControllerTest {

    @Test
    void 등록_출력_테스트() {
        String rs = AppTestRunner.run("""
                등록
                삶이 있는 한 희망은 있다.
                키케로
                """);

        assertTrue(rs.contains("명언 ) "));
        assertTrue(rs.contains("작가 ) "));
    }

    @Test
    void 등록_번호_출력_테스트() {
        String rs = AppTestRunner.run("""
                등록
                삶이 있는 한 희망은 있다.
                키케로
                등록
                나에게 불가능이란 없다.
                나폴레옹
                """);

        assertTrue(rs.contains("1번 명언이 등록되었습니다."));
        assertTrue(rs.contains("2번 명언이 등록되었습니다."));
    }
}