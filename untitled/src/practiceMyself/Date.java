package practiceMyself;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        if(getDay() >0 && getDay() < 10 && getMonth() > 0 && getMonth() < 10){
            return "0" + day + "/" + "0" + month + "/" + year;
        }else if(getDay() > 0 && getDay() < 10) {
            return "0" + day + "/" + month + "/" + year;
        }else if(getMonth() > 0 && getMonth() < 10){
            return day + "/" + "0" + month + "/" + year;
        }
        return day + "/" + month + "/" + year;
    }
}
