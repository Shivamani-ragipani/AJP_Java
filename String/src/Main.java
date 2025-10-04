public class Main {
    public static void StringEx() {
        String str = new String("Shiva");
        String str1 = "Mani";
        char arr[] = {'S', 'h', '$', 'i', '@' , '*',  'v', 'a'};
        String str2 = new String(arr);



        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str2));
        System.out.println(str1.compareTo(str));

        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)=='*' || str.charAt(i)=='$' || str.charAt(i)=='@') {
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        StringEx();
    }
}