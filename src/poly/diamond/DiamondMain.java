package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
        InterfaceA b = new Child();
        b.methodA();
        b.methodCommon();
    }
}
