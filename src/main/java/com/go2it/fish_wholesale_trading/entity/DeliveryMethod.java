package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "delivery_method")
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_method_id")
    private int deliveryMethodId;
    @Column(name = "name")
    private String deliveryMethodName;
    @Column(name = "description")
    private String deliveryMethodDescription;

    @OneToMany(mappedBy = "deliveryMethod")
    private Collection<Shipment> deliveryMethodShipments;

    public DeliveryMethod() {
    }

    public int getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(int deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public String getDeliveryMethodName() {
        return deliveryMethodName;
    }

    public void setDeliveryMethodName(String deliveryMethodName) {
        this.deliveryMethodName = deliveryMethodName;
    }

    public String getDeliveryMethodDescription() {
        return deliveryMethodDescription;
    }

    public void setDeliveryMethodDescription(String deliveryMethodDescription) {
        this.deliveryMethodDescription = deliveryMethodDescription;
    }

    public Collection<Shipment> getDeliveryMethodShipments() {
        return deliveryMethodShipments;
    }

    public void setDeliveryMethodShipments(Collection<Shipment> deliveryMethodShipments) {
        this.deliveryMethodShipments = deliveryMethodShipments;
    }

    @Override
    public String toString() {
        return "DeliveryMethod{" +
                "deliveryMethodId=" + deliveryMethodId +
                ", deliveryMethodName='" + deliveryMethodName + '\'' +
                ", deliveryMethodDescription='" + deliveryMethodDescription + '\'' +
                '}';
    }
}
