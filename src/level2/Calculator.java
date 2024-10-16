package level2;

import java.util.LinkedList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    // ArrayList는 배열처럼 일렬로 데이터 저장/조회 - 필요할 때마다 크기 늘어남
    LinkedList<Integer> result = new LinkedList<>();
    int total = 0;

    // 연산 기호와 양의 정수를 매개변수로 받아 사칙연산 기능 수행
    // 나눗셈을 할 경우를 대비해 double
    public void calculate(int firstNumber, int secondNumber, char operator) {
        /* 사칙연산 기능 수행 */
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
                if (secondNumber == 0) {
                    // secondNumber의 값이 0이 입력될 수 없음 -> secondNumber의 값이 0이되면 제어문 종료
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                    // 0으로 했을 시 제어문 종료 + 컬렉션에 값 추가되면 안됨
                }
                total = firstNumber / secondNumber;
                break;

            default:
                // 사칙연산 기호 4가지를 제외하고 입력했을 경우
                break;
        }
        this.result.add(total);
        // class 안에 있기 때문에, this 생성자 사용
        // result에 total 값 넣어주기
        // 값을 추가하는 코드
    }

//    // 연산 결과를 저장하는 컬렉션 타입 필드(=클래스에 포함된 컬렉션 타입 변수)
//    public void addResult(Integer resultValue) {
//        // result는 <Integer>의 반환타입을 가지고 있으니, 매개변수도 Integer 반환타입을 갖는다.
//        // resultValue값을 result에 넣는다.
//        result.add(resultValue);
//    }

    // 값을 반환하는 메서드
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

