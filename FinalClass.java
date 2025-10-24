final class Main{
  public int add(int n1, int n2){
    return n1 + n2;
  }
  public int sub(int n1, int n2){
    return n2 - n1;
  }
}
public class FinalClass // extends Main  : here we can see error as we cannot extend a final class
 {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();

        System.out.println();// f.add(2,3) + " : " + f.sub(2,3));  error occurs here as well since we are not able to access the parent class data
    }
}
// here class is being accessed by another class , child class has access to all the data.

// what if we do not want the child class or any other class to get access to our data? then we can have final keyword for class as well. 