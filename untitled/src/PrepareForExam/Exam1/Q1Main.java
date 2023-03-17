package PrepareForExam.Exam1;

public class Q1Main {

    public static void main(String[] args){
        AnInt m1 = new AnInt(12);
        m1.takeComplement();
        System.out.println(m1.getNumber());
//        ((AnInt) m1).getNumber();

        Complement m2 = new AnInt(12);
        m2.takeComplement();
        System.out.println(((AnInt)m2).getNumber());


        AString str1 = new AString("abcd xyz ABCD XYZ ?!");
        System.out.println("str1 before complement: " + str1.getStr());
        str1.takeComplement();
        System.out.println("str1 after complement: " + str1.getStr());



    }



}
