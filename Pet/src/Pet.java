public class Pet {
    private String name;
    private String type;
    private int age;
        
        //Constructor
    public Pet(String newName, String newType, int newAge)
    {
        this.setType(newType);
        this.setName(newName);
        this.setAge(newAge);
    }
        //set method
    public void setType(String newType)
    {
        this.type= newType;
    }
    public void setName(String newName)
    {
        this.name= newName;
    }
    public void setAge(int newAge)
    {
        this.age=newAge;
    }
    //get method
    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }
    public int getAge()
    {
        return this.age;
    }
    //Speak
    public String speak()
    {
        if (getType().equals ("Dog")){
            return "Woof";
        }
        if (getType().equals ("Cat")){
            return "Meow";
        }
        else{
            return "noise";}
    }
    //toString
    public String toString()
    {
        String output= "Pet name: ";
        output+=this.getName();
        output+=this.getType();
        output+=this.getAge();
        output+=this.speak();
        return output;
    }
}