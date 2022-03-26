import java.util.Arrays;

//to sort a string in alphabetical order
public class ToSortStringCharacter {
    public static void main(String[] args) {
        // 2-ways
        //1- with out using sort method
        //2- with out using sort method
        String str="rock";
        char temp;
        char arr[]=str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        System.out.println(new String(arr));//it will sort the character in alphabetical order
        // Approach -2
        String str1="rock";
        char[]charArray=str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

    }
}
