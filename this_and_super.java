class A{
    // public A(){
    //     super();
    //     System.out.println("In default A");
    // }
    // public A(int n){
    //     super();
    //     System.out.println("In parameterized A");
    // }
}
class B extends A{
    public B(){
        // super();
        System.out.println("In default B");
    }
    public B(int n){
        // super(n);
        this();
        System.out.println("In parameterized B");
    }
}
public class this_and_super {
    public static void main(String[] args) {
        B obj = new B(5);
        // B obj1 = new B(5);
    }
}
