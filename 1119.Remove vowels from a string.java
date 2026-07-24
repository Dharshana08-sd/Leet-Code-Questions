public class Main {
    public static void main(String[] args) {
        String str = "Dhaanish Kanchipuram";
       StringBuilder sb = new StringBuilder ();
       for (char c : str.toCharArray()) {
           if(c !='a'&& c !='e'&& c !='i'&& c !='o'&& c !='u') {
               sb.append(c);
           }
       }
        System.out.println("Input:"+str);
        System.out.println("Output:"+sb.toString());
    }
}
