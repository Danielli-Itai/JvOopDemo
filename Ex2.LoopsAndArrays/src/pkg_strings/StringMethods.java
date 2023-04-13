package pkg_strings;

public class StringMethods {
    public static void main(String[] args)
    {
        String abcdef = "abcdef";
        String cd = abcdef.substring(2,2);
        char b = abcdef.charAt(1);
        String c = abcdef.substring(2,3);
        int indexofc = abcdef.indexOf(c);
        System.out.println("cd is "+cd);
        System.out.println("b is "+b);
        System.out.println("c is "+c);
        System.out.println("indexofc is "+indexofc);
        return;
    }
}
