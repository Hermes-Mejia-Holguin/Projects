import java.util.ArrayList;
public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<Integer>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        
        alphabet.forEach(System.out::println);
        //print the size
        System.out.println("size:"+alphabet.size());
        System.out.println("next list");
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }
        //removing index 0
        number.remove(0);
        System.out.println("ArrayList number after remolving index 0");
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }
        
    }
}
