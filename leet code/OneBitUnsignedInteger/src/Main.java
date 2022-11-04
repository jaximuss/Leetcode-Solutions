import com.sun.javafx.binding.IntegerConstant;

public class Main
{
    public static void main(String[] args)
    {
        int number = 234;
        System.out.println(productofsum(number));
    }

    public static  int productofsum(int x)
    {
        String convert = Integer.toString(x);
        char[] chars  = convert.toCharArray();
        int product = 1 ;
        for (int i = 0 ; i <chars.length; i++)
        {
            product = product * (chars[i] -'0');

        }
        String ok = Integer.toString(x);
        char[] charts  = convert.toCharArray();
        int sum = 0 ;
        for (int i = 0 ; i <charts.length; i++)
        {
            sum = sum + (chars[i] -'0');

        }
        int answer = product - sum ;
        return answer;
    }



}