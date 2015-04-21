package nyc.c4q;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Exercises {
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main (String args[]) {
        // Use main to test your methods
        print();
        returnSumOfOddNumbersBetween1And100();
        returnSumOfTheFirst200MultiplesOf3();
       System.out.println(stringSplit("hellogoodbye", "good"));


    }

    public static void print() {
        // print out "I'm sorry Dave, I'm afraid I can't let you do that."
        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that.");
    }

    public static boolean returnPrimitiveBooleanFalse() {
        return false;
    }

    public static int returnPrimitiveInt55Plus44() {
        return (55+ 44);
    }

    public static double returnPrimitiveDouble2Point718() {
        // This is the start of a famous mathematical constant.
        // What's that constant?
        return 2.718;
    }

    public static char returnPrimitiveCharASCII35() {
        // What's the character for the ASCII number 35?
        // Look at an ASCII table and return that character.
        // You can look at the ASCII table at http://www.asciitable.com/
        return '#';
    }

    public static boolean isEven(int n) {
        return (n%2==0);
    }

    public static boolean isMultipleOfX(int n, int x) {
        // 0 is a multiple of every number (except 0)
        // For example:
        //      isMultipleOfX(0, 3) == true
        //      isMultipleOfX(1, 3) == false
        //      isMultipleOfX(3, 3) == true
        //      isMultipleOfX(10, 3) == false
        //      isMultipleOfX(28, 7) == true
        // TODO expect a ArithmeticException in Test with x==0
        if (n == 0 && x!=0)
            return true;
        else if (n!=0 && x ==0)
            return false;
            else
            return(n % x == 0);
    }

    public static int returnSumOfOddNumbersBetween1And100() {
        // Starts with [1, 3, 5, ...]
        // Ends with   [..., 95, 97, 99]
        int total = 0;
        for(int i = 1; i < 101; i+=2)
        {
           total += i;
        }
      return total;
    }

    public static int returnSumOfTheFirst200MultiplesOf3() {
        // Starts with [0, 3, 6, ...]
        // Ends with   [..., 591, 594, 597]
        int total = 0;
        for(int i = 0; i < 200; i++)
        {
            total += (i * 3);
        }
        return total;
    }

    public static boolean isEmptyString(String str) {
        return (str.equals(""));
    }

    public static String alternateS1AndS2Xtimes(String s1, String s2, int x) {
        // Given string `s1`, `s2` and a positive integer `x`,
        // return a string that is equal to s1 + s2 repeated x times.
        // If x is 0 or negative negative, return an empty string `""`.
        // For example:
        //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
        String newStr = "";
        if (x==0 || x<0) {
            newStr =  "";
        }
        else {
            for(int i = 0; i < x ; i++)
            {
               newStr +=(s1 + s2);
            }
        }
        return newStr;
    }

    public static String stringSplit(String s, String splitOn) {
        // Given string s, return a string that stops at the first occurrence of "split".
        // For example:
        //      stringSplit("ubiquitous", "q").equals("ubi") == true
        //      stringSplit("hellogoodbye", "good").equals("hello") == true
        //      stringSplit("fancy seeing you", "there").equals("") == true
        // If the string does not contain split, then return the empty string "".
        String newStr = "";
        int occurrence = s.indexOf(splitOn);
        if (occurrence != -1)
        {
            newStr = s.substring(0, occurrence);
        }

        return newStr;
    }

    public static Singer returnBeyonce() {
      // should return an instance of Singer with the name "Beyonce" and location "USA"
        Singer beyonce = new Singer ("Beyonce", "USA");
        return beyonce;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {
      // should return an instance of Singer with the name of s1 and the location of s2.
      // For example:
      //      Singer queenB = new Singer("Beyonce", "USA");
      //      Singer rihanna = new Singer("Rihanna", "Barbados");
      //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados".

      Singer child = new Singer(s1.getName(), s2.getLocation());
        return child;
    }

    public static HashMap<String, Singer> returnSingers() {
        // should return a HashMap of the following singers:
        //      key="Beyonce",  Singer(name="Beyonce", location="USA")
        //      key="Jay-Z",    Singer(name="Jay-Z",   location="USA")
        //      key="Bieber",   Singer(name="Bieber",  location="Canada")
        //      key="Drake",    Singer(name="Drake",   location="Canada")
        //      key="Jepsen",   Singer(name="Jepsen",  location="Canada")

        Singer beyonce = new Singer("Beyonce", "USA");
        Singer jayz= new Singer("Jay-Z", "USA");
        Singer bieber = new Singer("Bieber", "Canada");
        Singer drake = new Singer("Drake", "Canada");
        Singer jepsen = new Singer("Jespen", "Canada");

        HashMap<String, Singer> singers = new HashMap<String, Singer>();
        singers.put("Beyonce",beyonce);
        singers.put("Jay-Z",jayz);
        singers.put("Bieber",bieber);
        singers.put("Drake",drake);
        singers.put("Jepsen",jepsen);
        return singers;
    }

    public static boolean isFromCanada(Singer person) {
        return (person.getLocation().equals("Canada"));
    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {
        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")

        people.get("Jay-Z").setLocation("Los Angeles");
    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people){
        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]

        people.remove("Jepsen");

    }

    // Bonus Problems
    public static void readFileAndOnlyPrintCanadianCelebrities() {
        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
        // https://commons.apache.org/proper/commons-csv/
      try {
        FileReader fr = new FileReader("celebrities.csv");
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }

    public static void readFileAndPrintCelebrityAges(){
        // TODO similar as above
    }
}
