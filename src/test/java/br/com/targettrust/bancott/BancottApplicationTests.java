package br.com.targettrust.bancott;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.targettrust.bancott.dominio.Agencia;
import br.com.targettrust.bancott.dominio.dao.AgenciaDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BancottApplicationTests {

	@Autowired
	private AgenciaDAO agenciaDao;
	
	@Test
	public void contextLoads() {

		Agencia agencia = agenciaDao.findById(15L).get();
		//Agencia agencia = new Agencia();
		agencia.setNome("Teste Rogerio");
		agencia.setEndereco("Av. Carlos Gomes, 1700");
		
		//agenciaDao.save(agencia);
		agenciaDao.delete(agencia);
			
	}

}
