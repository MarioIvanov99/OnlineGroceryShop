package org.example.warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {
    private int x;
    private int y;

    public int distanceTo(Coordinate other) {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }
}
