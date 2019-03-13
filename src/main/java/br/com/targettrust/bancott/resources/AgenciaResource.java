package br.com.targettrust.bancott.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.targettrust.bancott.dominio.Agencia;
import br.com.targettrust.bancott.dominio.dao.AgenciaDAO;

@RestController
public class AgenciaResource {

	@Autowired
	private AgenciaDAO agenciaDao;
	
	@GetMapping(path = "/agencia")
	public List<Agencia> obtemAgencia() {
		return agenciaDao.findAll();
	}

	@GetMapping(path = "/agenciaN")
	public Optional<Agencia> obtemAgenciaN() {
		return agenciaDao.findById(8L);
	}	
}
