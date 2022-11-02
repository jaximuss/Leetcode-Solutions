public class Main {
    public static void main(String[] args)
    {
        int[] sum  = new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};

        System.out.println( average(sum));



    }




        static double average(int[] salary)
        {

            int minimum = salary[0];
            int maximum  = salary[0];
            int total = 0;
            for (int i = 0 ; i < salary.length ; i++)
            {
                total+=salary[i];

                if (minimum < salary[i] )
                {
                    minimum = salary[i];

                }

                if(maximum>salary[i]){
                    maximum = salary[i];
                }
            }
            int removeTheHigestSalary = total - (minimum+maximum) ;
            double average = removeTheHigestSalary /(salary.length - 2d);

            return average;
        }

    }

