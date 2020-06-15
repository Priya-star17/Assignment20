import java.util.Scanner;
class Vehicle {
public void type() {
System.out.println("Type of Vehicle");
}
}
//inheritance
class Bus extends Vehicle {
@Override
public void type() {
System.out.println("6 wheeler type");
}
}
class Poly{
public int add(int x, int y) {
return x+y;
}
//Overload
public double add(double x,double y) {
return x+y;
}
}
//encapsulation example
class EncapTest {
private String name;
public String getName() {
return name;
}
public void setName(String newName) {
name = newName;
}
}
//abstraction
abstract class TwoWheeler {
public abstract void run();
}
class Honda extends TwoWheeler{
public void run(){
System.out.println("\nbike is Running..");
}
}
class ObjectCombination {
public static void main(String[] args) {
int number;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice:");
number=sc.nextInt();
switch (number){
	case 1:
	System.out.println("Inheritance call");
	Vehicle vehicle=new Vehicle();
	vehicle.type();
	Bus bus=new Bus();
	bus.type();
	break;
	case 2:
	Poly poly=new Poly();
	System.out.println("Polymorphism call");
	System.out.println(poly.add(4,2));
	System.out.println(poly.add(5.,2.));
	break;
	case 3:
	System.out.println("Encapsulation call");
	EncapTest encap = new EncapTest();
	encap.setName("Priya");
	System.out.print("Name : " + encap.getName() );
	break;
	case 4:
	System.out.println("Abstraction call");
	TwoWheeler test = new Honda();
	test.run();
	break;
	default:
	System.out.println("Invalid");
	}
}
}
