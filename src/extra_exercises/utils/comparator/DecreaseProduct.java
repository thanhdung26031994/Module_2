package extra_exercises.utils.comparator;

import extra_exercises.model.Product;

import java.util.Comparator;
import java.util.Objects;

public class DecreaseProduct implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        if (Objects.equals(o1.getPrice(), o2.getPrice())){
            return  0;
        }else if (o1.getPrice() >= o2.getPrice()){
            return -1;
        }else {
            return 1;
        }
    }
}
