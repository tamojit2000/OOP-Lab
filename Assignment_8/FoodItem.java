class FoodItem {
    private String desc;
    private double unitPrice;
    public FoodItem(String desc, double unitPrice){
        this.desc = desc;
        this.unitPrice = unitPrice;
    }
    public String getDesc(){
        return desc;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
}
