package com.parking.respository.impl;

import com.parking.respository.ParkingRepository;
import com.parking.respository.entity.ReponseParkingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
@Repository
public class ParkingRepositoryImpl implements ParkingRepository {
    private static final String URL_API_OPEN_DATA="https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut";
   @Autowired
    private RestTemplate restTemplate;
    @Override
    public ReponseParkingEntity getListParking() {
        return restTemplate.getForEntity(URL_API_OPEN_DATA,ReponseParkingEntity.class).getBody();
    }


}
