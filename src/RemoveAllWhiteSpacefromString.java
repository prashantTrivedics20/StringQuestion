public class RemoveAllWhiteSpacefromString{
    public static void main(String[] args) {
        String str="   j  a  va  s    ta   r";
        String trimmedStr=str.trim();// trim method is used to remove leading and trailing white space of the string
        System.out.println(trimmedStr);
        // my task is to remove all the white spaces of the string then what to do
       String removeallthespace= str.replaceAll("\\s","");//   \\s unicode s  by using this we can replace all the white space of the string
        System.out.println(removeallthespace);
    }
}
