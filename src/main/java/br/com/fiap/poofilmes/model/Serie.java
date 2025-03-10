package br.com.fiap.poofilmes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Serie extends Producao {

    private int temporadas;
    private List<Episodio> episodios = new ArrayList<>();

    public Serie(String titulo, LocalDate dataLancamento, String genero, String poster, int temporadas, int avaliacao) {
        super(titulo, dataLancamento, genero, poster, avaliacao);
        this.temporadas = temporadas;
    }

}
