public class staticBlock {
    public static void main(String[] args) {
		cakes c1 = new cakes();
		c1.orderNo = 1;
		c1.type = "strawberry";
		c1.price = 400;
		cakes.DeliveryDate = "28-10-2025";
		
		c1.show();
	}
}

class cakes{
    int orderNo;
    String type;
    int price;
    static String DeliveryDate;
    static{
        
        DeliveryDate = "28-12-2025";
    }
    public void show(){
        System.out.println(orderNo + " : " + type + " : " + price + " : " + DeliveryDate);
    }
}
