package com.valber.fan.pokedex.model;

import org.springframework.data.annotation.Id;

public class Pokemon {

    @Id
    private  String id;

    private String nome;
    private String categoria;
    private String habilidades;
    private Double peso;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pokemon pokemon = (Pokemon) o;

        if (id != null ? !id.equals(pokemon.id) : pokemon.id != null) return false;
        if (nome != null ? !nome.equals(pokemon.nome) : pokemon.nome != null) return false;
        if (categoria != null ? !categoria.equals(pokemon.categoria) : pokemon.categoria != null) return false;
        if (habilidades != null ? !habilidades.equals(pokemon.habilidades) : pokemon.habilidades != null) return false;
        return peso != null ? peso.equals(pokemon.peso) : pokemon.peso == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (habilidades != null ? habilidades.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", peso=" + peso +
                '}';
    }
    public Pokemon() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Pokemon(String id, String nome, String categoria, String habilidades, Double peso) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.habilidades = habilidades;
        this.peso = peso;
    }


}
