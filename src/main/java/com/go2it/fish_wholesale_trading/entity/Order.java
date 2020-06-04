package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;


@Entity(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "order_date")
    private LocalDate orderDate;
    @Column(name = "order_price")
    private double orderPrice;

    public Order() {
    }

    @ManyToOne
    @JoinColumn(name = "manager_user_id")
    private User managerUser;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User employeeUser;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private Collection<Payment> orderPayments;

    @OneToMany(mappedBy = "shipmentOrder", fetch = FetchType.EAGER)
    private Collection<Shipment> orderShipments;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private Collection<OrderDetail> orderDetails;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public User getManagerUser() {
        return managerUser;
    }

    public void setManagerUser(User managerUser) {
        this.managerUser = managerUser;
    }

    public User getEmployeeUser() {
        return employeeUser;
    }

    public void setEmployeeUser(User employeeUser) {
        this.employeeUser = employeeUser;
    }

    public Collection<Payment> getOrderPayments() {
        return orderPayments;
    }

    public void setOrderPayments(Collection<Payment> orderPayments) {
        this.orderPayments = orderPayments;
    }

    public Collection<Shipment> getOrderShipments() {
        return orderShipments;
    }

    public void setOrderShipments(Collection<Shipment> orderShipments) {
        this.orderShipments = orderShipments;
    }

    public Collection<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Collection<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                ", managerUser=" + managerUser +
                ", employeeUser=" + employeeUser +
                '}';
    }
}
