public class Pet {
    private String name;
    //Constructor
    public Pet()
    {
        this.setName("");
    }
    //set method
    public void setName(String newName)
    {
        this.name= newName;
    }
    //get method
    public String getName()
    {
        return this.name;
    }
    //toString
    public String toString()
    {
        String output= "Pet name: ";
        output+=this.getName();
        return output;
    }
//main
public static void main(String[]args)
{
Pet myPet1 = new Pet();
myPet1.setName("Luna");
Pet myPet2= new Pet();
myPet2.setName("Luke");
//System.out.println(myPet1.getName());
System.out.println("Pet Information:");
System.out.println(myPet1);
System.out.println("Pet Information:");
System.out.println(myPet2);
}
}