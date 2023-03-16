package PrepareForExam.Composition;
import java.util.ArrayList;
import java.util.List;
class Classroom {
    String roomName;

    public Classroom(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}

class School {
    List<Classroom> classrooms;

    public School() {
        classrooms = new ArrayList<>();
    }

    public void addClassroom(String roomName) {
        Classroom classroom = new Classroom(roomName);
        classrooms.add(classroom);
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }
}

class Main {
    public static void main(String[] args) {
        School mySchool = new School();
        mySchool.addClassroom("Room 101");
        mySchool.addClassroom("Room 102");

        for (Classroom classroom : mySchool.getClassrooms()) {
            System.out.println(classroom.getRoomName());
        }
    }
}

