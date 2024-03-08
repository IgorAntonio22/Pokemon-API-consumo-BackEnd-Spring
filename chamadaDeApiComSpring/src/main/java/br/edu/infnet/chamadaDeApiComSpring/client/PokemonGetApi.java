package br.edu.infnet.chamadaDeApiComSpring.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.chamadaDeApiComSpring.model.domain.Pokemon;

@FeignClient(url = "https://pokeapi.co/api/v2/", name = "pokemonGetAPI")
public interface PokemonGetApi {
	
	@GetMapping(value = "pokemon/{nomeDoPokemon}")
	Pokemon obterPorNome(@PathVariable String nomeDoPokemon);
}
