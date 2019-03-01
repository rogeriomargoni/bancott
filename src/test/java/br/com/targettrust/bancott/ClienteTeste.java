package br.com.targettrust.bancott;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.targettrust.bancott.dominio.Cliente;
import br.com.targettrust.bancott.dominio.dao.ClienteDAO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteTeste {

	@Autowired
	private ClienteDAO clienteDao;
	
	@Test
	public void contextLoads() {

		Cliente cliente = clienteDao.findById(7L).get();
		cliente.setNome("Rogerio");
		
		clienteDao.save(cliente);
			
	}

}
