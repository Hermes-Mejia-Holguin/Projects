public class Test {
    private double ave;
    private int count;
    private int score;
    private int sum;
    Test(double newAve, int newCount, int newScore, int newSum){
            this.setAve(newAve);
            this.setCount(newCount);
            this.setScore(newScore);
            this.setSum(newSum);
    }
    //setters
    public void setAve(double newAve){
        this.ave=newAve;
    }
    public void setCount(int newCount){
        this.count=newCount;
    }
    public void setScore(int newScore){
        this.score=newScore;
    }
    public void setSum(int newSum) {
        this.sum = newSum;
    }
    //get
    public double getAve(){
        return this.ave;
    }
    public double getCount(){
        return this.count;
    }
    public double getScore(){
        return this.score;
    }
    public int getSum() {
        return this.sum;
    }
    public void getAverage(){
        if (count>0){
        this.ave = (double) sum / count;
        this.ave = Double.parseDouble(String.format("%.2f", this.ave));}
        else{
            this.ave=0.0;
        }

    }
    public String toString(){
        return "The average of the " + count + 
        " scores entered is " + ave;
    }
}