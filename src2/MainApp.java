package src2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LiveScoreBean liveScore = new LiveScoreBean();

        // สร้าง Subscriber อย่างน้อย 2 คน
        Subscriber sub1 = new Subscriber("Subscriber 1");
        Subscriber sub2 = new Subscriber("Subscriber 2");

        // ลงทะเบียน Listener
        liveScore.addPropertyChangeListener(sub1);
        liveScore.addPropertyChangeListener(sub2);

        // รับ input จากผู้ใช้
        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Exiting...");
                break;
            }

            liveScore.setScoreLine(input); // เปลี่ยนค่า scoreLine → fire property change
        }

        scanner.close();
    }
}
