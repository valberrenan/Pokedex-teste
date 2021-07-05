package com.valber.fan.pokedex.repository;

import com.valber.fan.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository <Pokemon,String> {
}
