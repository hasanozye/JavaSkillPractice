package day12;

public class PassingParamsToMainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
        System.out.println("Number of argumetns in array :" + args.length);
    }
}
