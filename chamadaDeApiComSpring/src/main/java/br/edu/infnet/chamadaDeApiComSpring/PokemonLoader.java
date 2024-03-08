package br.edu.infnet.chamadaDeApiComSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.chamadaDeApiComSpring.client.PokemonGetApi;
import br.edu.infnet.chamadaDeApiComSpring.model.domain.Pokemon;
import br.edu.infnet.chamadaDeApiComSpring.model.services.PokemonService;

@Component
public class PokemonLoader implements ApplicationRunner {

	@Autowired
	private PokemonGetApi buscarPokemon;
	
	@Autowired
    private PokemonService pokemonService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Estou funcionando!");
		
		Pokemon pokemonDitto = buscarPokemon.obterPorNome("ditto");
		
		pokemonService.incluir(01, pokemonDitto);
		
		System.out.println(pokemonService.obterPokemonEspecifico("ditto"));
		System.out.println(pokemonService.obterPokemons());
		
	}	
}
