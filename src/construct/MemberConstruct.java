package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        // this를 활용해 생성자 호출 가능, 생성자 코드의 맨 첫번째 줄에서 작동
        this(name, age, 50);
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade 고정 = " + 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
