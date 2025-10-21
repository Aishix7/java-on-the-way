public class this_keyword_3 {
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
    public void setName(String name){
        
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
       
        this.age = age;
    }
}
// passing the obj as reference so that we can have same variable names for both local and instance and we don't have to pass obj, instead we can use this keyword which has the current object in it.