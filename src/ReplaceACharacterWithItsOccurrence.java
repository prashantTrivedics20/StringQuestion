import java.util.Arrays;

public class ReplaceACharacterWithItsOccurrence {
    public static void main(String[] args) {
        String input="opentext";
        char charToReplace='t';
        //expected output=open1ex2
        // check char presense in string
        // by using indexOf() we can know about weather the  given character is present in the String or not
        if(input.indexOf(charToReplace)==-1)
        {
            System.out.println("Given character is not avaliable in the input string");
            System.exit(0);
        }
        //logic to replace char occurrence in string
        char[]arr=input.toCharArray();
        int c=1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==charToReplace)
            {
                arr[i]=String.valueOf(c).charAt(0);
                c++;

            }
        }
       // System.out.println(new String(arr));
        System.out.println(Arrays.toString(arr));
        // second logic
        int cnt=1;
        for (int i = 0; i <input.length(); i++) {
            char ch=input.charAt(i);
            if(ch==charToReplace)
            {
                input=input.replaceFirst(String.valueOf(charToReplace),String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(input);
    }
}
