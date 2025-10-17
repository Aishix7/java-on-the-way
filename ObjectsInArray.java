public class ObjectsInArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        Students s1 = new Students();
        
        s1.rollno = 1;
        s1.name = "Hithaishi";
        s1.marks = 98;
        
        Students s2 = new Students();
        
        s2.rollno = 2;
        s2.name = "Ramana Trinath";
        s2.marks = 100;
        
        Students s3 = new Students();
        
        s3.rollno = 3;
        s3.name = "sai kumar";
        s3.marks = 99;
        
        Students s[] =  new Students[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].name + " bearing roll number " + s[i].rollno + " got " + s[i].marks + " Marks.");
        }
	}
}

class Students{
    int rollno;
    String name;
    int marks;
}