public class this_keyword_1 {
    public static void main(String[] args) {
		cakes c = new cakes();
		c.setAge(10);
		int umar = c.getAge();
		c.setName("Hithaishi");
		String naam = c.getName();
		
		System.out.println(naam + " : " + umar);
	}
}
class cakes{
    private int age;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
}
