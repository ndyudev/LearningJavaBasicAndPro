package FPT;

public class Conversion {
    public static void main(String[] args) {
        // Decimal to Binary
        System.out.println("112 (10) to Binary: " + Integer.toBinaryString(112));
        System.out.println("155 (10) to Binary: " + Integer.toBinaryString(155));

        // Binary to Decimal
        System.out.println("111001111 (2) to Decimal: " + Integer.parseInt("111001111", 2));
        System.out.println("100011001 (2) to Decimal: " + Integer.parseInt("100011001", 2));

        // Decimal to Octal
        System.out.println("14071 (10) to Octal: " + Integer.toOctalString(14071));
        System.out.println("20202 (10) to Octal: " + Integer.toOctalString(20202));

        // Octal to Decimal (Sử dụng số hợp lệ)
        System.out.println("473 (8) to Decimal: " + Integer.parseInt("473", 8));
        System.out.println("1275 (8) to Decimal: " + Integer.parseInt("1275", 8));
    }
}
