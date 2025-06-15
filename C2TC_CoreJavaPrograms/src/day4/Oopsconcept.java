package day4;

public class Oopsconcept {
	private int Num;
	private String name;
	private int age;
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Oopsconcept [Num=" + Num + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
