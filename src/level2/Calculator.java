package level2;

import java.util.LinkedList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    // LinkedList는 배열처럼 일렬로 데이터 저장/조회 - 필요할 때마다 크기 늘어남

    private final LinkedList<Integer> result = new LinkedList<>();
    int total = 0;

    // 연산 기호와 양의 정수를 매개변수로 받아 사칙연산 기능 수행
    // 나눗셈을 할 경우를 대비해 double
    public void calculate(int firstNumber, int secondNumber, char operator) {
        // 사칙연산 기능 수행
        switch (operator) { // 사칙연산 기호 기준
            case '+':
                total = firstNumber + secondNumber;
                break;

            case '-':
                total = firstNumber - secondNumber;
                break;

            case '*':
                total = firstNumber * secondNumber;
                break;

            case '/':
                try {
                    // 0을 입력했을 때, 예외 발생
                    // ArithmeticException
                     total = firstNumber / secondNumber;
                } catch (ArithmeticException e) {
                    // 0을 입력했을 때 반복문 종료
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                break;

            default:
                // 다른 기호를 적었을 때
                System.out.println("사칙연산(+, -, *, /) 기호를 제대로 입력해주세요.");
                break;
        }
        this.result.add(total);
        // class 안에 있기 때문에, this 생성자 사용
        // result에 total 값 넣어주기
        // 값을 추가하는 코드
    }

    // 결과값을 반환하는 메서드
    // 객체의 필드 값을 가져오는 역할
    // 필드(result)는 클래스 내부에 숨겨두고, 외부에 접근 못하게 -> private 설정
    public LinkedList<Integer> getResult(){
        return result;
    }

    // void : 반환값 없어도 됨

    // 값을 제거하는 메서드
    public void removeResult() {
        // result(컬렉션)에 저장된 값 중 제일 첫번째 값을 삭제
      result.removeFirst();
    }
}

