package com.acme.orders.api.services.exceptions;

/**
 * @author Tilen Faganel, Sunesis ltd.
 * @since 1.0.0
 */
public class ResourceNotFoundException extends RuntimeException {

    private String resource;
    private String identifier;

    public ResourceNotFoundException(String resource, String identifier) {
        this.resource = resource;
        this.identifier = identifier;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
