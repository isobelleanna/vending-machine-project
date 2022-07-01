package org.example;

import java.text.DecimalFormat;

public class Product {
    private boolean inStock;
    private final String name;
    private String category;
    private final String id;
    private final double price;
    private int stock;
    private static int productCount = 0;

    public static void setProductCount(int productCount) {
        Product.productCount = productCount;
    }

    public Product(String name, String category, double price) {
        this.name = name;
        this.id = String.valueOf(productCount) +  name.charAt(0);
        this.category = category;
        this.price = price;
        this.stock = (int) (Math.random() * 20 + 1);
        this.inStock = true;
        setProductCount(productCount + 1);
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(this.stock + stock >= 20){
            this.stock = 20;
        }else {
            this.stock = stock;
        }

    }
    public void buyProduct() {
        if (this.stock == 1){
            setStock(0);
            setInStock(false);
        }else {
            setStock(this.stock - 1);
        }

    }
    @Override
    public String toString(){
        return "\n"+ id + "-" + name + " £" + price + ", Stock Available: " + inStock + ", Total Stock: "+ stock;
        //return String.format("\n%s £%d Stock: %d",name, price, stock);
    }

}
