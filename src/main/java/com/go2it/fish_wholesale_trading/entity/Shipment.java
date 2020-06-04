package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
@Entity(name = "shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipment_id")
    private int shipmentId;
    @Column(name = "total_weight")
    private double totalWeight;
    @Column(name = "shippedDate")
    private LocalDate shippedDate;


    @ManyToOne
    @JoinColumn(name ="order_id")
    private Order shipmentOrder;

    @ManyToOne
    @JoinColumn(name ="shipper_user_id") // todo : check the userId
    private User shipperUser;

    @ManyToOne
    @JoinColumn(name ="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name ="delivery_method_id")
    private DeliveryMethod deliveryMethod;

    public Shipment() {
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Order getShipmentOrder() {
        return shipmentOrder;
    }

    public void setShipmentOrder(Order shipmentOrder) {
        this.shipmentOrder = shipmentOrder;
    }

    public User getShipperUser() {
        return shipperUser;
    }

    public void setShipperUser(User shipperUser) {
        this.shipperUser = shipperUser;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", totalWeight=" + totalWeight +
                ", shippedDate=" + shippedDate +
                '}';
    }
}
