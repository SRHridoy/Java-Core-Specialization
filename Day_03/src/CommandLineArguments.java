public class CommandLineArguments {
    public static void main(String[] args) {
        int sum = 0, avg;
        for (String arg : args) {
            sum = sum + Integer.parseInt(arg);
        }
        avg = sum/args.length;
        System.out.println(avg);
    }
}
