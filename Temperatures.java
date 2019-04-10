public class Temperatures {
    public static void main (String [] Args){

        int temp[][] = new int [] []{  {68,70,76,70,68,71,75},
                                       {76,76,87,84,82,75,83},
                                       {73,72,81,78,76,73,77},
                                       {64,65,69,68,70,74,72}};

        String time [] = new String [] {"7 AM", "3 PM", "7 PM", "3 AM"};
        String day [] = new String [] {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are:\n");

        // Print the data.
        for (int row = 0; row < 4; row++ ){

            System.out.print(time[row]+": ");

            for (int column = 0; column < 7; column++){

                System.out.print(temp[row] [column]+" ");

            }

            System.out.print("\n");

        }

        System.out.println();
        System.out.println("Based on that data, " +
                "the following are the average temperature of the week.\n");


        //Average of the day.
        for (int column = 0; column < 7; column++ ){

            int sum = 0;

            for (int row = 0; row < 4; row++){

                sum += temp [row] [column];

            }

            float average = sum/4;
            System.out. println (day[column]+": " + average);
        }
        System.out.println();


        //Average of a time.
        for (int row = 0; row < 4; row++ ){

            int sum = 0;

            for (int column = 0; column < 7; column++){

                sum += temp [row] [column];

            }

            float average = sum / 7;
            System.out. println (time[row]+": " + average);
        }
        System.out.println();


        //Overall average.
        int sum1 = 0;
        for (int row = 0; row < 4; row++ ){

            int sum2 = 0;

            for (int column = 0; column < 7; column++){

                sum2 += temp [row] [column];
            }

            sum1 += sum2;

        }
        float average = sum1/(4*7);

        System.out. println ("The overall average is " + average + ".\n");

    }
}
