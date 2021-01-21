package pastYear2017_1;

/**
 *
 * @author TING WEI JING
 */
public class GradedActivity {

    private int score;

    public int getScore() {
        return score;
    }

    public char getGrade() {
        if(score < 60) {
            return 'F';
        }
        else if(score < 70) {
            return 'D';
        }
        else if(score < 80) {
            return 'C';
        }
        else if(score < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Total score: " + score + "\nEssay grade: " + getGrade();
    }

}
