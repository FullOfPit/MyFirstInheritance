package Students;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeutschStudent extends Student{
    public String sayMajor() {
        return "Deutsch";

    }
}
