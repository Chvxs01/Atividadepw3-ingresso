package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
    List<Sessao> findByHorario(LocalTime horario);
}
