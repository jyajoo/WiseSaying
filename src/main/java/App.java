import java.util.Scanner;

public class App {
    /*
    참고, 복붙 금지
     */

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 SSG ==");
        outer:
        while(true){
            System.out.print("명령 ) ");
            switch(sc.nextLine()){
                case "종료":
                    break outer;
            }
        }
    }
}
