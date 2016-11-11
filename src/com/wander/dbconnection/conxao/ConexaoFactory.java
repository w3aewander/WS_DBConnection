/**
 * 
 */
package com.wander.dbconnection.conxao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.wander.dbconnection.annotations.Conexao;


/**
 * Classe estática usando o padrão singleton para conexão com  base de dados
 * usando Anotações
 * @author Wanderlei Silva do Carmo
 */

@Conexao(dsn="jdbc:mysql://localhost:3306/restaurante",usuario="restaurante",senha="restaurante")
public class ConexaoFactory {

    private static Connection con;
    private static int instances;
    
	public static  Connection getConexao(){

   	 Conexao  an =  ConexaoFactory.class.getAnnotation(Conexao.class);

		try {
			Class.forName(an.driver());
			if ( con == null ){
				con = DriverManager.getConnection(an.dsn(), an.usuario(), an.senha() );
				instances++;
			}
						
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;		
		
	}
	
	public static Integer getTotalnstances(){
		 return instances;
	}
		
}
