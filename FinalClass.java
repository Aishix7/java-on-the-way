class Main{
  public int add(int n1, int n2){
    return n1 + n2;
  }
  public int sub(int n1, int n2){
    return n2 - n1;
  }
}
public class FinalClass extends Main {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();

        System.out.println(f.add(2,3) + " : " + f.sub(2,3));
    }
}
// here class is being accessed by another class , child class has access to all the data.
