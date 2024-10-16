import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while(true){ // 무한으로 반복
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int first_num = sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            int second_num = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char sign = sc.next().charAt(0); // sc 스캐너에서 값을 받은 0번째 글자

            int result;
            switch (sign){
                case '+':
                    result = calculator.add(first_num, second_num);
                    System.out.println("결과 : " + result);
                    break;

                case '-':
                    result = calculator.subtract(first_num, second_num);
                    System.out.println("결과 : " + result);
                    break;

                case '*':
                    result = calculator.multiply(first_num, second_num);
                    System.out.println("결과 : " + result);
                    break;

                case '/':
                    if (second_num == 0){ // num2의 값이 0이 입력될 수 없음 -> num2의 값이 0이되면 제어문 종료
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = calculator.division(first_num, second_num);
                    System.out.println("결과 : " + result);
                    break;

                default:
                    System.out.println("잘 못 입력하였습니다."); // +,-,*,/ 제외한 사칙연산 입력 시
                    break;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String exit = sc.next(); // 입력받을 변수
            if(exit.equals("exit")){ // exit를 입력한다면, 반복문 종료
                break;
            }
        }
    }

}
