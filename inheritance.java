class LeastPriceCakes extends HighCostCakes{
    public String type1(){
        return "Vanilla";
    }
    public String type2(){
        return "Butterscotch";
    }
}
public class inheritance {
    public static void main(String[] args) {
        // LeastPriceCakes lpc = new LeastPriceCakes();
        LeastPriceCakes least = new LeastPriceCakes();
        String val1 = least.type1();
        String val2 = least.type2();
        String val3 = least.Chocolate();
        String val4 = least.RasmalaiCake();

        System.out.println(val1 + " " + val2 + " " + val3 + " " + val4);
    }
}
