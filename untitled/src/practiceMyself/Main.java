package practiceMyself;

public class Main {
    public static void main(String[] args) {
        String name = "James";
        String country = "India";
        int age = 35;
        String company = "Google";

        String formattedstring = String.format("Hello, %s. You are from %s. You are %d years old. You work at %s.", name, country, age, company);
        
        System.out.println(formattedstring);


        //or you could just use printf??


        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("m"));
        System.out.println(name.indexOf("e"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("z"));
        System.out.println(name.isEmpty());
        System.out.println(name.equals(country));
        System.out.println(name.replace("a", "b"));
         System.out.println(name.contains("James"));
    }
}
