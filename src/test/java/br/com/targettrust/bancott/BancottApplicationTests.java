package br.com.targettrust.bancott;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.targettrust.bancott.dominio.Agencia;
import br.com.targettrust.bancott.dominio.Cliente;
import br.com.targettrust.bancott.dominio.Conta;
import br.com.targettrust.bancott.dominio.dao.AgenciaDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BancottApplicationTests {

	@Autowired
	private AgenciaDAO agenciaDao;
	
	@Test
	public void contextLoads() {

		//Agencia agencia = agenciaDao.findById(15L).get();
		//Agencia agencia = new Agencia();

		Agencia ag1= new Agencia();
		ag1.setNome("Agencia do aluno");

		
		Cliente cliente= new Cliente();
		cliente.setNome("nome cliente");
		
		
		Conta c1 = new Conta();
		c1.setCliente(cliente);
		c1.setAgencia(ag1);
		
		Conta c2 = new Conta();
		c2.setCliente(cliente);
		c2.setAgencia(ag1);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		
		ag1.setContas(contas);
		
		agenciaDao.save(ag1);		
		
		
		//agencia.setNome("Teste Rogerio");
		//agencia.setEndereco("Av. Carlos Gomes, 1700");
		//agenciaDao.save(agencia);
		//agenciaDao.delete(agencia);			
	}
}
