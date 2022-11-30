package Smartphone;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessContact extends Contact{
    String companyName;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                ", nameOfContact='" + nameOfContact + '\'' +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
