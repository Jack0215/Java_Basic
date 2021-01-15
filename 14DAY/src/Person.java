import java.io.Serializable;

public class Person implements Serializable{
String name;
int age;
String address;

public Person(String name, int age, String address) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
}
