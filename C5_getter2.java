package Train240309;

public class C5_getter2 {
    // 정의
    static class Person {
        private String name;
        private String phoneNumber;

        // 생성자
        public Person(String x, String y) {
            name = x;
            phoneNumber = y;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

    public static void main(String[] args) {
        // 객체 생성
        Person park = new Person("다연", "010-2314-5567");

        // 필드값 출력
        System.out.printf("이름 : %s\n", park.getName());
        System.out.printf("전화번호 : %s\n", park.getPhoneNumber());
    }
}