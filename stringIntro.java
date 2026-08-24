import javax.sound.midi.SysexMessage;
import java.util.*;
public class stringIntro{
    public static void main(String[] args){
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
    }
}