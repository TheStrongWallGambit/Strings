import javax.sound.midi.SysexMessage;
import java.util.*;
public class stringIntro{
    public static void main(String[] args){

        double absolute = Math.abs(8.0);
        System.out.println(absolute);

        double exponent = Math.pow(5, 4);
        System.out.println(exponent);

        double sqrt = Math.sqrt(90);
        System.out.println(sqrt);

        double randNUmber = Math.random();//0.0 tp .9999999999999

        int num =5;
        double weight =7.89;

        Integer number = new Integer(5);//unboxing
        Integer number2 =5; // auto unboxing

        Double wBox = new Double(7.89); // boxing
        Double W = 7.89;// auto boxing

        System.out.println(number2 == num); //auto-unboxing
        System.out.println(wBox == weight); //auto-unboxing

        double newNum = wBox; //auto-unboxing
        int age = number2; // auto-unboxing

        int year = number2.intValue(); //unboxing
        int average = W.doubleValue(); //unboxing

        System.out.println(number2.MAX_VALUE);

        String s =new String("S");
        int v= Integer.parseInt(s);
        System.out.print(v);
        // .MAX_VALUE
        String address = new String("I Grizzly Way, Granite Bay, CA");//AP Test Way


        String location= "Yosemite National Park";

        System.out.println(address);
        System.out.println(location);
        // Method for AP Test
        System.out.println(address.length());

        String city = address.substring(14,24);
        System.out.println(city);

        String name = address.substring(9);
        System.out.println(name);

        int letterLocation = location.indexOf("Y");
        System.out.println(letterLocation);

        System.out.println("location".equals("address)"));//always when comparing objects

        String x = new String("hi");
        String y = new String("hi");

        String z = "hi";
        System.out.println(z=="hi");

        int compare = "Hi!".compareTo("Hi.");
        System.out.println(compare);

        String[] listOfLetters = location.split("a");
        System.out.println(Arrays.toString(listOfLetters));

        char letter = location.charAt(9);
        System.out.println(letter);
        boolean a = address.contains("Grizz"); // doesn't care about literal or object
        System.out.println(a);

        String g = "in";
        System.out.println(g.isEmpty());
        location = location.replace("a","*");
        System.out.println(location);
        location = location.toLowerCase();
        System.out.println(location);
        location = location.toUpperCase();
        System.out.println(location);
        location = location.trim();
        System.out.println(location);


    
    }
}