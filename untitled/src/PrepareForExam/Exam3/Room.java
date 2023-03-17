package PrepareForExam.Exam3;

public class Room {
    private String roomNumber;
    private int roomType;
    private Boolean isVacant;
    public static int STANDARD = 1;
    public static int DELUX = 2;
    public static int SUITE = 3;

    public Room(){

    }

    public Room(String roomNumber, int roomType){
        this.roomNumber=  roomNumber;
        this.roomType = roomType;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }
    public void setRoomType(int roomType){
        this.roomType = roomType;
    }

    public int getRoomType(){
        return roomType;
    }

    public boolean isVacant(){
        return isVacant;
    }

 





}
