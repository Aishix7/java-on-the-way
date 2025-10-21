public class constructorr {
    public static void main(String args[]){
        frankOcean fo = new frankOcean();
        // int val = fo.callOut();
        System.out.println("value before assignment is: " + fo.callOut());
        fo.assign(21);
        System.out.println("value after assignment is: " + fo.callOut());


        frankOcean fo1 = new frankOcean(21,"tasleem");
        System.out.println(fo1.callOut() + " : " + fo1.naamDo());
    }
}
class frankOcean{
    private int age;
    private String name;
    public frankOcean(){ // default constructor
        System.out.println("hey I am frank Ocean!");
        age = 18;
        name = "Surma";
    }
    public frankOcean(int a,String n){
        age = a;
        name = n;
    }
    public int callOut(){
        return age;
    }
    public String naamDo(){
        return name;
    }
    public void assign(int num){
        age = num;
    }
}