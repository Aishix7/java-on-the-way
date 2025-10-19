class cakes{
    int orderNo;
    String type;
    int price;
    static String DeliveryDate;
    
    public void show(){
        System.out.println(orderNo + " : " + type + " : " + price + " : " + DeliveryDate);
    }
}
public class staticVar {
    public static void main(String[] args) {
		cakes c1 = new cakes();
		c1.orderNo = 1;
		c1.type = "strawberry";
		c1.price = 400;
		// c1.DeliveryDate = "28-10-2025"; // we should call static variable in a static way 
		cakes.DeliveryDate = "28-10-2025";

		cakes c2 = new cakes();
		c2.orderNo = 2;
		c2.type = "chocolate";
		c2.price = 600;
		// c2.DeliveryDate = "31-10-2025";
		cakes.DeliveryDate = "31-10-2025";
	
		cakes c3 = new cakes();
		c3.orderNo = 3;
		c3.type = "butterscotch";
		c3.price = 650;
		// c3.DeliveryDate = "01-11-2025";
		cakes.DeliveryDate = "01-11-2025";

		c1.show();
		c2.show();
		c3.show();
	}
}
