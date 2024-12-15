package com.miskolc.openfeign.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PokemonCard {
    private int id;
    private String name;
    private int price;
    private String type;



    public PokemonCard(int id,String name, int price, String type) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
