package br.com.uds.personagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonagemServiceImpl implements PersonagemService{

    @Autowired
    private PersonagemRepository repository;

    @Override
    public Personagem criar(Ryu ryu) {
        return this.repository.save(ryu);
    }

    @Override
    public Set<Personagem> listar() {
        return this.repository.findAll();
    }
}
