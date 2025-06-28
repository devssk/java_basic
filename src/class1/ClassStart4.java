package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 타입의 참조값 보관하는 배열 생성
        Student[] students = new Student[2];
        // 자바의 대입은 변수에 들어있는 값 복사 -> 레퍼런스타입이기 때문에 참조값 복사
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

    }
}
