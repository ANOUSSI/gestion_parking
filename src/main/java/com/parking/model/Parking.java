package com.parking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Parking {
    private int nbrePlaceDispo;
    private  int nbrePlaceTot;
    private String nom;
    private String status;
    private String date;
}
