package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 변수 선언
        Student student1;
        // 메모리에 실제 인스턴스 생성, 멤버 변수를 사용하는데 필요한 메모리도 함께 확보
        // new를 통해 객체가 생성되면 참조값(메모리 주소)을 반환 student1은 이 참조값을 가지고 있음
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);

    }
}
