package org.apitesting.client.namespace.country;

import org.apitesting.client.base.Response;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class CountryNamespace implements ICountryNamespace {
    private final CountryRequest countryRequest = new CountryRequest();

    @Override
    public Response<List<Country>> getAllCountries() {
        return countryRequest.getAllCountries();

    }

    @Override
    public Response<Country> getCountryByCode(int code) {
        return countryRequest.getCountryByCode(code);
    }
}
