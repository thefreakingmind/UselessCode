package String;
public class StringBasics{


    // Implementation of Index of Method
    public static int hasLetter(String word, char letter) {
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == letter) {
                return i;
            }
        }
        return 0;
    }

    //Replacing a String
    //Failure 1
    public static String replace(String word, char gone, char here) {
        char[] arr = word.toCharArray();
        for(char c: arr) {
            if(c == gone) {
                c = here;
            }
        }
        return new String(arr);
    }

    public static String replaceValue(String work, char gone, char here) {
        char[] arr = work.toCharArray();
        char [] arr2 = new char[arr.length];
        int i =0;
        for(char c: arr) {
            if(c == gone) {
                arr2[i] = here;
            }
            else{
                arr2[i] = c;
            }
            i++;
        }
        return new String(arr2);
    }


    public static void main(String[] args)
    {
        System.out.println(hasLetter("Hello",  'e'));
        System.out.println(replace("Hello", 'e', 'p'));
        System.out.println(replaceValue("Hello", 'e', 'p'));

    }
}
