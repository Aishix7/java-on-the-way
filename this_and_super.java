class A{
    public A(){
        System.out.println("In default A");
    }
    public A(int n){
        System.out.println("In parameterized A");
    }
}
class B extends A{
    public B(){
        System.out.println("In default B");
    }
    public B(int n){
        System.out.println("In parameterized B");
    }
}
public class this_and_super {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(5);
    }
}
