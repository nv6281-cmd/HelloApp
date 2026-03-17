public class HelloAppUC5 {
    public static void main(String[] args) {

        String message;

        // Check if no arguments
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            // Use StringBuilder + enhanced for loop
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            message = "Hello, " + names + "!";
        }

        System.out.println(message);
    }
}