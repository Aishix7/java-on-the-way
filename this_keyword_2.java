public class this_keyword_2 {
    public static void main(String[] args) {
		cakes c = new cakes();
		c.setAge(10,c);
		int umar = c.getAge();
		c.setName("Hithaishi",c);
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
    public void setName(String name,cakes c){
        cakes c1 = c;
        c1.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age,cakes c){
        cakes c1 = c;
        c1.age = age;
    }
}
// passing the obj as reference so that we can have same variable names for both local and instance.