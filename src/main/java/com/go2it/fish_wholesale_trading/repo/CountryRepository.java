package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Country;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CountryRepository implements ICountryRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Country country) {
        em.persist (country);
    }

    @Override
    public boolean update(Country country) {
        if (country != null) {
            em.persist (country);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update world_region, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Country country) {
        if (country != null) {
            em.remove (country);
            System.out.println (" Country was removed");
            return true;
        }
        return false;
    }

    @Override
    public Country findById(int countryId) {
        Country country = em.find (Country.class, countryId);
        return country;
    }

    @Override
    public List<Country> getAll() {
        TypedQuery<Country> query = em.createQuery ("SELECT c FROM country c", Country.class);
        return query.getResultList ( );
    }
}
