 
import java.util.Scanner;

public class MainApp_Event {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScoreSource scoreSource = new ScoreSource();

        // สร้างผู้ฟังอย่างน้อย 2 คน
        Subscriber subscriber1 = new Subscriber("Observer 1");
        Subscriber subscriber2 = new Subscriber("Observer 2");

        // ลงทะเบียน
        scoreSource.addScoreListener(subscriber1);
        scoreSource.addScoreListener(subscriber2);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Exiting...");
                break;
            }

            scoreSource.setScoreLine(input);
        }

        scanner.close();
    }
}
