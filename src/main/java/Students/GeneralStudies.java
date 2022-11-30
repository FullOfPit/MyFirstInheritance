package Students;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralStudies extends Student {
    public String sayMajor() {
        return "N/A";

    }
}
