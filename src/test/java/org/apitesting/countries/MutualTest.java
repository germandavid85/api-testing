package org.apitesting.countries;

import org.apitesting.client.Client;
import org.apitesting.client.base.Response;
import org.apitesting.client.namespace.municipio.Municipio;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.junit.Assert.*;

public class MutualTest {

    @Test
    public void testMunicipios() {
        Client apiClient = new Client("http://eter:8082");
        Response<List<Municipio>> allMunicipiosResponse = apiClient.getMunicipio().getAllMunicipios();

        assertEquals("Incorrect response code", HttpStatus.OK, allMunicipiosResponse.getHttpStatus());

        List<Municipio> allMunicipios = allMunicipiosResponse.getBody();

        assertEquals("Incorrect number of municipios", 1116, allMunicipios.size());
    }
}
