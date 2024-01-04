public class CWH_14_replace {
    public static void main(String[] args) {
       String name ="chiku";
       System.out.println(name.replace('c','M'));//This also work
       String name1 = name.replace("ch","Mi");
       System.out.println(name1);
       String name2=name.replace("ch","p" );
       System.out.println(name2);
       String name3 = name.replace("i", "ut");
       System.out.println(name3);
    }
}
// It replace old character with new character.
