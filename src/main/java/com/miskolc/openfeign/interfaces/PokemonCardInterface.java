package com.miskolc.openfeign.interfaces;

import com.miskolc.openfeign.models.PokemonCard;
import com.miskolc.openfeign.util.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "pokemon-card-service", url = "http://localhost:8080/",configuration = ClientConfiguration.class)
public interface PokemonCardInterface {
    @RequestMapping(method = RequestMethod.GET, value = "/cards")
    List<PokemonCard> getCards();

    @RequestMapping(method = RequestMethod.GET, value = "/cards/{id}")
    PokemonCard getCardById(@PathVariable("id") Long id);

    @RequestMapping(method = RequestMethod.POST, value = "/cards")
    PokemonCard addCard(@RequestBody PokemonCard card);

    @RequestMapping(method = RequestMethod.PUT, value = "/cards")
    PokemonCard updateCard(@RequestBody PokemonCard card);

    @RequestMapping(method = RequestMethod.DELETE, value = "/cards/{id}")
    void deleteCard(@PathVariable("id") Long id);
}
