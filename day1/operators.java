package day1;

public class operators {
    static void operator(){
        int a = 10, b = 7;
        System.out.println("\nAssignment operator =>" +
                            " \nint x = 10");

        System.out.println("\n\nArithmetic operators => " +
                            "Value of a = " + a +
                            " Value of b = " + b +
                            "\na + b = " + (a + b) +
                            "\na - b = " + (a - b) +
                            "\na * b = " + (a * b) +
                            "\na / b = " + (a / b) +
                            "\na % b = " + (a % b));                    

        System.out.println("\n\nUnary operators =>" +
                            " Value of a = " + a +
                            " Value of b = " + b +
                            "\na++ = " + (a++) +
                            "\na-- = " + (a--) );
                            
        System.out.println("\n\nLogical operators =>" +
                            " Value of a = " + a +
                            " Value of b = " + b +
                            " \na && b [a>0 && b>0]= " + (a > 0 && b > 0) +
                            "\na || b [a > 0 || b > 0]= " + (a > 0 || b > 0) +
                            "\n!a [!(a > 0)]= " + !(a > 0));
                            
        System.out.println("\n\nBitwise operators =>" +
                            " Value of a = " + a +
                            " Value of b = " + b +
                            " \na & b = " + (a & b) +
                            "\na | b = " + (a | b) +
                            "\na ^ b = " + (a ^ b) +
                            "\n~a = " + (~a));
                            
        System.out.println("\n\nTernary operator =>" +
                            " Value of a = " + a +
                            " Value of b = " + b +
                            " \na > b ? a : b = " + (a > b ? a : b));
                            
        System.out.println("\n\nShift operators =>" +
                            " Value of a = " + a +
                            " Value of b = " + b +
                            " \na << b = " + (a << b) +
                            "\na >> b = " + (a >> b) );                    
                            
        System.out.println("\n\nRelational operators =>" +
                            " Value of a = " + a +
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