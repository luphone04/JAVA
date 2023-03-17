package PrepareForExam.Exam2;

public class EnAMessage extends Message implements ICipher {

    public EnAMessage(String message) {
        super(message);
    }

    @Override
    public void printGoodFormat() {
        System.out.println("Encryption A: " + getMessage());
    }
    public void printModifiedFormat() { // this could be an abstract method in its superclass
        System.out.println("EnA after modification: " + getMod_message());
    }

    @Override
    public void encrypt() {
        String str = "";
        char[] strchar = getMessage().toCharArray();
        for(int i = strchar.length - 1; i >= 0 ; i--){
            str += strchar[i];
        }
        setMod_message(str);
    }
}
