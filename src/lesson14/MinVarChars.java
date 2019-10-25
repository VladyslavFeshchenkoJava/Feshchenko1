package lesson14;

public class MinVarChars {
    public static void main(String[] args) {
        String str = "fffff ab f 1234 jkjk";
        int count=0;
        String[]words = str.split("\\s");
        for (String s:words){
            char[]chars=new char[s.length()];
            for (int i=0; i<=s.length();i++){
                chars[i]=s.charAt(i);

            }
        }
    }
}
