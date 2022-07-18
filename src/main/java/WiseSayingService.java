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

    public WiseSaying findById(int id) {
        return wiseSayingRepository.findById(id);
    }

    public boolean remove(WiseSaying wiseSaying) {
        return wiseSayingRepository.remove(wiseSaying);
    }

    public boolean modify(WiseSaying wiseSaying, String content, String author) {
        return wiseSayingRepository.modify(wiseSaying, content, author);
    }
}
