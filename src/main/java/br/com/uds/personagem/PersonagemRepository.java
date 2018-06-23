package br.com.uds.personagem;

import java.util.Set;
import java.util.UUID;

public interface PersonagemRepository {
     Personagem save(Personagem personagem);

    Set<Personagem> findAll();

    Personagem findOne(UUID id);

    void delete(UUID id);
}
