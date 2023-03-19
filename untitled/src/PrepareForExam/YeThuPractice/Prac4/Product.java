package PrepareForExam.YeThuPractice.Prac4;

public class Product {
    private int price;
    private String name;
    private int id;
    private int quantity;

    public Product(String name, int price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getID(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

