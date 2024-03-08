package br.edu.infnet.chamadaDeApiComSpring.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.chamadaDeApiComSpring.ChamadaDeApiComSpringApplication;
import br.edu.infnet.chamadaDeApiComSpring.model.domain.Pokemon;

@SpringBootTest
class PokemonTests {

	private Pokemon pokemon;
	
	@BeforeEach
	void setUp() {
		pokemon = new Pokemon();
		pokemon.setName("ditto");
		pokemon.setId(132);

		
	}
	
	@Test
	void verificaStatusPokemon() {
		assertEquals("ditto", pokemon.getName());
		assertEquals(132, pokemon.getId());
	}
	
	 @Test
	 public void testaMetodoMain() {     
	       ChamadaDeApiComSpringApplication.main(new String[]{});    
	}
}
