package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {

        // 다운 캐스팅을 자동으로 하지 않는 이유
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();

    }
}
