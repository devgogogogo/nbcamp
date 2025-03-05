import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("신나는 계산기 만들기 ^^");
        System.out.println("====================================");

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요(나가기 : exit): ");
            int num1 = sc.nextInt();
            sc.nextLine();

            System.out.print("연산자를 입력하세요(+, -, *, /, %): ");
            String operator = sc.nextLine();

            System.out.print("두번째 숫자를 입력하세요(나가기 : exit): ");
            int num2 = sc.nextInt();
            sc.nextLine();

            int result = 0;

            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            }else if (operator.equals("*")) {
                result = num1 * num2;
            }else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("나눗셈에서는 0으로 나눌 수 없습니다.");
                    continue;
                }
                result = num1 / num2;
            }else if (operator.equals("%")) {
                result = num1 % num2;
            } else if (operator.equals("exit")) {
                break;
            } else {
                System.out.println("잘못된 값을 입력하셨습니다.");
            }

            System.out.println("결과값: " + result + "입니다.");
            System.out.print("더 계산하시겠습니까?: (Y/N)");
            String answer = sc.nextLine();

            if (answer.equals("Y")) {
            }else if (answer.equals("N")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }
    }
}
