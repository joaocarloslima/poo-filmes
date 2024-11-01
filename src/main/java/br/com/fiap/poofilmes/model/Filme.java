package br.com.fiap.poofilmes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filme extends Producao {

    private String diretor;

    public Filme(String titulo, LocalDate dataLancamento, String genero, String poster, String diretor, int avaliacao) {
        super(titulo, dataLancamento, genero, poster, avaliacao);
        this.diretor = diretor;
    }


}
