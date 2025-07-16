public class CoutnV {
    String names;
    public void CheckVowels(String input){
        int count=0;
        input= input.toLowerCase();
         for(int i=0;i<input.length();i++) {
             char ch = input.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                 count++;

             }
         }
System.out.println("Total vowels:"+count);
    }
}
