package Train240309;

public class C5_getter {
    static class Person {
        // 필드
        // private가 있어서 일반적으로 접근 불가능하다.
        private String name;
        private String phoneNumber;

        // 생성자
        public Person(String n, String p) {
            name = n;
            phoneNumber = p;
        }

        // getter를 추가하시오
        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

    public static void main(String[] args) {
        // 객체생성
        Person park = new Person("다연", "010-2314-5567");

        // 1) 함수 출력시, 함수에 get 붙이기
        System.out.printf("이름 : %s\n", park.getName());
        System.out.printf("연락처: %s\n", park.getPhoneNumber());
    }
	
		}
	


