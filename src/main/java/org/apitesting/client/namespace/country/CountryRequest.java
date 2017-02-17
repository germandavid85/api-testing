package org.apitesting.client.namespace.country;

import org.apitesting.client.base.ClientStore;
import org.apitesting.client.base.Response;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

class CountryRequest {
    private static final String BASE_URL = (String) ClientStore.getInstance().get("baseUrl");

    private final RestTemplate restTemplate = new RestTemplate();

    Response<List<Country>> getAllCountries() {
        ResponseEntity<Country[]> countries =
            restTemplate.exchange(String.format("%s/rest/v1/all", BASE_URL), HttpMethod.GET, null, Country[].class);

        List<Country> allCountries = Arrays.asList(countries.getBody());
        return  new Response<>(countries.getStatusCode(), countries.getHeaders(), allCountries);
    }

    Response<Country> getCountryByCode(int code) {
        ResponseEntity<Country[]> countryResponse =
            restTemplate.exchange(
                String.format("%s/rest/v1/callingcode/%d", BASE_URL, code), HttpMethod.GET, null, Country[].class);

        Country country = countryResponse.getBody()[0];
        return  new Response<>(countryResponse.getStatusCode(), countryResponse.getHeaders(), country);
    }
}
