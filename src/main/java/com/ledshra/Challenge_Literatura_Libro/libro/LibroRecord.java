package com.ledshra.Challenge_Literatura_Libro.libro;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ledshra.Challenge_Literatura_Libro.autor.AutorRecord;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroRecord(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<AutorRecord> autores,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") Integer numeroDeDescargas
) { }