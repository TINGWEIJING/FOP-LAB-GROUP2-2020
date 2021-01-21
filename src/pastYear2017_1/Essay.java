package pastYear2017_1;

/**
 *
 * @author TING WEI JING
 */
public class Essay extends GradedActivity{

    private int grammarMark;
    private int spellingMark;
    private int lengthMark;
    private int contentMark;

    public int getGrammerMark() {
        return grammarMark;
    }

    public int getSpellingMark() {
        return spellingMark;
    }

    public int getLengthMark() {
        return lengthMark;
    }

    public int getContentMark() {
        return contentMark;
    }

    public void setGrammarMark(int grammerMark) {
        this.grammarMark = grammerMark;
        setScore(getScore() + grammerMark);
    }

    public void setSpellingMark(int spellingMark) {
        this.spellingMark = spellingMark;
        setScore(getScore() + spellingMark);
    }

    public void setLengthMark(int lengthMark) {
        this.lengthMark = lengthMark;
        setScore(getScore() + lengthMark);
    }

    public void setContentMark(int contentMark) {
        this.contentMark = contentMark;
        setScore(getScore() + contentMark);
    }

    @Override
    public String toString() {
        return String.format("Essay score:\nGrammer: %d\nSpelling: %d\nLength: %d\nContent: %d\n\n%s",
                             grammarMark,
                             spellingMark,
                             lengthMark,
                             contentMark,
                             super.toString());
    }

}
