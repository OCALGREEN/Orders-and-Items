public class Item {
    private String name; 
    private double price; 


    // setters need a parameter and no return type (void)
    // getters DON'T need a parameter but DO need a return type

    public void setAll(String name, double price) {
        this.name = name; 
        this.price = price; 
    }
    public String getAll() {
        return "Name: " + name + " Price: " + price; 
    }

    public void setName(String name) {
        this.name = name; 
    }
    public String getName() {
        return name; 
    }

    public void setPrice(double price) {
        this.price = price; 
    }
    public double getPrice() {
        return price; 
    }















}