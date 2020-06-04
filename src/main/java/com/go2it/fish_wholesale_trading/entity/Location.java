package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationId;
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "street_address")
    private String streetAddress;

    @ManyToOne @JoinColumn(name ="country_id")
    private Country country;

    @ManyToOne @JoinColumn(name ="user_id")
    private User user;

    @OneToMany(mappedBy = "location" , fetch = FetchType.EAGER)
    private Collection<Warehouse> warehouses;

    public Location() {
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(Collection<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                '}';
    }
}
