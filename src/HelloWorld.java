public class HelloWorld {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Hello, World!");
        } else {
            String s = "";
            for (String arg : args) {
                s += " " + arg;
            }
            System.out.println("Hello," + s + "!");
        }
    }
}
