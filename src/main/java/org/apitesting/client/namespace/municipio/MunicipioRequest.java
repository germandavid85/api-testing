package org.apitesting.client.namespace.municipio;

import org.apitesting.client.base.ClientStore;
import org.apitesting.client.base.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

class MunicipioRequest {
    private static final String BASE_URL = (String) ClientStore.getInstance().get("baseUrl");

    private final RestTemplate restTemplate = new RestTemplate();

    Response<List<Municipio>> getAllMunicipios() {
        HttpHeaders header = new HttpHeaders();

        // TODO: create namespace for authorization and get the token from the store
        header.put("Authorization", Arrays.asList(""));
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<Municipio[]> municipiosResponse =
                restTemplate.exchange(
                        String.format("%s/api/municipios/", BASE_URL), HttpMethod.GET, entity, Municipio[].class);
        List<Municipio> municipioList = Arrays.asList(municipiosResponse.getBody());

        return  new Response<>(municipiosResponse.getStatusCode(), municipiosResponse.getHeaders(), municipioList);
    }
}
