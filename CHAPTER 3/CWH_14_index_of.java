public class CWH_14_index_of {
    public static void main(String[] args) {
        String name = "chiku";
        System.out.println(name.indexOf("i"));//the first index in which given character is present will return.
        System.out.println(name.indexOf("i",3));//from idex given it means after index 3 it will search if not match after
        // the given index it will return (-1).
        System.out.println(name.indexOf("c", 2));//just like this -1 will return 
    }
}
