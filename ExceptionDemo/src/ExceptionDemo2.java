public class ExceptionDemo2 {

    public static void main(String[] args) {

        int i = 0;
        int j = 2;

        try {
            throw new RuntimeException("I am here", new NullPointerException());
            //int z= j/i;
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());

        }

    }
}
