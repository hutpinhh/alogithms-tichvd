import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        ProductManager productManager = new ProductManager();
        products.add(new Product(1,"CPU",750L,10 ));
        products.add(new Product(2,"RAM",50L,2 ));
        products.add(new Product(2,"HDD",70L,1 ));
        products.add(new Product(1,"Main",400L,3 ));
        products.add(new Product(4,"Keyboard",30L,8 ));
        products.add(new Product(4,"Mouse",25L,50 ));
        products.add(new Product(3,"VGA",60L,35 ));
        products.add(new Product(2,"Monitor",120L,28 ));
        products.add(new Product(5,"Case",120L,28 ));
        products = productManager.findProductByPrice(products,25L);
        for(Product product : products){
            System.out.println(product);
        }
    }
}
