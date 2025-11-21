package edu.dosw.Kappa_Stock_BackEnd.Domain.Model;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private Integer minStockLevel;
    private String category;
    private String imageUrl;
    private String pointOfSaleId;
    private Integer preparationTime;
    private Boolean available;

    public Product() {}

    public Product(String id, String name, String description, BigDecimal price, Integer stock,
                   Integer minStockLevel, String category, String imageUrl, String pointOfSaleId,
                   Integer preparationTime, Boolean available) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.minStockLevel = minStockLevel;
        this.category = category;
        this.imageUrl = imageUrl;
        this.pointOfSaleId = pointOfSaleId;
        this.preparationTime = preparationTime;
        this.available = available;
    }
    public boolean hasStock() {
        return stock > 0;
    }

    public boolean isLowStock() {
        return stock <= minStockLevel;
    }

    public void reduceStock(Integer quantity) {
        if (quantity > this.stock) {
            throw new IllegalArgumentException("Stock insuficiente");
        }
        this.stock -= quantity;
    }

    public void increaseStock(Integer quantity) {
        this.stock += quantity;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

    public Integer getMinStockLevel() { return minStockLevel; }
    public void setMinStockLevel(Integer minStockLevel) { this.minStockLevel = minStockLevel; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getPointOfSaleId() { return pointOfSaleId; }
    public void setPointOfSaleId(String pointOfSaleId) { this.pointOfSaleId = pointOfSaleId; }

    public Integer getPreparationTime() { return preparationTime; }
    public void setPreparationTime(Integer preparationTime) { this.preparationTime = preparationTime; }

    public Boolean getAvailable() { return available; }
    public void setAvailable(Boolean available) { this.available = available; }
}