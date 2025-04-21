package prashant.module1;

public class Operators {
    static void operator(){
        int a = 10, b = 7;

        System.out.println(
            "\nAssignment operator" +
            " \nint x = 10");
            
        System.out.println(
            "\n\nArithmetic operators " +
            "\nValue of a = " + a +
            " Value of b = " + b +
            "\na + b = " + (a + b) +
            "\na - b = " + (a - b) +
            "\na * b = " + (a * b) +
            "\na / b = " + (a / b) +
            "\na % b = " + (a % b));                    

        System.out.println(
            "\n\nUnary operators" +
            "\nValue of a = " + a +
            " Value of b = " + b +
            "\na++ = " + (a++) +
            "\na-- = " + (a--) );
                            
        System.out.println(
            "\n\nLogical operators" +
            "\nValue of a = " + a +
            " Value of b = " + b +
            " \na && b [a>0 && b>0]= " + (a > 0 && b > 0) +
            "\na || b [a > 0 || b > 0]= " + (a > 0 || b > 0) +
            "\n!a [!(a > 0)]= " + !(a > 0));
                            
        System.out.println(
            "\n\nBitwise operators" +
            "\nValue of a = " + a +
            " Value of b = " + b +
            " \na & b = " + (a & b) +
            "\na | b = " + (a | b) +
            "\na ^ b = " + (a ^ b) +
            "\n~a = " + (~a));
                            
        System.out.println(
            "\n\nTernary operator" +
            "\nValue of a = " + a +
            " Value of b = " + b +
            " \na > b ? a : b = " + (a > b ? a : b));
                            
        System.out.println(
            "\n\nShift operators" +
            "\nValue of a = " + a +
            " Value of b = " + b +
            " \na << b = " + (a << b) +
            "\na >> b = " + (a >> b) );                    
                            
        System.out.println(
            "\n\nRelational operators" +
            "\nValue of a = " + a +
            " Value of b = " + b +
            "\na == b = " + (a == b) +
            "\na != b = " + (a != b) +
            "\na > b = " + (a > b) +
            "\na < b = " + (a < b) +
            "\na >= b = " + (a >= b) +
            "\na <= b = " + (a <= b));;
    }

    public static void main(String[] args) {
        operator();
    }
}