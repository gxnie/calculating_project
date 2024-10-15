import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char sign = sc.next().charAt(0); // sc 스캐너에서 값을 받은 0번째 글자

            int result = 0;
            switch (sign){
                case '+':
                    result = num1 + num2;
                    System.out.println("결과 : " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("결과 : " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("결과 : " + result);
                    break;

                case '/':
                    if (num2 == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("결과 : " + result);
                    break;
                default:
                    System.out.println("잘 못 입력하였습니다.");
                    break;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String exit = sc.next();
            if(exit.equals("exit")){
                break;
            }
            continue;
        }

    }
}