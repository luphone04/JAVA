package PrepareForExam.Exam2;

public class GeneralMessage extends Message  {
    public GeneralMessage(String message){
        super(message);
    }

    @Override
    public void printGoodFormat() {
        System.out.println("General Message: " + getMessage());

    }
}
