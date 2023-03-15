package OldQusetion;

public class HiddenInt implements ICipher{
    int number;
    public HiddenInt(int number){
        this.number = number;
    }

    public void setNumber(int n){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public void encrypt() {

    }
}
