package br.com.etechoracio.ingresso.dto;

import br.com.etechoracio.ingresso.entity.Filme;

import java.time.LocalDate;
import java.time.LocalTime;

public record SessaoResponseDTO(
        Long id,
        LocalDate data,
        LocalTime horario,
        Filme filme,
        Double preco,
        String sala

) {

}
