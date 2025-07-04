package day6;

public class Student {
      private  String name;
      private static int id;
      private int reg;
      
      //static {
    	//  System.out.println("hello student");
      //}
	public Student() {
		id++;
		reg++;
		System.out.println("constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	@Override
	public String toString() {
		return "Student [id="+id+" name=" + name + ", reg=" + reg + "]";
	}
	
      
      
      
      
}
