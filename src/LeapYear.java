public class LeapYear
{
    static int year = 2016;

    public static void main(String[] args){

        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
        {
            System.out.println(year + " is leap year.");
        }
        else
        {
            System.out.println(year + " is not leap year.");
        }
    }
    }


