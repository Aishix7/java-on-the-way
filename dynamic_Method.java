class A{
    public void show(){
        System.out.println("In class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}
class C extends B{
    public void show(){
        System.out.println("In class C");
    }
}
public class dynamic_Method {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
}
