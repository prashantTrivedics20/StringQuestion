public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str="@$%#$iqg biqigbf";
        // approach 1
        // replaceAll(String regex,String replacement)method...
        //String removeSpecial=str.replaceAll("[^a-zA-Z0-9]","");
        String replacefirst=str.replaceAll("[^a-zA-Z0-9]","");
        //  String r=str.replace(olderchar,newchar);
        // here i want to replace all the special character instead of regex which i have provided above with empty..
        //System.out.println(removeSpecial);
        System.out.println(replacefirst);

    }
}
