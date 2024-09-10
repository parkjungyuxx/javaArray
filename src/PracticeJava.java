import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;


        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();
            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = input.nextLine();
                System.out.print("가격을 입력하세요: ");
                int price = input.nextInt();
                System.out.print("수량을 입력하세요: ");
                int quantity = input.nextInt();
                totalPrice += price * quantity;

            } else if (option == 2) {
                System.out.println("총 비용은 " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료.");
                break;
            } else {
                System.out.println("올바른 입력을 부탁");
            }

        }


        }

}
