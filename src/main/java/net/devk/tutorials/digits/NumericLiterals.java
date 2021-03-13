package net.devk.tutorials.digits;

/**
 * @since 1.7
 */
public class NumericLiterals {

  public static final int AN_INTEGER_DIGIT_IN_BINARY = 0b0101_1101_0101_0010_1011_1010_1001;

  public static final int AN_INTEGER_DIGIT_WITH_SEPARATOR = 2_123_456;

  public static final double A_DOUBLE = 3.1415_9265;
  public static final float A_FLOAT = 3.14_15_92_65f;



  public static void main(String[] args) {
    System.out.println(AN_INTEGER_DIGIT_IN_BINARY);// 97,856,425
    System.out.println(AN_INTEGER_DIGIT_WITH_SEPARATOR);// 2123456

    // Some 32-bit 'int' literal values
    int anInt1 = 0b0101_0000_1010_0010_1101_0000_1010_0010;
    int anInt2 = 0b0011_1000;

    // An 8-bit 'byte' literal value. By default, literal values are 'int'.
    // Need to cast to 'byte'
    byte aByte = (byte) 0b0110_1101;

    // A 16-bit 'short' literal value
    short aShort = (short) 0b0111_0101_0000_0101;

    // A 64-bit 'long' literal value. Long literals requires suffix "L".
    long aLong = 0b1000_0101_0001_0110_1000_0101_0000_1010_0010_1101_0100_0101_1010_0001_0100_0101L;

    // Formatted output: "%d" for integer in decimal, "%x" in hexadecimal, "%o" in octal.
    // Take note that "%b" prints true or false (for null), NOT binary.
    System.out.printf("%d(%x)(%o)(%b)\n", anInt1, anInt1, anInt1, anInt1);
    System.out.printf("%d(%x)(%o)(%b)\n", aByte, aByte, aByte, aByte);


  }


}
