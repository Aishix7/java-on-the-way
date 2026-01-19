import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKeyword {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int num = 0;
        BufferedReader br = null;
        try{
            InputStreamReader rd = new InputStreamReader(System.in);
            br = new BufferedReader(rd);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
        }
    }
}


// shortcut exists - "try with resources" automatically closes with closable class

// int num = 0;
// try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//     num = Integer.parseInt(br.readLine());
//     System.out.println(num);
// }