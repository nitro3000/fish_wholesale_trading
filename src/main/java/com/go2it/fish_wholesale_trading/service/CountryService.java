package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Country;
import com.go2it.fish_wholesale_trading.repo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService implements ICountryService{
    @Autowired
    private CountryRepository countryRepository;

    public CountryService() {
    }

    @Transactional
    @Override
    public void save(Country country) {
        countryRepository.save (country);
    }

    @Transactional
    @Override
    public boolean update(Country country) {
        return countryRepository.update (country);
    }

    @Transactional
    @Override
    public boolean remove(Country country) {
        return countryRepository.remove (country);
    }

    @Override
    public Country finById(int countryId) {
        return countryRepository.findById (countryId);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.getAll ();
    }
}
