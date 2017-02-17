package org.apitesting.client.namespace.region;

import org.apitesting.client.base.Response;
import org.apitesting.client.namespace.country.Country;

import java.util.List;

class RegionNamespace implements IRegionNamespace {
    private final RegionRequest regionRequest = new RegionRequest();

    @Override
    public Response<List<Country>> getRegionByName(final String regionName) {
        return regionRequest.getRegionByName(regionName);
    }
}
