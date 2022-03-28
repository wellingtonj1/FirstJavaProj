package com.aula3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        // clear console
        helper.print("\033[H\033[2J");
        helper.print("Welcome to Lesson 3");
        helper.print("=====================");
        helper.print("Choose option:");
        helper.print("1 - Exercise 1");
        helper.print("2 - Exercise 2");
        helper.print("0 - Exit");

        // get user input
        int option = helper.scan().nextInt();

        switch (option) {
            case 1:
                // create a list with 10 elements integer and print it
                helper.print("Exercise 1");
                helper.print("===========");
                helper.print("Creating a list with 10 elements integer");
                helper.print("===========================");
                ArrayList<Integer> numberList = new ArrayList<Integer>(); // create a new list
                for (int i = 0; i < 10; i++) {
                    // get a random unsigned integer 
                    numberList.add(new Random().nextInt(100));
                }

                getPar(numberList); // print list

                break;
        
            case 2:

                // create a list with 10 elements double  and print it
                helper.print("Exercise 2");
                helper.print("===========");
                helper.print("Creating a list with 10 elements double");
                helper.print("===========================");
                ArrayList<Double> numberList2 = new ArrayList<Double>(); // create a new list
                for (int i = 0; i < 10; i++) {
                    numberList2.add(new Random().nextDouble() * 100); // add element to list
                }

                // print list with iterator 
                helper.print("Printing list with iterator");
                helper.print("===========================");
                for (Double number : numberList2) {
                    // cast number to string
                    String numberString = String.valueOf(number);
                    helper.print(numberString);
                }

                // set the index 5 of numberList2 to 9.7
                helper.print("Setting the index 5 of numberList2 to 9.7");
                helper.print("===========================");
                numberList2.set(5, 9.7);

                helper.print("Printing list with the new value");

                for (Double number : numberList2) {
                    // cast number to string
                    String numberString = String.valueOf(number);
                    helper.print(numberString);
                }

                // get the average of numberList2
                helper.print("Getting the average of numberList2");
                helper.print("===========================");
                double average = getAverage(numberList2);
                // cast average to string
                String averageString = String.valueOf(average);
                helper.print(averageString);

                // get the max number of numberList2
                helper.print("Getting the max number of numberList2");
                helper.print("===========================");
                double max = getMax(numberList2);
                // print the max
                String maxString = String.valueOf(max);
                helper.print(maxString);

                // clean the numberList 2
                helper.print("Cleaning the numberList 2");
                helper.print("===========================");
                numberList2.clear();

                // check if the numberList2 is empty
                helper.print("Checking if the numberList2 is empty");
                helper.print("===========================");
                boolean isEmpty = numberList2.isEmpty();
                if (isEmpty) {
                    helper.print("The numberList2 is empty");
                } else {
                    helper.print("The numberList2 is not empty");
                }

                break;
                
            default:
                break;
        }

        
    }

    // remove all elements of list
    public static void cleanList(ArrayList<Integer> listNumbers) {
        listNumbers.clear();
    }

    public static double getMax(ArrayList<Double> numberList) {
        double max = numberList.get(0);
        for (Double number : numberList) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double getAverage(ArrayList<Double> numberList) {
        
        // get the average of numberList
        double sum = 0;
        for (Double number : numberList) {
            sum += number;
        }
        double average = sum / numberList.size();
        return average;

    }

    public static void getPar(ArrayList list) {
        
        // get odd numbers from list
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if ((Integer) list.get(i) % 2 != 0) {
                oddList.add((Integer)list.get(i));
            }
        }

        // get even numbers from list
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if ((Integer) list.get(i) % 2 == 0) {
                // cast int to integer
                evenList.add((Integer) list.get(i));
            }
        }

        // print odd and even numbers
        helper.print("Odd numbers:");
        for (int i = 0; i < oddList.size(); i++) {
            // cast int to String
            helper.print(oddList.get(i).toString());
        }

        helper.print("Even numbers:");
        for (int i = 0; i < evenList.size(); i++) {
            helper.print(evenList.get(i).toString());
        }

    }

}
