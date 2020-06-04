package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Country;

import java.util.List;

public interface ICountryRepository {

    public void save(Country country);
    public boolean update(Country country);
    public boolean remove(Country country);
    public Country findById(int countryId);
    public List<Country>getAll();
}
