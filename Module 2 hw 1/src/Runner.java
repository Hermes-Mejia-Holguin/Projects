import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ave=0;
        int count=0;
        int score=0;
        int sum=0;
        Test myScores= new Test(ave, count, score,sum);
       //loop     
        while(true){
            System.out.print("Enter the scores");
            score= scan.nextInt();
            if (score==-1){
                
                break;
            }
            
            count++;
            sum+=score;
            
            
            
            
        }
        
        
        myScores.setCount(count);
        myScores.setSum(sum);
        myScores.getAverage();

        System.out.println(myScores);
        
        
        scan.close();
    
    }
}
