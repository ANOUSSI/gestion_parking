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
@Controller
public class ParkingController {
    @Autowired
    private ParkingService parkingService;
//@CrossOrigin("*")
@GetMapping("/api/parking")
    public  String /*List<Parking>*/ getListParking(Model model){
        List<Parking>  listParking=parkingService.getListParking();
model.addAttribute("listparking",listParking);
    return  "parking";
    //parkingService.getListParking();
    }
}
