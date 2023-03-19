package No9;

public abstract class Message {
    private String message;
    public Message(String message){
        this.message = message;
    }
    public abstract void printGoodFormat();
}


