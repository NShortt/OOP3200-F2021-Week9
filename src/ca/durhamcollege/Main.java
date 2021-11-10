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
    public static void printLog(int[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void buildLog(int[] log)
    {
        for (int i = 0; i < Config.NUM_OF_INT; i++)
        {
            log[i] = (int) getConsoleInput("Enter your Integer: ", log[i]);
        }
    }

    public static void printLog(float[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void buildLog(float[] log)
    {
        for (int i = 0; i < Config.NUM_OF_FLOAT; i++)
        {
            log[i] = (float) getConsoleInput("Enter your Float: ", log[i]);
        }
    }

    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void buildLog(String[] log)
    {
        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            log[i] = "";
            log[i] = (String) getConsoleInput("Enter your String: ", log[i]);
        }
    }


    /**
     * Entry Point for application
     * @param args
     */
    public static void main(String[] args)
    {
        String[] log = new String[Config.NUM_OF_STRINGS];
        int[] intLog = new int[Config.NUM_OF_INT];
        float[] floatLog = new float[Config.NUM_OF_FLOAT];

        buildLog(log);
        printLog(log);
        System.out.println();

        buildLog(intLog);
        printLog(intLog);
        System.out.println();/// Blank line

        buildLog(floatLog);
        printLog(floatLog);
    }
}
