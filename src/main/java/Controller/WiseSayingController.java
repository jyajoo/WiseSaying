package Controller;

import Service.WiseSayingService;

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
}
