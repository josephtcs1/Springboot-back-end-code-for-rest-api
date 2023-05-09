package HashMap;

public class Customer {
private String name;
private String Age ;
private String panNo;
private int balence;
public Customer(String name, String age, String panNo, int balence) {
	super();
	this.name = name;
	Age = age;
	this.panNo = panNo;
	this.balence = balence;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
public String getPanNo() {
	return panNo;
}
public void setPanNo(String panNo) {
	this.panNo = panNo;
}
public int getBalence() {
	return balence;
}
public void setBalence(int balence) {
	this.balence = balence;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", Age=" + Age + ", panNo=" + panNo + ", balence=" + balence + "]";
}




	}


