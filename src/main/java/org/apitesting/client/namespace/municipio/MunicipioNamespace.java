package org.apitesting.client.namespace.municipio;

import org.apitesting.client.base.Response;

import java.util.List;

class MunicipioNamespace implements IMunicipioNamespace {
    private final MunicipioRequest request = new MunicipioRequest();

    @Override
    public Response<List<Municipio>> getAllMunicipios() {
        return request.getAllMunicipios();
    }
}
