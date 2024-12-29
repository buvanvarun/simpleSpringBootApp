package com.project.SimpleWebSpringBootApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private double price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    // for image
    private String imageName;
    private String imageType;
    // Lob - large object annotation
    @Lob
    private byte[] imageData;


//    public Product(int id, String name, String description, String brand, double price, String category, Date releaseDate, boolean productAvailable, int stockQuantity, String imageName, String imageType, byte[] imageData) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.brand = brand;
//        this.price = price;
//        this.category = category;
//        this.releaseDate = releaseDate;
//        this.productAvailable = productAvailable;
//        this.stockQuantity = stockQuantity;
//        this.imageName = imageName;
//        this.imageType = imageType;
//        this.imageData = imageData;
//    }
//    public Product() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String desc) {
//        this.description = desc;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
////    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
//    public Date getReleaseDate() {
//        return releaseDate;
//    }
//
////    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY")
//    public void setReleaseDate(Date releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public boolean isProductAvailable() {
//        return productAvailable;
//    }
//
//    public void setProductAvailable(boolean productAvailable) {
//        this.productAvailable = productAvailable;
//    }
//
//    public int getStockQuantity() {
//        return stockQuantity;
//    }
//
//    public void setStockQuantity(int stockQuantity) {
//        this.stockQuantity = stockQuantity;
//    }
//
//    public String getImageName() {
//        return imageName;
//    }
//
//    public void setImageName(String imageName) {
//        this.imageName = imageName;
//    }
//
//    public String getImageType() {
//        return imageType;
//    }
//
//    public void setImageType(String imageType) {
//        this.imageType = imageType;
//    }
//
//    public byte[] getImageData() {
//        return imageData;
//    }
//
//    public void setImageData(byte[] imageData) {
//        this.imageData = imageData;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", desc='" + description + '\'' +
//                ", brand='" + brand + '\'' +
//                ", price=" + price +
//                ", category='" + category + '\'' +
//                ", releaseDate='" + releaseDate + '\'' +
//                ", available=" + productAvailable +
//                ", quantity=" + stockQuantity +
//                '}';
//    }
}