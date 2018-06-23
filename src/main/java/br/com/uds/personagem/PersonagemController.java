package br.com.uds.personagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @PostMapping
    public ResponseEntity criar(@RequestBody Personagem personagem){
        Personagem personagemCriado = this.personagemService.criar(personagem);
        return new ResponseEntity( personagemService.criar(personagem).toString(), HttpStatus.CREATED);
    }

    @GetMapping
    public Set<Personagem> listar(){
        return this.personagemService.listar();
    }

    @GetMapping("/findBy")
    public Personagem obter(@RequestParam("id")UUID id){
        return this.personagemService.obter(id);
    }

    @DeleteMapping
    public ResponseEntity remover(@RequestParam("id")UUID id) {
        this.personagemService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @PutMapping
    public ResponseEntity editar(@RequestParam("id") UUID id, @RequestBody Personagem personagem){
        this.personagemService.editar(id, personagem);
        return new ResponseEntity("Editado com Sucesso!", HttpStatus.OK);
    }
}
