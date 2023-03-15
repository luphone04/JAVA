package OldQusetion;

public abstract class Message {
    private String message;
    public Message(String message){
        this.message = message;
    }

    public void setMessage(String m){
        this.message = m;
    }

    public String getMessage(){
        return message;
    }

    public abstract void printGoodFormat();

}
