package PrepareForExam.Exam3;

public class Building {
    private String name;
    private Room[][] room;
    private int numberOfFloors;

    public Building(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
