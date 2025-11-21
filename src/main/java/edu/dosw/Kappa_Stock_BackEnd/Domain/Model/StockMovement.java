package edu.dosw.Kappa_Stock_BackEnd.Domain.Model;

import java.time.LocalDateTime;

public class StockMovement {
    private String id;
    private String productId;
    private String type;
    private Integer quantity;
    private String reason;
    private LocalDateTime movementDate;

    public StockMovement() {}

    public StockMovement(String id, String productId, String type, Integer quantity,
                         String reason, LocalDateTime movementDate) {
        this.id = id;
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
        this.reason = reason;
        this.movementDate = movementDate;
    }

    public static StockMovement createEntry(String id, String productId, Integer quantity, String reason) {
        return new StockMovement(id, productId, "ENTRADA", quantity, reason, LocalDateTime.now());
    }

    public static StockMovement createExit(String id, String productId, Integer quantity, String reason) {
        return new StockMovement(id, productId, "SALIDA", quantity, reason, LocalDateTime.now());
    }

    public static StockMovement createAdjustment(String id, String productId, Integer quantity, String reason) {
        return new StockMovement(id, productId, "AJUSTE", quantity, reason, LocalDateTime.now());
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDateTime getMovementDate() { return movementDate; }
    public void setMovementDate(LocalDateTime movementDate) { this.movementDate = movementDate; }
}