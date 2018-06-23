package br.com.uds.personagem;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public class Personagem {
    @ApiModelProperty(hidden = true)
    private final UUID id;

    private  String nome;

    @ApiModelProperty(hidden = true)
    private final LocalDateTime dataCriacao;

    private int nivelDePoder;

    private int pontosDeVida;

    protected Personagem(){
        this.id = UUID.randomUUID();
        this.dataCriacao = LocalDateTime.now();
    }
    public Personagem(String nome, int nivelDePoder, int pontosDeVida) {
        this();
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
        this.pontosDeVida = pontosDeVida;
    }

    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", nivelDePoder=" + nivelDePoder +
                ", pontosDeVida=" + pontosDeVida +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
