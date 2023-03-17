package PrepareForExam.Exam2;

public class Q2Main {
    public static void main(String[] args){
        EnAMessage m1= new EnAMessage("Hello");
        m1.encrypt();
        System.out.println(m1.getMessage());
        m1.encrypt();
        m1.printGoodFormat();

        EnBMessage m2 = new EnBMessage("Hello");
        m2.encrypt();
        System.out.println(m2.getMessage());
        m2.printGoodFormat();


        HiddenInt m3 = new HiddenInt();
        m3.setNumber(12);
        System.out.println(m3.getnumber());
        m3.encrypt();
        System.out.print(m3.getEncrypted_out());

    }
}
