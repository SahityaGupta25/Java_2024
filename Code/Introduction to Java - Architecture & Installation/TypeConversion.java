class TypeConversion{
public static void main(String args[]) {

    //* Explicitly Conversion */

    int num1 = 500;
    byte num2 = (byte) num1;
    System.out.println(num2);

    float num3 = 5.7f;
    int num4 = (int)num3;
    System.out.println(num4);

    //* Implicitly Conversion */

    byte b = 77;
    int a = b;
    System.out.println(a);

    byte one = 55;
    byte two = 66;
    int result = one * two;
    //! Java promotes type conversions hassle-free
    System.out.println(result);
}   
}
