package com.parking.service.impl;

import com.parking.model.Parking;
import com.parking.respository.entity.FieldEntity;
import com.parking.respository.entity.RecordsEntity;
import com.parking.respository.entity.ReponseParkingEntity;
import com.parking.respository.impl.ParkingRepositoryImpl;
import com.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceImpl implements ParkingService {
@Autowired
private ParkingRepositoryImpl repository;
    @Override
    public List<Parking> getListParking() {
//        Parking parkingTest=new Parking();
//        parkingTest.setNom("parking de test");
//        parkingTest.setNbrePlaceDispo(245);
//        parkingTest.setNbrePlaceTot(8000);
//        parkingTest.setStatus("ouvert");
//        parkingTest.setDate("14h45");
//        ArrayList<Parking> liste =new ArrayList<>();
//        liste.add(parkingTest);
        ReponseParkingEntity reponse =repository.getListParking();
        return transformEntityModel(reponse);
    }

    private List<Parking> transformEntityModel(ReponseParkingEntity reponse) {
        List<Parking> resultats =new ArrayList<Parking>();
        for (RecordsEntity records: reponse.getRecordsEntityList()){
            Parking parking=new Parking();
            parking.setNom(records.getFieldEntity().getNom());
            parking.setStatus(getLibeleStatut(records));
            /*getFieldEntity().getStatut());*/
            parking.setNbrePlaceTot(records.getFieldEntity().getExploitation());
            parking.setNbrePlaceDispo(records.getFieldEntity().getDisponible());
            parking.setDate(heureMj(records));

            resultats.add(parking);
        }
        return  resultats;

    }

    private String heureMj(RecordsEntity records) {
         OffsetDateTime dateMj=OffsetDateTime.parse(records.getFieldEntity().getHorogedata());
         OffsetDateTime dateRell=dateMj.withOffsetSameInstant(ZoneOffset.of("+02:00"));
        return dateRell.getHour()+ "h" +dateRell.getMinute();
    }




    private String getLibeleStatut(RecordsEntity records) {
        switch (records.getFieldEntity().getStatut()){
            case "1":{
                return "FERME";

            }
            case "2":{
                return  "ABONNE";
            }
            case "5" :{
                return "OUVERT";
            }
        }
        return "Donnees non Disponibles";
    }


}


