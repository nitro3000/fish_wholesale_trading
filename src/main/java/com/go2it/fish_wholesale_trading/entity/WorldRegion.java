package com.go2it.fish_wholesale_trading.entity;


import javax.persistence.*;
import java.util.Collection;

@Entity(name = "world_region")
public class WorldRegion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "world_region_id")
    private int worldRegionId;
    @Column(name = "region_name")
    private String regionName;

    @OneToMany(mappedBy = "worldRegion", fetch = FetchType.EAGER)// mapped by field "worldRegion" at Country class
    private Collection<Country> worldRegionCountries;

    public WorldRegion() {
    }

    public int getWorldRegionId() {
        return worldRegionId;
    }
    public void setWorldRegionId(int world_region_id) {
        this.worldRegionId = world_region_id;
    }
    public String getRegionName() {
        return regionName;
    }
    public void setRegionName(String region_name) {
        this.regionName = region_name;
    }
    public Collection<Country> getWorldRegionCountries() {
        return worldRegionCountries;
    }
    public void setWorldRegionCountries(Collection<Country> countries) {
        this.worldRegionCountries = countries;
    }

    @Override
    public String toString() {
        return "World_region{" +
                "world_region_id=" + worldRegionId +
                ", region_name='" + regionName + '\'' +
                '}';
    }
}
