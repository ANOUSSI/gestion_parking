package com.parking.respository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordsEntity {
    @JsonProperty(value ="fields" )
    private  FieldEntity fieldEntity;

    public FieldEntity getFieldEntity() {
        return fieldEntity;
    }

    public void setFieldEntity(FieldEntity fieldEntity) {
        this.fieldEntity = fieldEntity;
    }
}
