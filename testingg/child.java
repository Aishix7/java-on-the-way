package testingg;
import testing.parent;
public class child extends parent{
    public void show(){
        System.out.println("Number is : " + val);
    }
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}
// from the above we can tell that protected works well with diff package subclass