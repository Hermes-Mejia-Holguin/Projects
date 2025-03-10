import java.util.Arrays;
import java.util.Random;
public class IntArray {
    private int length;
    private int[] myArray;
    //constructor
    public IntArray(int a) {
    myArray= new int[a] ;   
        
    }
    public int size(){
        return myArray.length;
    }
    public void fillRand(){
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(6) + 1; // Random number between 1 and 6
        } }
    public void set(int element, int newValue) {
        myArray[element]=newValue;
        
        
    }
    public void clear() 
    { myArray = new int[myArray.length];
    }
    public boolean isEmpty() {
        if (myArray.length==0){
            return true;
                        
        }
        else{
            return false;
        }

    }
    public void sort() {
        Arrays.sort(myArray);
    }
    public int get(int element) {
        element=myArray[element];
        return element;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myArray.length; i++) {
            sb.append("Element ").append(i).append(": ").append(myArray[i]).append("\n");
        }
        return "IntArray Instance data:\n"+sb.toString();
        }
    }
    

