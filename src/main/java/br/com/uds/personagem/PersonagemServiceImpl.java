package br.com.uds.personagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PersonagemServiceImpl implements PersonagemService{

    @Autowired
    private PersonagemRepository repository;

    @Override
    public Personagem criar(Personagem personagem) {
        return this.repository.save(personagem);
    }

    @Override
    public Set<Personagem> listar() {
        return this.repository.findAll();
    }

    @Override
    public Personagem obter(UUID id) {
        return this.repository.findOne(id);
    }

    @Override
    public void remover(UUID id) {
        this.repository.delete(id);
    }

    @Override
    public void editar(UUID id, Personagem personagem) {
        Personagem personagemRecuperado = this.obter(id);
        remover(id);
        personagemRecuperado.setNivelDePoder(personagem.getNivelDePoder());
        personagemRecuperado.setPontosDeVida(personagem.getPontosDeVida());
        personagemRecuperado.setNome(personagem.getNome());
        this.repository.save(personagemRecuperado);
    }
}
