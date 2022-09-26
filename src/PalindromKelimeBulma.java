import java.util.Scanner;

public class PalindromKelimeBulma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String word=sc.nextLine();
        if (isPalindrome(word.toLowerCase())){
            System.out.println(word + " kelimesi palindromiktir.");
        }else {

            System.out.println(word + " kelimesi palindromik değildir.");
        }
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
