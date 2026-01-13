package day9;

public class StringVsStringBuilderVsStringBuffer {
    public static void main(String[] args) {

//        String - immutable  - cannot change

        String s = "welcome";
        s.concat("to java");

        System.out.println(s);  // welcome
        System.out.println(s.concat(" to java"));  // welcome

//        StringBuffer  - mutable - can change
        StringBuffer stringBuffer = new StringBuffer("welcome");
        stringBuffer.append(" to java");
        System.out.println("stringBuffer = " + stringBuffer);

//        StringBuilder - mutable - can change
        StringBuilder stringBuilder = new StringBuilder("welcome");
        stringBuilder.append(" to java");
        System.out.println("stringBuilder = " + stringBuilder);


    }

}
