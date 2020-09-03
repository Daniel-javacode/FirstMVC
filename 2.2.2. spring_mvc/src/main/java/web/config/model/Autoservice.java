package web.config.model;

import java.util.ArrayList;
import java.util.List;

public class Autoservice {

    public List<Car> getCars() {
        List<Car> result = new ArrayList<>();
        result.add(new Car("Toyota",15,"Corolla"));
        result.add(new Car("Cadillac", 125,"XT5"));
        result.add(new Car("Porsche",5,"Macan"));
        return result;
    }
}
