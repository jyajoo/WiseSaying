import java.util.List;
import java.util.Scanner;

/*
스스로 구현해보기
 */
public class WiseSayingController {

    private final Scanner sc;
    private final WiseSayingService wiseSayingService = new WiseSayingService();

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }

    public void save() {
        System.out.print("명언 ) ");
        String content = sc.nextLine().trim();
        System.out.print("작가 ) ");
        String author = sc.nextLine().trim();

        int id = wiseSayingService.save(content, author);
        System.out.println(id + "번 명언이 등록되었습니다.");
    }

    public void findAll() {
        List<WiseSaying> wiseSayingList = wiseSayingService.findAll();
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for (int i = wiseSayingList.size() - 1; i >= 0; i--) {
            WiseSaying wiseSaying = wiseSayingList.get(i);
            System.out.printf("%d / %s / %s\n", wiseSaying.id, wiseSaying.author, wiseSaying.content);
        }
    }

    public void remove(Rq rq) {
        WiseSaying wiseSaying = getWiseSaying(rq);
        if (wiseSaying == null) {
            return;
        }
        wiseSayingService.remove(wiseSaying);
        System.out.printf("%d번 명언이 삭제되었습니다.\n", wiseSaying.id);
    }

    private WiseSaying getWiseSaying(Rq rq) {
        int id = rq.getIntParam("id", 0);
        WiseSaying wiseSaying = wiseSayingService.findById(id);

        if (wiseSaying == null) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", id);
            return null;
        }
        return wiseSaying;
    }

    public void modify(Rq rq) {
        WiseSaying wiseSaying = getWiseSaying(rq);

        if (wiseSaying == null) {
            return;
        }
        System.out.print("명언 ) ");
        String content = sc.nextLine().trim();
        System.out.print("작가 ) ");
        String author = sc.nextLine().trim();

        wiseSayingService.modify(wiseSaying, content, author);
        System.out.printf("%d번 명언이 수정되었습니다.\n", wiseSaying.id);
    }
}
