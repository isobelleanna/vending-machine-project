package org.example;

public class Product {
    private String name;
    private String category;

    private String id;
    private int price;
    private int stock;

    private static int productCount = 0;

    public static int getProductCount() {
        return productCount;
    }

    public static void setProductCount(int productCount) {
        Product.productCount = productCount;
    }

    public Product(String name, String id, String category, int price) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
        this.stock = (int)(Math.random() * 20 + 1);
        setProductCount(productCount + 1);
    }

    public Product(String name, String category, int price){
        this(name, category, category + "-" + productCount, price);
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void buyProduct(){
        setStock(this.stock - 1);
    }


    public String getInfo(){
        return name + ", £" + price + ", Stock: " + stock;
    }
}
