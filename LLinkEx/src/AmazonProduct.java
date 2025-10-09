import java.util.ArrayList;
import java.util.List;

public class AmazonProduct {
    public static void main(String args[]){
        List<ProductList> productlist = new ArrayList<ProductList>();           //Creating Arraylist with defined Class

        productlist.add(new ProductList(1, "Bag", "levi", 5000));       //Adding details of the product
        ProductList pl = new ProductList(2, "Laptop", "Lenovo", 80000);
        ProductList pl1 = new ProductList(3, "TV", "Sony", 50000);
        productlist.add(pl);
        productlist.add(pl1);


        System.out.println(productlist);            //displaying the details
    }
}
