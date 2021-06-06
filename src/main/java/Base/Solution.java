package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 13
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        int principal = principalValue();
        double rate = interestRate();
        int years = numberYears();
        int compounded = numberCompounded();

        double ratePercent = rate / 100.0;

        double baseNumber = (1 + (ratePercent / compounded));
        double expNumber = (compounded * years);

        double result= Math.pow(baseNumber, expNumber);

        double roundInvestment = (principal * result) * 100.0;

        int roundRate = (int) Math.ceil(roundInvestment);

        double  rateFinal = roundRate / 100.0;

        System.out.print("$"+principal+" invested at "+rate+"% for "+years+" years compounded "+compounded+" times per year is $");

        DecimalFormat format = new DecimalFormat("0.00");
        System.out.print(format.format(rateFinal));
        System.out.print(".");

    }

    private static int principalValue(){

        System.out.print("What is the principal amount? ");
        String principalInput = in.nextLine();
        return Integer.parseInt(principalInput);

    }

    private static double interestRate(){

        System.out.print("What is the rate? ");
        double interestInput = in.nextDouble();

        return interestInput;

    }

    private static int numberYears(){

        System.out.print("What is the number of years? ");
        int years = in.nextInt();

        return years;

    }

    private static int numberCompounded(){

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compoundInput = (int) in.nextDouble();

        return compoundInput;

    }


}
