package lambda.expresion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionProduct {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<Product>();
        list.add(new Product(1, "samsunt S10", 15000f));
        list.add(new Product(2, "Iphone 13 proMax", 32000f));
        list.add(new Product(3, "Iphone 10", 14000f));
        list.add(new Product(4, "Lenovi vibe", 19000f));
        list.add(new Product(5, "Redmi 4", 12000f));

        Stream<Product> filtered_data =list.stream().filter(p->p.price>20000);

        filtered_data.forEach(product -> System.out.println(product.name+":"+product.price));
    }

}
