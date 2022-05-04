

public class Product {
    private long categoryId;
    private String nameProduct;
    private Long price;
    private int quality;

    public Product() {
    }

    public Product(long categoryId, String nameProduct, Long price, int quality) {
        this.categoryId = categoryId;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quality = quality;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product{" +
                "categoryId=" + categoryId +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }
}
