package org.example.warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private int quantity;
    private Coordinate location;

    public void reduceQuantity(int amount) {
        if (amount > quantity)
            throw new IllegalArgumentException("Insufficient stock for " + name);
        quantity -= amount;
    }
}
