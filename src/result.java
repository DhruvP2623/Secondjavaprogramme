public class result
{
    static int total;

    static int rollNUmber;
    static double percentage;
    public static void studentmarksheet(String name, int rollNumber, int maths, int sci, int eng) {

        total =maths +sci +eng;
        percentage =total/3;

        System.out.println(name + " rollNumber = " + rollNumber + " Toatl marks = " + total + " & percentage = " + percentage + "%");
        if(percentage>= 35){
            System.out.println("Congratulation");
            System.out.println("Dev is Pass");
        }
        else{
            System.out.println("Sorry to tell you");
            System.out.println("Dev is Fail");

        }

    }
    public static void main(String[] args) {
        studentmarksheet("Dev", 14, 78, 35, 40);


    }

    }
