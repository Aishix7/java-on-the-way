class Copy{
    public void show(){
        System.out.println("Hithaishi");
    }
    public int add(int n1,int n2){
        return n1 + n2;
    }
}
public class FinalMethod extends Copy {
    public void show(){
        System.out.println("Donga");
    }
    
    public static void main(String[] args) {
        FinalMethod f = new FinalMethod();
        f.show();
        int sum = f.add(2,3);

        System.out.println("Sum : " + sum);
        
    }
}
