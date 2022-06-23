package com.parking.respository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldEntity {
    @JsonProperty(value = "idobj")
    private  String id;
    @JsonProperty(value = "grp_nom")
    private String nom;
    @JsonProperty("grp_statut")
    private String statut;
    @JsonProperty(value = "grp_horodatage")
    private String horogedata;
    @JsonProperty("grp_exploitation")
    private  int exploitation;
    @JsonProperty("grp_disponible")
    private  int disponible;

}
