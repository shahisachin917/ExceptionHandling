public class CustomExceptions {

    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-1);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            //try {
                throw new AgeLessThanZeroException("Oh no! Age has to be more than zero",new RuntimeException());
//            } catch (AgeLessThanZeroException e) {
//                System.out.println(e.getMessage());
//            }
        }
    }
}
