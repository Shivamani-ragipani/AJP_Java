public class StrPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        if(rev.equals(str)) {
            System.out.println("Your String is Palindrome");
        } else
            System.out.println("Your String is not Palindrome");
    }
}
