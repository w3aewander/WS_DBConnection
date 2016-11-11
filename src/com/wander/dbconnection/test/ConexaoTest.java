package com.wander.dbconnection.test;

import org.junit.Assert;
import org.junit.Test;

import com.wander.dbconnection.conxao.ConexaoFactory;

public class ConexaoTest {

	@Test
	public void test() {		
		Assert.assertNotNull ("Não conectado!", ConexaoFactory.getConexao() );
		Assert.assertTrue(ConexaoFactory.getTotalnstances() == 1);
	}

}
