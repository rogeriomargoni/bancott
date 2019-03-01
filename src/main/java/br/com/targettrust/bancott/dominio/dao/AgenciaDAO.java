package br.com.targettrust.bancott.dominio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import br.com.targettrust.bancott.dominio.Agencia;

public interface AgenciaDAO extends CrudRepository<Agencia, Long>{

}
