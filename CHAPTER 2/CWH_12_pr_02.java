public class CWH_12_pr_02 {
    public static void main(String[] args) {
         char grade = 'A';
        //  encrypting the grade by 8 
        grade = (char)(grade + 8);
        System.out.println("grade after encryption: "+grade);
        // now decrypting
        grade = (char) (grade - 8);
        System.out.println("Actual Grade after decrypting: "+grade);
    }
}
