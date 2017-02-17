package org.apitesting.client.namespace.country;


import org.apitesting.client.base.Response;

import java.util.List;

public interface ICountryNamespace {
    Response<List<Country>> getAllCountries();
    Response<Country> getCountryByCode(int code);
}
