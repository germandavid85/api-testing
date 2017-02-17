package org.apitesting.client.namespace.region;

import org.apitesting.client.base.ClientStore;
import org.apitesting.client.base.Response;
import org.apitesting.client.namespace.country.Country;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RegionRequest {
    private static final String BASE_URL = (String) ClientStore.getInstance().get("baseUrl");

    private final RestTemplate restTemplate = new RestTemplate();

    Response<List<Country>> getRegionByName(final String regionName) {
        ResponseEntity<Country[]> countries =
            restTemplate.exchange(
                String.format("%s/rest/v1/region/%s", BASE_URL, regionName), HttpMethod.GET, null, Country[].class);

        List<Country> allCountries = Arrays.asList(countries.getBody());
        return  new Response<>(countries.getStatusCode(), countries.getHeaders(), allCountries);
    }
}
