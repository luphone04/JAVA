package PrepareForExam.Association;

import java.util.*;
//Because the two class establish a relationship, this is association
//This relationship is "ONE TO MANY" as state associae with multiple CityClass objects
class CityClass {

    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    @Override
    public String toString() {
        return cityName;
    }
}

class State {

    private String stateName;

    List<CityClass> citys; //citys is a list of CityClass objects
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public List<CityClass> getCities() {
        return citys; //data from the list is returned which are the cities in the state
    }

    public void setState(List<CityClass> citys) { //passing list of objects to the method setState
        this.citys = citys;
    }

}

class AssociationExample {

    public static void main(String[] args) {
        State state = new State();
        state.setStateName("California");


        CityClass city = new CityClass();
        city.setCityName("SLos Angeles");
        CityClass city2 = new CityClass();
        city2.setCityName("San Diago");

        //now city had data Los Angeles and the same goes for city2


        //Using CityClass "class" to create list object
        List<CityClass> empList = new ArrayList<CityClass>(); //creating a list of objects
        empList.add(city);
        empList.add(city2);


        state.setState(empList); //becauase in the code we said we will be passing list type class CityClass

        System.out.println(state.getCities()+" are cities in the state "+
                state.getStateName());
    }


}
