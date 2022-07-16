package Service;

import Repository.WiseSayingRepository;

/*
스스로 구현해보기
 */
public class WiseSayingService {

    private final WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();

    public int save(String content, String author) {
        return wiseSayingRepository.save(content, author);
    }
}
