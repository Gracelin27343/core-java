package polymorphism.overloading;

public class Person {
private String name;
private int id;
private String city;


public Person() {
	this.name = "aruna";;
	this.id = 100;
	this.city = "chennai";
}


public Person(String name, int id) {
	this.name = name;
	this.id = id;

}

public Person(String name, int id, String city) {
	this.name = name;
	this.id = id;
	this.city = city;
}


@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", city=" + city + "]";
}

}