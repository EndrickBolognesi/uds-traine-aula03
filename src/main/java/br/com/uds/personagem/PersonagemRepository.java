package br.com.uds.personagem;

import java.util.Set;

public interface PersonagemRepository {
     Personagem save(Personagem personagem);

    Set<Personagem> findAll();
}
