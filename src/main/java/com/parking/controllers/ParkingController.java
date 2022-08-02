package com.parking.controllers;

import com.parking.model.Parking;
import com.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    @CrossOrigin("http://localhost:4200")
@GetMapping("/api/parking")
    public  List<Parking> getListParking(){
       // List<Parking>  listParking=parkingService.getListParking();
//model.addAttribute("listparking",listParking);
    return  parkingService.getListParking();
    }
}
