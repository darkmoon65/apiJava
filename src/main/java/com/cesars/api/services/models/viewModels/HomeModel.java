package com.cesars.api.services.models.viewModels;

public class HomeModel {
    private String characters;
    private String locations;
    private String episodes;

    public String getCharacters(){
        return characters;
    }
    public void setCharacters(String characters){
        this.characters = characters;
    }
    public String getLocations(){
        return locations;
    }
    public void setLocations(String locations){
        this.locations = locations;
    }
    public String getEpisodes(){
        return episodes;
    }
    public void setEpisodes(String episodes){
        this.episodes = episodes;
    }
}
