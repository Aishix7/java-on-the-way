public class tryCatch {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        try{
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Finally block is used to close the resource");
        }
    }
}
