public class oddoreven {
   static  int numberx = 5;
   static int numbery = 10;

    public static void main(String[] args) {

        String output = numberx % 2 ==0 ? "Even" : "Odd";
        String output2 = numbery % 2 ==0 ? "Even" : "Odd";
        System.out.println(numberx +" is " + output );
        System.out.println(numbery +" is " + output2);

    }
}