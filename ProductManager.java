import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManager {
    public static List<Product> findProduct(List<Product> products, String name) {
        List<Product> newProducts = new ArrayList<>();
        for(Product product : products){
            if(Objects.equals(product.getNameProduct(), name)){
                newProducts.add(product);
            }
        }
        return newProducts;
    }
    public static List<Product> findProductByCategoryID(List<Product> products, long id) {
        List<Product> newProducts = new ArrayList<>();
        for(Product product : products){
            if(product.getCategoryId() == id){
                newProducts.add(product);
            }
        }
        return newProducts;
    }
    public static List<Product> findProductByPrice(List<Product> products, long price) {
        List<Product> newProducts = new ArrayList<>();
        for(Product product : products){
            if(product.getPrice() <= price){
                newProducts.add(product);
            }
        }
        return newProducts;
    }
}
