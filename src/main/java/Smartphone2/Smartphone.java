package Smartphone2;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{
    public String brandName;
    public String modelName;
    public Contact[] contacts;

    public Smartphone() {

    }
    public Smartphone(String brandName, String modelName, Contact[] contacts) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        if (this.contacts == null) {
            Contact[] newContactList ={};
            this.contacts = newContactList;
        }
        Contact[] updatedContactList = Arrays.copyOf(this.contacts, this.contacts.length + 1);
        updatedContactList[this.contacts.length] = contact;
        this.contacts = updatedContactList;

    }

    public Contact getContactByIndex(int index) {
        return this.contacts[index];
    }

    public Contact getContactByName(String name) {
        Contact contactToReturn = null;
        for (Contact cont : this.contacts) {
            if (cont.getName().equals(name)) {
                contactToReturn = cont;
            }
        }
        return contactToReturn;
    }

    public Contact removeContactByName(String name) {
        Contact[] updatedContactList = Arrays.copyOf(this.contacts, this.contacts.length - 1);
        Contact contactToBeRemoved = null;
        int indexToBeRemoved = 0;
        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i].getName().equals(name)) {
                indexToBeRemoved = i;
                contactToBeRemoved = this.contacts[i];
            }
        }
        for (int i = 0; i < indexToBeRemoved; i++) {
            updatedContactList[i] = this.contacts[i];
        }
        for (int i = indexToBeRemoved; i < this.contacts.length - 1; i++) {
            updatedContactList[i] = this.contacts[i + 1];
        }
        this.contacts = updatedContactList;
        return contactToBeRemoved;

    }


    @Override
    public String getPosition() {
        return "Cologne";
    }

    @Override
    public boolean startRadio() {
        return true;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }
}
