package com.eciexpress.inventory.domain;

import java.time.LocalDateTime;

public class StockAlert {
    private String id;
    private String productId;
    private String type;
    private Integer currentStock;
    private Integer minStockLevel;
    private LocalDateTime alertDate;
    private Boolean resolved;

    public StockAlert() {}

    public StockAlert(String id, String productId, String type, Integer currentStock,
                      Integer minStockLevel, LocalDateTime alertDate, Boolean resolved) {
        this.id = id;
        this.productId = productId;
        this.type = type;
        this.currentStock = currentStock;
        this.minStockLevel = minStockLevel;
        this.alertDate = alertDate;
        this.resolved = resolved;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getCurrentStock() { return currentStock; }
    public void setCurrentStock(Integer currentStock) { this.currentStock = currentStock; }

    public Integer getMinStockLevel() { return minStockLevel; }
    public void setMinStockLevel(Integer minStockLevel) { this.minStockLevel = minStockLevel; }

    public LocalDateTime getAlertDate() { return alertDate; }
    public void setAlertDate(LocalDateTime alertDate) { this.alertDate = alertDate; }

    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean resolved) { this.resolved = resolved; }
}