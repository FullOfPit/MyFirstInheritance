import Smartphone.Contact;
import Smartphone.Smartphone;
import Smartphone.Friend;

import Students2.ComputerScienceStudent;
import Students2.Student;

public class Main {
    public static void main(String[] args) {

        Friend florian = new Friend("Florian", 2638);
        Friend sebastian = new Friend("Sebastian", 8793);
        Friend abir = new Friend("Abir", 9846);
        Friend elias = new Friend("Elias", 6739);

        Friend[] contactList = {florian, sebastian, abir, elias};

        Smartphone apple = new Smartphone("Apple", "iPhone 9", contactList);

        Friend claudia = new Friend("Claudia", 8573);
        System.out.println(apple);
        apple.addContact(claudia);
        System.out.println(apple);
        System.out.println(apple.getContactByIndex(3));
        System.out.println(apple);
        System.out.println(apple.getContactByName("Claudia"));
        //apple.removeContactByName("Elias");
        System.out.println(apple);


    }
}
