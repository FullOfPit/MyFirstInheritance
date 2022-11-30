package Smartphone;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

@Data
@AllArgsConstructor
public class Smartphone implements Radio, GPS{
    String brandName;
    String modelName;
    Contact[] contacts;

    public Smartphone() {
    }

    public void addContact(Contact contact) {
        Contact[] updatedContactList = Arrays.copyOf(this.contacts, this.contacts.length + 1);
        updatedContactList[updatedContactList.length - 1] = contact;
        this.contacts = updatedContactList;

    }

    public Contact getContactByIndex(int index) {
        return this.contacts[index];
    }

    public Contact getContactByName(String name) {
        Contact contactToBeReturned = null;
        for (int i = 0; i < (this.contacts.length - 1); i++) {
            System.out.println(this.contacts[i].nameOfContact);
            if (this.contacts[i].getName().equals(name)) {
                return this.contacts[i];
            }
        }
        return contactToBeReturned;
    }
    /*
    public void removeContactByName(String name) {
        Contact[] updateContactList = new Contact[this.contacts.length - 1];
        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i].getName() != name) {
                updateContactList[i] = this.contacts[i];
            }else if (this.contacts[i].getName() == name) {
                continue;
            }
        }
        this.contacts = updateContactList;
    }

     */


    @Override
    public String getPosition() {
        return "cologne";
    }

    @Override
    public boolean startRadio() {
        return true;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", contact=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(getBrandName(), that.getBrandName()) && Objects.equals(getModelName(), that.getModelName()) && Arrays.equals(getContacts(), that.getContacts());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getBrandName(), getModelName());
        result = 31 * result + Arrays.hashCode(getContacts());
        return result;
    }
}
