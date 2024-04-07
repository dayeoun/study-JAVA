public static void main(String[] args) {
    // 주어진 숫자의 10번째 약수를 찾는다.
    int result = function(3050, 10);
    // 결과가 -1이면 주어진 숫자의 10번째 약수가 없음을 알린다.
    if (result == -1) {
        System.out.println("3050의 10번째 약수는 없습니다");
    } else {
        // 결과를 출력한다.
        System.out.println("3050의 10번째 약수는: " + result);
    }
}

public static int function(int number, int k) {
    // 주어진 숫자의 약수를 탐색한다.
    for (int i = 1; i <= number; i++) {
        // 현재 숫자 i가 주어진 숫자의 약수인지를 확인한다.
        if (number % i == 0) {
            // 약수를 찾았으므로 k 값을 감소시킨다.
            k--;
            // k가 0이 되면 찾고자 하는 약수를 찾은 것이므로 해당 값을 반환한다.
            // 10 9 8 7 6 5 4 3 2 1 0 -> 10번째 값을 찾기위한 카운트
            // 3050%2==0 3050%5==0 3050%10==0 ....3050%50==0
            if (k == 0) {
                return i;
            }
        }
    }
    // 반복문을 빠져나왔지만 k번째 약수를 찾지 못한 경우 -1을 반환한다.
    return -1;
    //10번째 최대공약수가 없다는 의미
}