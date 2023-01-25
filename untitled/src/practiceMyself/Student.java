package practiceMyself;

public class Student {
    String id;
    String firstname;
    String lastname;
    int[] scores;

    Student(){

    }

    public Student(String id , String firstname , String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }


    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int[] getScores() {
        return scores;
    }
    public void setScores(int[] scores){
        this.scores =scores;
    }

    public int getScore(int testNumber){
        return scores[testNumber];
    }

    public void setScore(int testNumber , int score){
        this.scores[testNumber] = score;
    }

    public int totalScore(){
        int total = 0;
        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        return total;
    }

    public String toString(){
        return "Student[id = " + id + ", firstname = " + firstname + ", lastname = " + lastname + ", scores = " + scores + "]";
    }
}

//    getFirstname(): String
//        + setFirstname(firstname: String): Void
//        + getLastname(): String
//        + setLastname(lastname: String): Void +
//        getScores(): int[]
//        + setScores(scores: int[]): Void
//        + getScore(testNumber: int): int
//        + setScore(testNumber: int, score: int): boolean + totalScore(): int
//        + toString(): String
