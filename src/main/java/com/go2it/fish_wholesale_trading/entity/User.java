package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String password;
    private String username;
    private int phone;
    @OneToOne
    private Role role;

    public User() {
    }

    @OneToMany(mappedBy = "user" , fetch = FetchType.EAGER)
    private Collection<Location> userLocations;

    @OneToMany(mappedBy = "user" , fetch = FetchType.EAGER)
    private Collection<Payment> userPayments;

    @OneToMany(mappedBy = "shipperUser" , fetch = FetchType.EAGER)
    private Collection<Shipment> userShipments;

    @OneToMany(mappedBy = "managerUser" , fetch = FetchType.EAGER) //todo check mappedBy....
    private Collection<Order> userOrders;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Collection<Location> getUserLocations() {
        return userLocations;
    }

    public void setUserLocations(Collection<Location> userLocations) {
        this.userLocations = userLocations;
    }

    public Collection<Payment> getUserPayments() {
        return userPayments;
    }

    public void setUserPayments(Collection<Payment> userPayments) {
        this.userPayments = userPayments;
    }

    public Collection<Shipment> getUserShipments() {
        return userShipments;
    }

    public void setUserShipments(Collection<Shipment> userShipments) {
        this.userShipments = userShipments;
    }

    public Collection<Order> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(Collection<Order> userOrders) {
        this.userOrders = userOrders;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", phone=" + phone +
                ", role=" + role +
                '}';
    }
}
