package br.com.targettrust.bancott;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.targettrust.bancott.dominio.Conta;
import br.com.targettrust.bancott.dominio.dao.ContaDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContaTest {
	
	@Autowired
	private ContaDAO contaDao;
	
	@Test
	public void contextLoads() {

		Conta conta = contaDao.findById(7L).get();
		conta.setSaldo(1000.58);
		
		contaDao.save(conta);
			
	}

}
