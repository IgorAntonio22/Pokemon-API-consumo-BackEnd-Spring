package br.edu.infnet.chamadaDeApiComSpring.model.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.chamadaDeApiComSpring.model.domain.Pokemon;

@Service
public class PokemonService {

	private Map<Integer, Pokemon> mapaDePokemonsDaAPI = new HashMap<Integer,Pokemon>();
	
	
	public void incluir(int id, Pokemon nomeDoObjetoPokemon) {
		mapaDePokemonsDaAPI.put(id, nomeDoObjetoPokemon);
	}
	
	public void excluir(int idDoPokemon) {
		mapaDePokemonsDaAPI.remove(idDoPokemon);
	}
	
	public Collection<Pokemon> obterPokemons() {
		return mapaDePokemonsDaAPI.values();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public Pokemon obterPokemonEspecifico(String nomeDoPokemon) {
		return mapaDePokemonsDaAPI.get(nomeDoPokemon);
	}
}
