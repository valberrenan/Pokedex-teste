package com.valber.fan.pokedex;

import com.valber.fan.pokedex.model.Pokemon;
import com.valber.fan.pokedex.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class PokedexApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokedexApplication.class, args);

    }
    CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository){
        return args ->{
            Flux<Pokemon> pokemonFlux = Flux.just(
                    new Pokemon(null, "Bulbassauro","Semente", "OverGrow",6.09),
                    new Pokemon(null, "Charizard", "Fogo", "Blaze",90.05),
                    new Pokemon(null, "Caterpie", "Minhoca", "Poeira do Escudo",2.09),
                    new Pokemon(null, "Blastoise", "Marisco", "Torrente",70.09))
                    .flatMap(repository::save);

            pokemonFlux
                    .thenMany(repository.findAll())
                    .subscribe(System.out::println);
        };
    }

}
