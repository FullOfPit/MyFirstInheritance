package Smartphone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data

public class Friend extends Contact{
    public int telefonNum;

    public Friend(){
    }
    public Friend(String name, int telefonNum) {
        this.nameOfContact = name;
        this.telefonNum = telefonNum;
    }

    @Override
    public String getName() {
        return this.nameOfContact;
    }

    @Override
    public String toString() {
        return "Friend{" +
                ", nameOfContact='" + nameOfContact + '\'' +
                "telefonNum=" + telefonNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return getTelefonNum() == friend.getTelefonNum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTelefonNum());
    }
}

