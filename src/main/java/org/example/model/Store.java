package org.example.model;

public class Store {

    // listProducts methodu
    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("-------------------------------");
        }
    }

    // Main methodu
    public static void main(String[] args) {
        // Chocolate, Coke ve Bread objelerinden birer adet oluşturuluyor
        ProductForSale chocolate = new Chocolate("Dark Chocolate", 5.99, "Delicious dark chocolate.", "Bitter");
        ProductForSale coke = new Coke("Coca-Cola", 1.99, "Refreshing soft drink.", 500);
        ProductForSale bread = new Bread("Whole Wheat Bread", 2.49, "Healthy whole grain bread.", true);

        // Ürünlerin yer aldığı dizi oluşturuluyor
        ProductForSale[] products = {chocolate, coke, bread};

        // Store nesnesi oluşturuluyor ve listProducts metoduna parametre olarak ürünler dizisi gönderiliyor
        Store store = new Store();
        store.listProducts(products);
    }
}
