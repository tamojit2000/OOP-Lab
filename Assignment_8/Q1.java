import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
class BillingManager {
    private List<FoodLineItem> myList;
    private List<String> discCategory;
    private List<Double> myDiscount;
    public BillingManager(){
        myList = new ArrayList<>();
        discCategory = new ArrayList<>();
        myDiscount = new ArrayList<>();
    }
    public void addItem(FoodLineItem myItem){
        myList.add(myItem);
    }
    public void discount(){
        LocalDateTime t1 = LocalDateTime.of(1,1,1,11,0);
        LocalDateTime t2 = LocalDateTime.of(1,1,1,15,0);
        double sum = 0;
        for(FoodLineItem i : myList){
            if(i.getTime().compareTo(t1) >= 0 && i.getTime().compareTo(t2) <= 0)
                sum += i.getPrice();
        }
        if(sum > 0){
            discCategory.add("Discount (Lunch-Time Special)");
            myDiscount.add(sum * 0.10);
        }
    }
    public void discount(FoodItem pizza1, FoodItem pizza2){
        double a = pizza1.getUnitPrice(), b = pizza2.getUnitPrice();
        discCategory.add("Discount (Combo Special)");
        myDiscount.add(Math.min(a, b));
    }
    public void discount(FoodItem hotDrink, FoodItem cake, boolean dummyFlag){
        discCategory.add("Discount (Tea-Time Special)");
        double a = hotDrink.getUnitPrice() + cake.getUnitPrice();
        myDiscount.add(a > 200 ? a - 200 : 0);
    }
    public void discount(boolean isTakeAway){
        double sum = 0.0d;
        for(FoodLineItem i : myList){
            String t = i.getItem().getDesc();
            if(t.substring(t.length() - 11).equalsIgnoreCase("(Take-Away)"))
                sum += i.getPrice();
        }
        discCategory.add("Discount (Take-Away)");
        myDiscount.add(sum * 0.15);
    }
    public void printReceipt(){
        int l = Integer.MIN_VALUE;
        for(FoodLineItem i : myList){
            l = Math.max(l, i.getItem().getDesc().length());
        }
        l += 5;
        int c = 0;
        double total = 0.0d;
        String temp = "Food Item Description";
        int sp = (l - temp.length()) / 2;
        System.out.printf("   %" + (sp + temp.length()) + "s%" + sp + "s%10s" + "%15s" + "%10s%n", temp, "", "Unit Price", "Quantity", "Price");
        for(FoodLineItem i : myList){
            c++;
            total += i.getPrice();
            System.out.printf(c + ". "  + "%-" + l + "s%10.2f" + "%15d" + "%10.2f%n", i.getItem().getDesc(), i.getItem().getUnitPrice(), i.getQuantity(), i.getPrice());
        }
        for(int i = 0; i < myDiscount.size(); i++){
            total -= myDiscount.get(i);
            System.out.printf("   %" + l + "s%25s%10.2f%n", discCategory.get(i), "", -1 * myDiscount.get(i));
        }
        System.out.printf("%" + (l + 13) + "s%-15s%10.2f%n", "", "Total", total);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BillingManager bill = new BillingManager();
        String temp;
        FoodLineItem ob1 = null, ob2 = null, tea1 = null, tea2 = null;
        LocalDateTime time1 = LocalDateTime.of(1,1,1,11,0);
        LocalDateTime time2 = LocalDateTime.of(1,1,1,15,0);
        LocalDateTime time3 = LocalDateTime.of(1,1,1,17,0);
        do{
            System.out.print("FOOD ITEM DESCRIPTION : ");
            temp = br.readLine();
            if(temp.equals("STOP"))
                break;
            System.out.print("UNIT PRICE : ");
            double t1 = Double.parseDouble(br.readLine());
            System.out.print("QUANTITY : ");
            int t2 = Integer.parseInt(br.readLine());
            System.out.print("ORDER TIME :-\nHOUR : ");
            int hr = Integer.parseInt(br.readLine());
            System.out.print("MINUTE : ");
            int mint = Integer.parseInt(br.readLine());
            LocalDateTime time = LocalDateTime.of(1, 1, 1, hr, mint);
            if(temp.substring(0, 5).equalsIgnoreCase("pizza"))
                temp += " (Combo Special)";
            else if(time1.compareTo(time) <= 0 && time2.compareTo(time) >= 0)
                temp += " (Lunch-Time Special)";
            else if(time2.compareTo(time) <= 0 && time3.compareTo(time) >= 0)
                temp += " (Tea-Time Special)";
            else
                temp += " (Take-Away)";
            FoodLineItem ob = new FoodLineItem(new FoodItem(temp, t1), t2, time);
            if((ob1 == null || ob2 == null) && temp.substring(0, 5).equalsIgnoreCase("pizza")){
                if(ob1 == null)
                    ob1 = ob;
                else
                    ob2 = ob;
            }
            if(ob1 != null && ob2 != null){
                bill.discount(ob1.getItem(), ob2.getItem());
                ob1 = ob2 = null;
            }
            if((tea1 == null || tea2 == null) && (temp.indexOf("Cake") != -1 || temp.indexOf("Coffee") != -1)){
                if(tea1 == null)
                    tea1 = ob;
                else
                    tea2 = ob;
            }
            if(tea1 != null && tea2 != null){
                bill.discount(tea1.getItem(), tea2.getItem(), true);
                tea1 = tea2 = null;
            }
            bill.addItem(ob);
        }while(true);
        bill.discount();
        bill.discount(true);
        bill.printReceipt();
    }
}
