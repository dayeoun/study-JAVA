package Train240309;

import java.util.Scanner;
//주로 많은 데이터를 처리시 자주 사용

public class E1_array2 {
    // max 메소드를 클래스 내부로 이동
    public static int max(int a, int b) {
        return (a>b) ? a: b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열의 크기를 입력해라: "); // 오타 수정
        
        int number = scanner.nextInt();
        int[] array = new int[number];
        
        System.out.println("배열의 각 요소에 대한 값을 입력해라: "); // 배열 요소 입력 안내 메시지 추가
        for(int i = 0; i<number; i++) {
            array[i] = scanner.nextInt(); // 배열 요소 입력 받기
        }

        int result = -1;
        for(int j = 0; j<number; j++) { // 반복 변수명 변경
            result = max(result, array[j]);
        }
        System.out.println("입력한 목표점수 중에서 가장 큰 값은 " + result + "입니다");
    }
}