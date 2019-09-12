/*
Michael Botros
September 11th, 2019
This program will calculate your income tax based on your salary using the governments tax brackets and rates
 */

package incometaxproblem;

import java.util.Scanner;

/**
 *
 * @author mibot3117
 */
public class IncomeTaxProblem {

    public static void main(String[] args) {
        
        //creating a new scanner object
        Scanner keyedInput = new Scanner(System.in);
        
        //Creating an input for salary, an output for income tax and declaring all the rates and CUTOFFs
        double salary;
        final double TAX_RATE1 = 0.15;
        final double TAX_RATE2 = 0.205;
        final double TAX_RATE3 = 0.26;
        final double TAX_RATE4 = 0.29;
        final double TAX_RATE5 = 0.33;
        final double CUTOFF1 = 47630;
        final double CUTOFF2 = 47629;
        final double CUTOFF3 = 95259;
        final double CUTOFF4 = 147667;
        final double CUTOFF5 = 210371;
        double incomeTaxAmount = 0;
        
        //This will prompt the user for their salary
        System.out.println("Please enter your yearly salary:");
        salary = keyedInput.nextDouble();
        
        //in the next lines, the program determines which bracket the salary is in and calculates the income tax accordingly and adding the tax amount from previous brackets
        if (salary < CUTOFF2) {
        incomeTaxAmount = 0;
        }
        if (salary > CUTOFF2 && salary < CUTOFF3 ){
        incomeTaxAmount = (TAX_RATE1 * CUTOFF1) + (TAX_RATE2 * (salary-CUTOFF2));
        }
        if (salary > CUTOFF3 && salary < CUTOFF4 ){
        incomeTaxAmount = (TAX_RATE1 * CUTOFF1) + (TAX_RATE3 * (salary-CUTOFF3) + (TAX_RATE2 * CUTOFF3));
        }
        if (salary > CUTOFF4 && salary < CUTOFF5 ){
        incomeTaxAmount = (TAX_RATE1 * CUTOFF1) + (TAX_RATE4 * (salary-CUTOFF4) + (TAX_RATE2 * CUTOFF3) + (TAX_RATE3 * CUTOFF4));
        }
        if (salary > CUTOFF5){
        incomeTaxAmount = (TAX_RATE1 * CUTOFF1) + (TAX_RATE5 * (salary-CUTOFF5) + (TAX_RATE2 * CUTOFF3) + (TAX_RATE3 * CUTOFF4));
        }
        
        //displays the income tax in dollars
        System.out.println("You must pay " + incomeTaxAmount + "$ in income tax.");
    }
    
}
