package Smartphone2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;



public class Friend extends Contact{


    public Friend(){
    }
    public Friend(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getNum(){
        return this.num;
    }

    @Override
    public String toString() {
        return "Friend{" +
                ", name='" + name + '\'' +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return getNum() == friend.getNum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum());
    }
}
