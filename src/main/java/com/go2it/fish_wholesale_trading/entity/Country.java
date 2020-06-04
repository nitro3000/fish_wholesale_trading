package com.go2it.fish_wholesale_trading.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private int countryId;
    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "world_region_id")
    private WorldRegion worldRegion;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private Collection<Location> CountryLocations;

    public Country() {
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int country_id) {
        this.countryId = country_id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String country_name) {
        this.countryName = country_name;
    }

    public WorldRegion getWorldRegion() {
        return worldRegion;
    }

    public void setWorldRegion(WorldRegion world_region) {
        this.worldRegion = world_region;
    }

    public Collection<Location> getCountryLocations() {
        return CountryLocations;
    }

    public void setCountryLocations(Collection<Location> countryLocations) {
        CountryLocations = countryLocations;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + countryId +
                ", country_name='" + countryName + '\'' +
                '}';
    }
}
