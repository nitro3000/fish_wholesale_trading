package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "warehouse")
public class Warehouse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_id")
    private int warehouseId;
    @Column(name = "available_weight")
    private double availableWeight;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

    public Warehouse() {
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public double getAvailableWeight() {
        return availableWeight;
    }

    public void setAvailableWeight(double availableWeight) {
        this.availableWeight = availableWeight;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseId=" + warehouseId +
                ", availableWeight=" + availableWeight +
                '}';
    }
}
