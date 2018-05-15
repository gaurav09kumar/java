package bank;

import java.util.Scanner;

public class atm

{

  public static void main(String args[] )

  {

    int balance = 50000, withdraw, deposit,count=0;

    int password =1234;

    Scanner s = new Scanner(System.in);

    while(true)

    {

      System.out.println("Automated Teller Machine");

      System.out.println("Choose 1 for Withdraw");

      System.out.println("Choose 2 for Deposit");

      System.out.println("Choose 3 for Check Balance");

      System.out.println("Choose 4 for EXIT");

      System.out.print("Choose the operation you want to perform:");

      int n = s.nextInt();

      switch(n)

      {

        case 1:

        System.out.print("Enter password:");

        Scanner p = new Scanner(System.in);

        int pass = p.nextInt();

        if(pass==password)
        {

          System.out.print("Enter money to be withdrawn:");

          withdraw = s.nextInt();

          System.out.println("");

          if(balance >= withdraw  && withdraw<=20000)

          {

            balance = balance - withdraw;
            if(withdraw%100==0)
            {
              while(withdraw>2500)
              {
                withdraw=withdraw-2000;
                count++;
              }
              System.out.print("number of  two thousand note");
              System.out.println(count);

              count=0;
              while(withdraw>550)
              {
                withdraw=withdraw-500;
                count++;
              }
              System.out.print("number of five hundred note");
              System.out.println(count);
              count=0;
              while(withdraw>=100)
              {
                withdraw=withdraw-100;
                count++;
              }
              System.out.print("number of  one hundred note");
              System.out.println(count);
              count=0;
            }
            else
            {
              System.out.println("enter withdraw amount in multiples of 100");
            }

            System.out.println("Please collect your money");

          }

          else

          {

            System.out.println("Insufficient Balance or invalid amount(amount<20000)");

          }
        }
        else
        {
          System.out.println("Incorrect password");
        }

        System.out.println("");

        break;



        case 2:

        System.out.print("Enter password:");

        Scanner p2 = new Scanner(System.in);

        pass = p2.nextInt();

        if(pass==password)
        {

          System.out.print("Enter money to be deposited:");

          deposit = s.nextInt();

          balance = balance + deposit;

          System.out.println("Your Money has been successfully depsited");

        }
        else
        {
          System.out.println("Incorrect password");
        }

        System.out.println("");

        break;



        case 3:

        System.out.print("Enter password:");

        Scanner p3 = new Scanner(System.in);

        pass = p3.nextInt();

        if(pass==password)
        {

          System.out.println("Balance : "+balance);

        }
        else
        {
          System.out.println("Incorrect password");
        }

        System.out.println("");

        break;



        case 4:

        System.exit(0);

      }

    }

  }

}
