package pkg_strings;

public class StringRef {
    public static void main(String[] args)
    {
        String s1 = "Hello"; // String literal
        String s2 = "Hello"; // String literal
        String s3 = s1; // same reference
        String s4 = new String("Hello"); // String object
        String s5 = new String("Hello"); // String object

        if(s1 == s1){
            System.out.println("s1 == s1 True");
        }
        if(s1 == s2){
            System.out.println("s1 == s2 True");
        }
        if(s1 == s3){
            System.out.println("s1 == s3 True");
        }
        if(s1.equals(s3)){
            System.out.println( "s1.equals(s3) True");
        }
        if(s1 == s4){
            System.out.println("s1 == s4 True");
        }
        if(s1.equals(s4)){
            System.out.println(" s1.equals(s4) True");
        }
        if(s4 == s5){
            System.out.println("s4 == s5 true");
        }
        if(s4.equals(s5)){
            System.out.println("s4.equals(s5) True");
        }
    }
}
