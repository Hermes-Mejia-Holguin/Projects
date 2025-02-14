import java.util.Scanner;
public class Runner{
public static void main(String[]args)
{
//objects
Pet myPet1 = new Pet(null, null, 0);
myPet1.setName("Leia");
myPet1.setType("Dog");
myPet1.setAge(9);
Pet myPet2= new Pet(null, null, 0);
myPet2.setName("Luke");
myPet2.setType("Cat");
myPet2.setAge(6);
Scanner myObj = new Scanner(System.in);
System.out.println("Enter pet name: ");
String name = myObj.nextLine();
System.out.println("Enter pet type(Dog,Cat,other): ");
String type = myObj.nextLine();
System.out.println("Enter pet age: ");
int age = myObj.nextInt();
myObj.nextLine();
Pet myPet3= new Pet(name,type,age);


//print
System.out.println("Pet Information:");
System.out.println("Type: "+myPet1.getType());
System.out.println("Name: "+myPet1.getName());
System.out.println("Sound: "+myPet1.speak());
System.out.println("Age: "+myPet1.getAge());
System.out.println("Pet Information:");
System.out.println("Type: "+myPet2.getType());
System.out.println("Name: "+myPet2.getName());
System.out.println("Sound: "+myPet2.speak());
System.out.println("Age: "+myPet2.getAge());
System.out.println("Pet Information:");
System.out.println("Type: "+myPet3.getType());
System.out.println("Name: "+myPet3.getName());
System.out.println("Sound: "+myPet3.speak());
System.out.println("Age: "+myPet3.getAge());
myObj.close();
}
}