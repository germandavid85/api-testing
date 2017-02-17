package org.apitesting.client.namespace.region;

import org.apitesting.client.base.Response;
import org.apitesting.client.namespace.country.Country;

import java.util.List;

public interface IRegionNamespace {
    Response<List<Country>> getRegionByName(String regionName);
}
