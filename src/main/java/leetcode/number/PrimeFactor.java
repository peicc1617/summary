package leetcode.number;

import java.util.Scanner;

/**
 * @基本功能:long型整数质因数分解
 * @program:summary
 * @author:peicc
 * @create:2019-08-28 08:56:52
 **/
public class PrimeFactor {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long number = 0;

        while(scanner.hasNextLong())
        {
            number = scanner.nextLong();
            isPrimerFactors(number);
        }

    }

    private static void isPrimerFactors(long num)
    {
        long number = num;
        while(number != 1)
        {
            for(int i = 2; i <= number ;i++)
            {
                if(number % i == 0)
                {
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
