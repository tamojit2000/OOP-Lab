import java.time.*;
class FoodLineItem {
    private FoodItem item;
    private int quantity;
    private double price;
    private LocalDateTime time;
    public FoodLineItem(FoodItem item, int quantity, LocalDateTime time){
        this.item = item;
        this.quantity = quantity;
        this.price = quantity * item.getUnitPrice();
        this.time = time;
    }
    public FoodItem getItem(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public LocalDateTime getTime(){
        return time;
    }
}
