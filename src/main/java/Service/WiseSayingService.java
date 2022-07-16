package Service;

import Repository.WiseSayingRepository;
import domain.WiseSaying;

import java.util.List;

/*
스스로 구현해보기
 */
public class WiseSayingService {

    private final WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();

    public int save(String content, String author) {
        return wiseSayingRepository.save(content, author);
    }

    public List<WiseSaying> findAll() {
        return wiseSayingRepository.findAll();
    }
}
