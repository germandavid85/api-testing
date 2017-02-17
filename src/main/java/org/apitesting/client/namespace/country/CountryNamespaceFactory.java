package org.apitesting.client.namespace.country;

public class CountryNamespaceFactory {
    public static ICountryNamespace getCountryNamespace() {
        return new CountryNamespace();
    }
}
