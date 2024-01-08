import java.util.Arrays;
import java.util.Scanner;

public class Ex3_1 {

    public static void main(String[] args) {
        Person[] person = new Person[10];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            person[i].age = 30 + i;
            System.out.println("person 배열 " + i + "번째 인덱스 위치에 저장된 Person 객체 " + (i + 1) + "의 age 변수값 = " + person[i].age);
        }

        System.out.println(Arrays.toString(person));

        Scanner sc = new Scanner(System.in);
        
        Persom[] peopleArray = new Persom[10];
        for (int i = 0; i < 10; i++) {
        	String name = sc.nextLine();
            Persom persom = new Persom("persom"+i, name); // 수정된 부분: 생성자에 name 추가
            peopleArray[i] = persom;
            System.out.println(persom.name);
        }

        
        
    }
}

class Person {
    String name;
    int age;

    String getName() {
        return name;
    }
}

class Persom {
    String name;

    public Persom(String initialName, String name) { // 생성자에 name 추가
        this.name = initialName;
        setName(name); // 생성자에서 setName을 통해 초기 이름 설정
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
