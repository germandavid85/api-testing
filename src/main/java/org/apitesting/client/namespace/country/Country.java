package org.apitesting.client.namespace.country;

import java.util.HashMap;
import java.util.Map;

public class Country {
    private String name;
    private String alpha2Code;
    private String region;
    private String subRegion;
    private int population;
    private Map<String, String> translations = new HashMap<>();

    public Country() {
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public Map<String, String> getTranslations() {
        return new HashMap<>(translations);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setTranslations(Map<String, String > translations) {
        this.translations.clear();
        this.translations.putAll(translations);
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }
}
