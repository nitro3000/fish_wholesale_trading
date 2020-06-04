package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Country;

import java.util.List;

public interface ICountryService {

    public void save(Country country);
    public boolean update(Country country);
    public boolean remove(Country country);
    public Country finById(int countryId);
    public List<Country> getAll();

}
