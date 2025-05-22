package br.com.alura.quebradoflix.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe);
}
