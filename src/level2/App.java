package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // level2.Calculator 객체 생성

        Scanner sc = new Scanner(System.in);

        while(true){ // 무한으로 반복
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int first_num = sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            int second_num = sc.nextInt();


            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0); // sc 스캐너에서 값을 받은 0번째 글자

            calculator.calculate(first_num, second_num, operator);
            // calculator 클래스에 calculate 메서드의 매개변수에 값을 입력하면 계산이 된 결과가 result에 저장

            System.out.println("결과는 : " + calculator.getResult());

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String textGuide = sc.next(); // 입력받을 변수

            if(textGuide.equals("exit")){ // exit를 입력한다면, 반복문 종료
                break;
            } else if(textGuide.equals("remove")){
                calculator.removeResult();
                System.out.println("결과는 : " + calculator.result);
            }
        }
    }

}
