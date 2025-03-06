import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator2 calculator2 = new Calculator2();


        System.out.println("=========");
        System.out.println("==계산기==");
        System.out.println("=========");

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            sc.nextLine();

            System.out.print("연산자를 입력하세요(+, -, *, /, %): ");
            String operator = sc.nextLine();

            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            double result = 0;
            if (operator.equals("+")) {
                 result = calculator2.plus(num1, num2);
            } else if (operator.equals("-")) {
                 result = calculator2.minus(num1, num2);
            }else if (operator.equals("*")) {
                 result = calculator2.multi(num1, num2);
            }else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("나눗셈에서는 0으로 나눌 수 없습니다.");
                    continue;
                }
                 result = calculator2.div(num1, num2);
            }else if (operator.equals("%")) {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }
                 result = calculator2.rest(num1, num2);
            } else {
                System.out.println("잘못된 값을 입력하셨습니다.");
            }
            System.out.print("결과: [");
            for (Double res : calculator2.getResultNums()) {
                System.out.print(res + ", ");
            }
            System.out.println("]");

                System.out.print("더 계산하시겠습니까?(Y/N), 첫번째 결과값을 지우시겠습니까?(R)");
                String answer = sc.nextLine();

                if (answer.equals("Y")) {
                }else if (answer.equals("R")) {
                    calculator2.removeResult();
                    System.out.print("결과: [");
                    for (Double res : calculator2.getResultNums()) {
                        System.out.print(res + ", ");
                    }
                    System.out.println("]");
                } else if (answer.equals("N")) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다");
                }
                break;
        }
    }
}