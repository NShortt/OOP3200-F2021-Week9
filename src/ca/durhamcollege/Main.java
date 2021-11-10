/**
 * @author Nicholas Shortt
 * @studentID 100630003
 * @date November 8, 2021
 */
package ca.durhamcollege;

import java.util.Scanner;

public class Main
{
    /**
     * This method gets a string from the console
     * @param prompt a friendly message to show the user
     * @param object the object type to store the console input
     * @return the value from the console
     */
    public static Object getConsoleInput(String prompt, Object object)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "String":
                return keyboard.nextLine();
            case "Integer":
                return keyboard.nextInt();
            case "Float":
                return keyboard.nextFloat();
            default:
                return keyboard.nextLine();
        }
    }

    /**
     * This method prints the log to the console
     * @param log string array of input lines
     */
    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    /**
     * Entry Point for application
     * @param args
     */
    public static void main(String[] args)
    {
        int intNumber = 0;
        float floatNumber = 0.0f;
        String stringInput = "";

        stringInput = (String) getConsoleInput("Enter a String: ", stringInput);
        System.out.println("Our String is: " + stringInput);

        intNumber = (int) getConsoleInput("Enter a Integer: ", intNumber);
        System.out.println("Our Integer is: " + intNumber);

        floatNumber = (float) getConsoleInput("Enter a float: ", floatNumber);
        System.out.println("Our Float is: " + floatNumber);

    }
}
