package Students;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InformatikStudent extends Student{

    public String sayMajor() {
        return "Info";

    }

}
