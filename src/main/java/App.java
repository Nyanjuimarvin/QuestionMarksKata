/*
*
* Write a program that will take an input string parameter and determine if exactly 3 question marks exist between every pair of numbers that add up to 10. If so, return true, otherwise return false
   * Examples:
    "arrb6???4xxbl5???eee5" => true
    "5??aaaaaaaaaaaaaaaaaaa?5?5" => false
    "9???1???9???1???9" => true
    "aa6?9" => false
*
* */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean qs_SumUpToTen(String checkWord){

        //Regex to check required pattern
        /*
        [1-9]\?\?\?[1-9]
         Any digit between 1-9 followed by
         3 question marks then another digit between 1-9
         */

        //Create a pattern from the regex
        Pattern quesNum = Pattern.compile("[1-9]\\?\\?\\?[1-9]");

        //Look for the matching pattern in given string variable
        Matcher m = quesNum.matcher(checkWord);

        //String variable to store the found pattern
        String foundPattern;


        //Conditional to check whether the pattern was found
        if(m.find()){
            //Initialize foundPattern with the pattern that was found in the given String
            foundPattern = m.group();


            System.out.println(foundPattern);

            /*
            * First Digit = foundPattern.charAt(0) - '0'
            * Last Digit = foundPattern.charAt(foundPattern.length() - 1) - '0'
            *
            * If the First Digit
            * and Last Digit in the string  add up to 10
            * return true
            * 
            * */
            return foundPattern.charAt(0) - '0' + foundPattern.charAt(foundPattern.length() - 1) - '0' == 10;
        }

        return false;
    }

}
