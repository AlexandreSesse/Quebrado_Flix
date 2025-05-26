package br.com.alura.quebradoflix.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("Title") String titulo,
                             @JsonAlias("Genre") String genero,
                             @JsonAlias("Episode") Integer numero,
                             @JsonAlias("imdbRating") String avaliacao,
                             @JsonAlias("Released") String datalancamento) {
}