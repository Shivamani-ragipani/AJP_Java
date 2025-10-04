public class VowelsCount {

    public static void VowelCount() {
        String str = "Anudip";
        int count=0;
        int consonents = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e') {
                count++;
            } else
                consonents++;
        }

        System.out.println("Vowels are: "+count);
        System.out.println("Consonents are: "+consonents);

    }
    public static void main(String[] args) {

        VowelCount();
    }
}
