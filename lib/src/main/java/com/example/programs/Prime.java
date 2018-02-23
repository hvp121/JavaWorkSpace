package com.example.programs;

/**
 * Created by manoj.bhadane on 20-12-2017.
 */
public class Prime
{
    public static void main(String args[])
    {
        Prime prime = new Prime();
        prime.check(13);
    }

    public void check(int no)
    {
        int coounter = 0;
        for (int i = 2; i < no; i++)
        {

            for (int j = i; j >= i; j--)
            {
                if (i % j == 0)
                {
                    coounter = coounter + 1;
                }
            }
            if (coounter == 2)
            {
                coounter = 0;
                System.out.println("--Prime-" + i);
            }
        }

    }

   /* public void check(int no)
    {
        for (int i = 2; i < 50; i++)
        {
            for (int j = 2; j <= no; j++)
            {
                if (i != j)
                    if (i % j == 0)
                    {
                        System.out.println("--Prime-" + i);
                        break;
                    }
            }
        }
    }*/
}
