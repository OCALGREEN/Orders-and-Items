import java.util.ArrayList; 

public class Order {
    private String name; 
    private double total;
    private boolean ready;
    private ArrayList<String> items = new ArrayList<String>(); 

    // GET ALL
    public void getAll(boolean isReady) {

        System.out.println("Name: " + name); 

        for(int i = 0; i < items.size(); i++) {
            String itemList = items.get(i); 
            System.out.println("Item " + (i + 1) + ": " + itemList); 
        }

        System.out.println("Total: " + total); 

        if(!isReady) {
            System.out.println("Please wait a moment while we prepare your drink."); 
        }
        else {
            System.out.println("Your drink is ready."); 
        }
    }


    // NAME
    public void setName(String name) {
        this.name = name; 
    }
    public String getName() {
        return name; 
    }

    // TOTAL
    public void setTotal(double total) {
        this.total += total; 
    }
    public double getTotal() {
        return total; 
    }

    // READY
    public void setRead(boolean ready) {
        this.ready = ready; 
    }
    public boolean getRead() {
        return ready;
    }

    // ITEMS LIST
    public void setItem(String item) {
        this.items.add(item); 
    }















}