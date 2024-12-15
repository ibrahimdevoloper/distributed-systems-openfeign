package com.miskolc.openfeign.controller;

import com.miskolc.openfeign.interfaces.PokemonCardInterface;
import com.miskolc.openfeign.models.PokemonCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonCardController {

    @Autowired
    private PokemonCardInterface pokemonCardClient;

    @GetMapping("/cards")
    public List<PokemonCard> getCards() {
        return pokemonCardClient.getCards();
    }

    @GetMapping("/cards/{id}")
    public PokemonCard getCardById(@PathVariable Long id) {
        return pokemonCardClient.getCardById(id);
    }

    @PostMapping("/cards")
    public PokemonCard addCard(@RequestBody PokemonCard card) {
        return pokemonCardClient.addCard(card);
    }

    @PutMapping("/cards")
    public PokemonCard updateCard(@RequestBody PokemonCard card) {
        return pokemonCardClient.updateCard( card);
    }

    @DeleteMapping("/cards/{id}")
    public void deleteCard(@PathVariable Long id) {
        pokemonCardClient.deleteCard(id);
    }
}