public class CWH_08_operators {
    public static void main(String[] args) {
        float a = 4;
        // //Arithimetic operator
        // float b =6-a;
        // float b = 6+a;
        // float b = 6*a;
        float b = 6 / a;
        System.out.println(b);
        int c = 4;
        int d = c % 3;// (%)is modular division operator.
        System.out.println(d);
        // comparison operator.-->
        System.out.println(6 == 8);// all are comparison operator.
        System.out.println(6 <= 8);// all are comparison operator.
        System.out.println(6 >= 8);// all are comparison operator.
        // Logical operator.-->
        System.out.println(64 > 5 && 64 > 8);//(AND OPERATOR).
        System.out.println(64 < 5 || 64 > 8);//(OR OPERATOR).
        // Bitwise Operator.
         System.out.println(2 & 3);// all are bitwise operator(BITWISE AND).
         System.out.println(2 | 3);// all are bitwise operator(BITWISE OR).
         System.out.println(2 ^ 3);// all are bitwise operator(XOR).
        //  Modulo operating with float and double.
        System.out.println(4.5f%2.23f);//(working on float).
        System.out.println(8.9%2.3);//(Working on double). // REturns decimal remainder.
    }
}
