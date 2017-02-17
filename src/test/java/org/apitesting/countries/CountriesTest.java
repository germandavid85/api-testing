package org.apitesting.countries;

import org.apitesting.client.Client;
import org.apitesting.client.base.Response;
import org.apitesting.client.namespace.country.Country;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.junit.Assert.*;

public class CountriesTest {
    @Test
    public void getAllCountriesTest() {
        Client apiClient = new Client("http://restcountries.eu");

        Response<Country> countryResponse  = apiClient.getCountry().getCountryByCode(7);
        Country russia = countryResponse.getBody();

        assertEquals("Incorrect response code", HttpStatus.OK, countryResponse.getHttpStatus());
        assertEquals("Incorrect number of countries", "Russia", russia.getName());

        Response<List<Country>> regionCountriesResponse = apiClient.getRegion().getRegionByName(russia.getRegion());
        List<Country> regionCountries = regionCountriesResponse.getBody();
        assertEquals("Incorrect response code", HttpStatus.OK, regionCountriesResponse.getHttpStatus());
        assertEquals("Incorrect number of countries", 53, regionCountries.size());
    }
}
