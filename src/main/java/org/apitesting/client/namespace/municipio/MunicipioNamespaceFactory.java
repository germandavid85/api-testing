package org.apitesting.client.namespace.municipio;

/**
 * Created by gpotesf on 2/17/17.
 */
public class MunicipioNamespaceFactory {
    public static IMunicipioNamespace getMunicipio() {
        return new MunicipioNamespace();
    }
}
