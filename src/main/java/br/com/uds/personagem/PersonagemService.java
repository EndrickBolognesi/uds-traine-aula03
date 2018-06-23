package br.com.uds.personagem;

import java.util.Set;
import java.util.UUID;

public interface PersonagemService {
    Personagem criar(Personagem personagem);

    Set<Personagem> listar();

    Personagem obter(UUID id);


    void remover(UUID id);

    void editar(UUID id, Personagem personagem);
}
