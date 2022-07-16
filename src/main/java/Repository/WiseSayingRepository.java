package Repository;

import domain.WiseSaying;

import java.util.ArrayList;
import java.util.List;

/*
스스로 구현해보기
 */
public class WiseSayingRepository {

    private int wiseSayingLastId = 0;
    private List<WiseSaying> wiseSayingList = new ArrayList<>();

    public int save(String content, String author) {
        WiseSaying wiseSaying = new WiseSaying(++wiseSayingLastId, content, author);
        wiseSayingList.add(wiseSaying);
        return wiseSaying.id;
    }

    public List<WiseSaying> findAll() {
        return wiseSayingList;
    }
}
