public class Exam extends Assessment {
    private int PointsEach;
    private int NumMissed;
    Exam(int questions, int missed){
    this.PointsEach= 100/questions;
    this.NumMissed= missed;
    int score= (questions-missed)*this.PointsEach;
    setScore(score);
    }
    public int getPointsEach(){
        return this.PointsEach;

    }
    public int getNumMissed(){
        return this.NumMissed;
    }
}