public class Calc {
private double num1;
private double num2;


//Constructor
public Calc(){
    double newNum1=0;
        this.setNum1(newNum1);
    double newNum2=0;
        this.setNum2(newNum2);
}
//Setters
public void setNum1(double newNum1){
    this.num1=newNum1;
}
public void setNum2(double newNum2){
    this.num2=newNum2;
}
//Getters
public double getNum1(){
    return this.num1;
}
public double getNum2(){
    return this.num2;

}
public double add(){
    return num1+num2;
}
public double subtract(){
    return num1-num2;
}
public double multiply(){
    return num1*num2;
}
public double divide(){
    return num1/num2;
}
public String toString(){
    String output="Results:";
    return output;
}
}
