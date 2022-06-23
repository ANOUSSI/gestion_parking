package com.parking.controllers;

import com.parking.model.Parking;
import com.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ParkingController {
    @Autowired
    private ParkingService parkingService;

@GetMapping(path = "/api/parking")
    public List<Parking> getListParking(){
        return  parkingService.getListParking();
    }
}
