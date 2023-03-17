package PrepareForExam.Exam1;

public class AnInt implements Complement {
    private int number;

    public AnInt(int number){
        this.number = number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }


    @Override
    public void takeComplement() {
        String temp = "";
        String temp2 = Integer.toBinaryString(number);
        for(int i = 0; i < temp2.length()  ; i++){
            char c = temp2.charAt(i);
            if(c == '0'){
                temp += 1;
            }else{
                temp += 0;
            }
        }

        int newint = Integer.parseInt(temp,2);
        setNumber(newint);
    }
}
