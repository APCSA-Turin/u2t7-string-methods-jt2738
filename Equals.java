import java.util.Scanner;
public class Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter first word: ");
        String str1 = scan.nextLine();
        while (score < 50) {
            System.out.print("Enter next word: ");
            String str2 = scan.nextLine();
            if (str2.compareTo(str1)>0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else {
                if (str2.compareTo(str1)<0) {
                    score -= 5;
                    System.out.println("-5 points: current word alphabetically before; SCORE: " + score); 
                } else {
                    score -= 10 ;
                    System.out.println("-10 points: current and previous word are the same; SCORE: " +score);
                }
            }
            if(str1.length() == str2.length()){
                System.out.println("+2 points: lengths of current and previous word are the same; SCORE: " +score);
            }
            int lastTwoIndex = (str1.length()) -2 ;
            String lastTwoLetters = str1.substring(lastTwoIndex);
            String firstTwoLetters= str2.substring(0, 2);
            if (lastTwoLetters.equals(firstTwoLetters)) {
                score += 5;
                System.out.println("+5 points: last two letters of previous word match first two letters of current; SCORE: " + score);
            }
            int index = str2.indexOf(str1.substring(0, 1));
            if( index > -1 ){
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            str1 = str2;
        }
        scan.close();
    }
}
