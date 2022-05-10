package com.cesars.api.services.services;

import com.cesars.api.services.models.CharacterModel;
import com.cesars.api.services.models.viewModels.HomeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaService {
    @Autowired
    private RestTemplate restTemplate;
    public CharacterModel getDataById(int id)
    {
        final String uri = "https://rickandmortyapi.com/api/character/"+id;

        ResponseEntity<CharacterModel> responseEntity = restTemplate.exchange(
            uri, 
            HttpMethod.GET, 
            null, 
            new ParameterizedTypeReference<CharacterModel>(){}
        );

        CharacterModel characterInfo = responseEntity.getBody();
        return characterInfo;
    }
    public HomeModel getData()
    {
        final String uri = "https://rickandmortyapi.com/api/";

        ResponseEntity<HomeModel> responseEntity = restTemplate.exchange(
            uri, 
            HttpMethod.GET, 
            null, 
            new ParameterizedTypeReference<HomeModel>(){}
        );

        HomeModel home = responseEntity.getBody();
        return home;
    }
}

