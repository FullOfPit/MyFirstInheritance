package Smartphone2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void SmartphoneContactListTest(){
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Friend[] newContactArray = {new Friend(), new Friend(), new Friend()};
        //When
        Contact[] actual = new Smartphone("Apple", "iPhone 9", newContactArray).contacts;
        //Then
        Assertions.assertEquals(newContactArray, actual);

    }

    @Test
    void SmartphoneContactListTest_WithBusinessContacts(){
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Contact[] newContactArray = {new Friend(), new Friend(), new Friend(), new BusinessContact(), new BusinessContact()};
        //When
        Contact[] actual = new Smartphone("Apple", "iPhone 9", newContactArray).contacts;
        //Then
        Assertions.assertEquals(newContactArray, actual);

    }



    @Test
    void getPosition() {
        //Given
        Smartphone testPhone = new Smartphone();
        //When
        String actual = testPhone.getPosition();
        //Then
        Assertions.assertEquals("Cologne", actual);

    }

    @Test
    void startRadio() {
        //Given
        Smartphone testPhone = new Smartphone();
        //When
        boolean actual = testPhone.startRadio();
        //Then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void stopRadio() {
        //Given
        Smartphone testPhone = new Smartphone();
        //When
        boolean actual = testPhone.stopRadio();
        //Then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void SmartphoneAddsContactToEmptyList() {
        //Given
        Smartphone newPhone = new Smartphone();
        Friend claudia = new Friend("Claudia", 3568);
        //When
        newPhone.addContact(claudia);
        Contact actual = newPhone.contacts[0];
        //Then
        Assertions.assertEquals(claudia, actual);
    }

    @Test
    void SmartphoneAddsContactToExisitingList() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Contact[] newContactList ={claudia, elias};
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", newContactList);
        //When
        Friend adrian = new Friend("Adrian", 8759);
        newPhone.addContact(adrian);
        Contact actual = newPhone.contacts[2];
        //Then
        Assertions.assertEquals(adrian, actual);
    }

    @Test
    void SmartphoneAddSecondContactToExisitingList() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Contact[] newContactList ={claudia};
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", newContactList);
        //When
        Friend elias = new Friend("Elias", 5730);
        newPhone.addContact(elias);
        Contact actual = newPhone.contacts[1];
        //Then
        Assertions.assertEquals(elias, actual);
    }

    @Test
    void Smartphone_getNameFromAddedContact() {
        //Given
        Smartphone newPhone = new Smartphone();
        Friend claudia = new Friend("Claudia", 3568);
        //When
        newPhone.addContact(claudia);
        Contact actual = newPhone.contacts[0];
        //Then
        Assertions.assertEquals(claudia.getName(), actual.getName());
    }

    @Test
    void Smartphone_getContactByIndex() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", new Friend[]{claudia, elias, adrian});
        //When
        Contact actual = newPhone.getContactByIndex(1);
        //Then
        Assertions.assertEquals(elias, actual);
    }

    @Test
    void Smartphone_getContactByName() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", new Friend[]{claudia, elias, adrian});
        //When
        Contact actual = newPhone.getContactByName("Adrian");
        //Then
        Assertions.assertEquals(adrian, actual);
    }

    @Test
    void Smartphone_getContactByName_returnNullWhenContactNotFound() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", new Friend[]{claudia, elias, adrian});
        //When
        Contact actual = newPhone.getContactByName("Doreen");
        //Then
        Assertions.assertEquals(null, actual);
    }

    @Test
    void Smartphone_removeContactByName_returnsContact() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", new Friend[]{claudia, elias, adrian});
        //When
        Contact actual = newPhone.removeContactByName("Elias");
        //Then
        Assertions.assertEquals(elias, actual);

    }

    @Test
    void Smartphone_removeContactByName_adjustContactListLength() {
        //Given
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", new Friend[]{claudia, elias, adrian});
        //When
        Contact removedContact = newPhone.removeContactByName("Elias");
        int actual = newPhone.contacts.length;
        //Then
        Assertions.assertEquals(2, actual);

    }

    @Test
    void Smartphone_removeContactByName_RemovedContactIsRemovedFromContactList() {
        Friend claudia = new Friend("Claudia", 3568);
        Friend elias = new Friend("Elias", 5730);
        Friend adrian = new Friend("Adrian", 8759);
        Smartphone newPhone = new Smartphone("Apple", "iPhone 9", new Friend[]{claudia, elias, adrian});
        //When
        Contact removedContact = newPhone.removeContactByName("Elias");
        Contact actual = newPhone.getContactByName("Elias");
        //Then
        Assertions.assertEquals(null, actual);

    }




}