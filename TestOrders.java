import java.util.ArrayList; 

public class TestOrders {
    public static void main(String[] args) {

    //DECLARING ITEMS
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();
    Item item4 = new Item();

    // DECLARING ORDERS
    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    Order order4 = new Order();

    // SETTING ITEMS
    item1.setAll("Mocha", 4.45);
    item2.setAll("Latte", 5);
    item3.setAll("Drip Coffee", 1.25);
    item4.setAll("Capuccino", 4.5);;

    // SETTING ORDERS
    order1.setName("Cindhuri");
    order2.setName("Jimmy");
    order3.setName("Noah");
    order4.setName("Sam");

    order2.setItem(item1.getName()); 
    order2.setTotal(item1.getPrice()); 

    order3.setItem(item4.getName()); 
    order3.setTotal(item4.getPrice()); 

    order4.setItem(item2.getName()); 
    order4.setTotal(item2.getPrice()); 
    order4.setItem(item2.getName()); 
    order4.setTotal(item2.getPrice()); 
    order4.setItem(item2.getName()); 
    order4.setTotal(item2.getPrice()); 

    order1.setItem(item3.getName()); 
    order1.setTotal(item3.getPrice()); 

    // GETTING
    System.out.println("\n"); 
    order2.getAll(true);

    System.out.println("\n"); 
    order3.getAll(false); 

    System.out.println("\n"); 
    order4.getAll(false); 

    System.out.println("\n"); 
    order1.getAll(true); 









    }
}