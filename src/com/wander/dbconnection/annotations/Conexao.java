/**
 * 
 */
package com.wander.dbconnection.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/**
 * Deve ser informado os parâmetros de com.wander.dbconnection.conxao com o banco 
 * @author Wanderlei Silva do Carmo
 *
 */
public @interface Conexao {

	String driver() default "com.mysql.jdbc.Driver";
	String dsn() default "jdbc:mysql://localhost:3306/dbname";
	String usuario() default "root";
	String senha() default "";
}
