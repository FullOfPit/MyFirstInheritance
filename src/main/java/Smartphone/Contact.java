package Smartphone;

import java.util.Objects;

public abstract class Contact {
    String nameOfContact;

    public abstract String getName();

    @Override
    public String toString() {
        return "Contact{" +
                "nameOfContact='" + nameOfContact + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(nameOfContact, contact.nameOfContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfContact);
    }
}
