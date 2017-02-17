package org.apitesting.client.namespace.municipio;

import org.apitesting.client.base.Response;

import java.util.List;

public interface IMunicipioNamespace {
    Response<List<Municipio>> getAllMunicipios();
}
