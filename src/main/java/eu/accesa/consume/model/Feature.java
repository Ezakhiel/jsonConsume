package eu.accesa.consume.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature {

    private Long id;
    private FeatureCategory category;
    private String name;
    private List<Restaurant> restaurants;
}
