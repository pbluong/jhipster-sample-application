package com.selfstudy.jhipster.sample.web.rest.dto;

import java.io.Serializable;

public class RestProductDTO implements Serializable {
    private Long id;
    private String internalName;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(final String internalName) {
        this.internalName = internalName;
    }
}
