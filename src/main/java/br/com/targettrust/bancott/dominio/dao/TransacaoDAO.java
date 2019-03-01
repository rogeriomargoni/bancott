package br.com.targettrust.bancott.dominio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import br.com.targettrust.bancott.dominio.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Long> {

}
