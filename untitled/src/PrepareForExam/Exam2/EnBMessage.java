package PrepareForExam.Exam2;

public class EnBMessage extends Message implements ICipher {

    public EnBMessage(String message) {
        super(message);
    }

    @Override
    public void printGoodFormat() {
        System.out.println("Encyption B: " + getMessage());

    }

    public void printModifiedFormat() {
        System.out.println("EnB after modification: " + getMod_message());
    }





//    In Java, when you assign a char value to an int variable, the character is implicitly converted to its
//    corresponding integer value according to the Unicode character encoding. In this case, the Unicode value of the
//    character is the same as its ASCII value, because ASCII is a subset of Unicode.
//
//    So when you write ascii = c;, the character c is automatically converted to its Unicode (ASCII) value and stored
//    in the integer variable ascii. There is no need to explicitly call any method or function for this conversion.
//            The charAt() method is not responsible for the conversion; it only retrieves the character at the specified
//    index in the string.



//    When you write ascii = c;, the char value stored in the variable c is automatically converted to its
//    corresponding integer value (Unicode or ASCII) and then assigned to the integer variable ascii.
    @Override
    public void encrypt() {
        String out = "";
        char a ;
        int ascii;
        int new_ascii;

        for(int i = 0 ; i < getMessage().length(); i++){ //Hello
            a = getMessage().charAt(i); //H
            ascii = a; // //1001
            new_ascii = a + 2; //
            out+= (char)new_ascii;
        }
        setMod_message(out);

    }
}
