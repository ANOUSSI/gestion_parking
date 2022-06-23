package com.parking.respository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReponseParkingEntity {
    @JsonProperty(value = "records")
    private  List<RecordsEntity> recordsEntityList;

    public List<RecordsEntity> getRecordsEntityList() {
        return recordsEntityList;
    }

    public void setRecordsEntityList(List<RecordsEntity> recordsEntityList) {
        this.recordsEntityList = recordsEntityList;
    }
}
