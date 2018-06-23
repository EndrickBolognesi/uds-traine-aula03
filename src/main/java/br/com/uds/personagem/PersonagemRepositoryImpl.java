package br.com.uds.personagem;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class PersonagemRepositoryImpl implements PersonagemRepository{
    private Set<Personagem> personagens = new HashSet();

    @Override
    public Personagem save(Personagem personagem) {
        personagens.add(personagem);
        return personagem;
    }

    @Override
    public Set<Personagem> findAll() {
        return personagens;
    }


}
