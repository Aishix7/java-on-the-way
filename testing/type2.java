package testing;
// public class type2 extends type1 {

//     public void display(){
//         System.out.println("dude the lights are out! but the num is : " + num);
//     }
//     public static void main(String[] args) {
//         type2 t = new type2();

//         t.display();
//     }
// }
// protected works for same package and subclass from above 

public class type2{
    public static void main(String[] args) {
        type1 t = new type1();

        System.out.println(t.num);
    }
}

// protected also above worked for same package and non subclass

