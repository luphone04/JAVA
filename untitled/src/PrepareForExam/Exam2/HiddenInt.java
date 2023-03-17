package PrepareForExam.Exam2;

public class HiddenInt implements ICipher{

    private int number;
    private String encrypted_out;

    public HiddenInt() {

    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getnumber(){
        return number;
    }

    public String getEncrypted_out() {

        return encrypted_out;
    }

    public void setEncrypted_out(String encrypted_out) {
        this.encrypted_out = encrypted_out;
    }
    @Override
    public void encrypt() {
        String out = Integer.toBinaryString(getnumber());
        setEncrypted_out(out);
    }
}
