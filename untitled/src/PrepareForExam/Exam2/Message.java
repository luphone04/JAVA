package PrepareForExam.Exam2;

public abstract class Message {
    private String message;


    private String mod_message;

    public Message(String message) {
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public abstract void printGoodFormat();


    public String getMod_message() {
        return mod_message;
    }

    public void setMod_message(String mod_message) {
        this.mod_message = mod_message;
    }

}
