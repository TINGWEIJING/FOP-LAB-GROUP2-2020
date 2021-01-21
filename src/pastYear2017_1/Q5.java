package pastYear2017_1;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {

    public static void main(String[] args) {
        Essay a = new Essay();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        a.setGrammarMark(sc.nextInt());
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        a.setSpellingMark(sc.nextInt());
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        a.setLengthMark(sc.nextInt());
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        a.setContentMark(sc.nextInt());
        
        System.out.println(a);
    }

}
