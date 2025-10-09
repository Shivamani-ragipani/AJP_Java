public class ProductList {
    int productID;
    String productName;
    String Brand;
    int price;


    public ProductList(int productID, String productName, String Brand, int price) {
        productID = this.productID;
        productName = this.productName;
        Brand = this.Brand;
        price = this.price;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", Brand='" + Brand + '\'' +
                ", price=" + price +
                '}';
    }
}
