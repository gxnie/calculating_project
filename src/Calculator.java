public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성

//    public int 반환타입(...매개변수){
        // 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후
        // 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
//    }

    // 더하기
    public int add(int first_num, int second_num){
        return first_num + second_num;
    }

    // 빼기
    public int subtract(int first_num, int second_num){
        return first_num - second_num;
    }


    // 곱하기
    public int multiply(int first_num, int second_num){
        return first_num * second_num;
    }


    // 나누기
    public int division(int first_num, int second_num){
        return first_num / second_num;
    }
}

