package org.apitesting.client.namespace.region;

import org.apitesting.client.namespace.country.Country;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private final List<Country> countries = new ArrayList<>();

    public Region() {
    }

    public void setCountries(final List<Country> countries) {
        this.countries.clear();
        this.countries.addAll(countries);
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}
