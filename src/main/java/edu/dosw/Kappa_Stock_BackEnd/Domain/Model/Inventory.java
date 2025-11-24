package edu.dosw.Kappa_Stock_BackEnd.Domain.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "inventory")
public class Inventory {
    @Id
    private String productId;
    private int quantity;
    private Integer minStockLevel;

    public boolean hasStock() { return quantity > 0;}

    public boolean isLowStock() { return quantity <= minStockLevel; }

    public void reduceStock(Integer amount) { quantity-=amount; }

    public void increaseStock(Integer amount) { quantity+=amount; }

}
