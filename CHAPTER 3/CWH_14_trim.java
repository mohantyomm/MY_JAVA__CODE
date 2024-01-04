public class CWH_14_trim {
    public static void main(String[] args) {
        String nontrimmedstring = "   chiku   ";
        System.out.println(nontrimmedstring);
        // System.out.println(nontrimmedstring.trim());//This is also workable
        String trimmed = nontrimmedstring.trim();
        System.out.println("After trimming : ");
        System.out.println(trimmed);
    }
    
}
// basicaly what happens when we use trim()
// it removes all spaces from the string then tell us

