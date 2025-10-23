public class protectedAM {

    protected int num = 10;

    public void show(){
        System.out.println("from same class: " + num);
    }
    public static void main(String[] args) {
        protectedAM p = new protectedAM();
        p.show();
    }
}
// protected works well within same class