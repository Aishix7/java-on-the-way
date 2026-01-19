import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ScannerR {
    public static void main(String[] args) throws IOException {

        System.out.println("ENTER A NUMBER: ");
        // int num = System.in.read(); METHOD 1 before java 1.5


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in); 
        // int num = Integer.parseInt(bf.readLine());  METHOD 2 before java 1.5
        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        System.out.println(num);

        
    }
}
