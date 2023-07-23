public class ThrowableGetCause {

    public static void main(String[] args) throws Exception {
        try {
            myException();
        } catch(Exception e) {
            System.out.println("Cause = " + e.getCause());
        }
    }
    public static void myException() throws Exception {
        int arr[] = {1, 3, 5};
        try {
            System.out.println(arr[8]);
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            // e.initCause(aiobe); // supplies the cause to getCause()
            throw(new Exception(aiobe));
        }
    }
}

