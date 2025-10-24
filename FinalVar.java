public class FinalVar {
    public static void main(String[] args) {
        int num = 10;
        num = 20;
        // we've changed the val of variable easily

        final int var = 10;
        // var = 20;
        // we cannot change the value of var, since it is final which is constant.
    }
}
// Final variable in java