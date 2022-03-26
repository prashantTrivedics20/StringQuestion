import java.util.stream.IntStream;

public class RemoveDuplicateCharacterInGivenString {
    // using java 8
    // using indexof(..)
    // using CharacterArray
    // setInterface
    public static void main(String[] args) {
        String str="programming";
        // 1=> java 8 approach
       StringBuilder sb1=new StringBuilder();
//       str.chars().distinct().forEach(c->sb1.append((char)c));
//       // str.chars() return the IntStream
//        System.out.println(sb1);

        // approach 2
        //StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
           char ch= str.charAt(i);
//           int idx=str.indexOf(ch,i+1);
//            System.out.println(idx);
            int idx=str.indexOf(ch,i+1);
            if(idx==-1)
            {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);
        // Approach -3
        char[]arr=str.toCharArray();
        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean repeated=false;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j])
                {
                    repeated=true;
                    break;
                }
            }
            if(repeated==false)
            {
                sb2.append(arr[i]);
            }
        }





    }

}
