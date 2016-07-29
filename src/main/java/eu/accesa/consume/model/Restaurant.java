package eu.accesa.consume.model;

import java.util.List;

public class Restaurant {
    
    private Long id;
    private String name;
    private String description;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public List<Feature> getFeatures() {
        return features;
    }
    
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    
    public String getLinkSocial() {
        return linkSocial;
    }
    
    public void setLinkSocial(String linkSocial) {
        this.linkSocial = linkSocial;
    }
    
    private List<Feature> features;
    private String linkSocial;
}