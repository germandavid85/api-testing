package org.apitesting.client;

import org.apitesting.client.base.ClientStore;
import org.apitesting.client.namespace.country.CountryNamespaceFactory;
import org.apitesting.client.namespace.country.ICountryNamespace;
import org.apitesting.client.namespace.municipio.IMunicipioNamespace;
import org.apitesting.client.namespace.municipio.MunicipioNamespaceFactory;
import org.apitesting.client.namespace.region.IRegionNamespace;
import org.apitesting.client.namespace.region.RegionNamespaceFactory;

import java.util.Objects;

public class Client {
    private ICountryNamespace country;
    private IRegionNamespace region;
    private IMunicipioNamespace municipio;

    public Client(final String baseUrl) {
        Objects.requireNonNull(baseUrl);
        ClientStore<String, String> clientStore = ClientStore.getInstance();
        clientStore.put("baseUrl", baseUrl);
    }

    public ICountryNamespace getCountry() {
        if (country == null) {
            country = CountryNamespaceFactory.getCountryNamespace();
        }

        return country;
    }

    public IRegionNamespace getRegion() {
        if (region == null) {
            region = RegionNamespaceFactory.getRegionNamespace();
        }

        return region;
    }

    public IMunicipioNamespace getMunicipio() {
        if (municipio == null) {
            municipio = MunicipioNamespaceFactory.getMunicipio();
        }

        return municipio;
    }
}
