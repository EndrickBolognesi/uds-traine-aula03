package br.com.uds.personagem;

import java.util.Set;

public interface PersonagemService {
    Personagem criar(Ryu ryu);

    Set<Personagem> listar();
}
