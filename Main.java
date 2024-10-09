import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        int halfIndex1 = (str1.length()/2) ;
        int halfIndex2 = (str2.length()/2) ;
        if (str1.length() > str2.length() ) {
            System.out.println(str1 + " is the longer string.");
        } 
        else {
            if (str2.length() > str1.length()) {
                System.out.println(str2 + " is the longer string.");
            } else {
                System.out.println("Both strings have the same length.");
            }
        }
        String firstHalf1 = str1.substring(0, halfIndex1);
        String secondHalf1 = str1.substring(halfIndex1);
        System.out.println("First half: " + firstHalf1);
        System.out.println("Second half: " + secondHalf1);
        String firstHalf2 = str2.substring(0, halfIndex2);
        String secondHalf2 = str2.substring(halfIndex2);
        System.out.println("First half: " + firstHalf2);
        System.out.println("Second half: " + secondHalf2);
        int index =str1.indexOf(str2);
        if (index > -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " +index);
            } else {
            System.out.println(str2 + " is not found in " + str1);
            }
    }
}
