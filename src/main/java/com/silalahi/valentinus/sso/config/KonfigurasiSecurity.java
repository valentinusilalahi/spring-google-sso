package com.silalahi.valentinus.sso.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class KonfigurasiSecurity extends WebSecurityConfigurerAdapter {
	
	/*@Autowired
	private DataSource dataSource;
	
	private static final String SQL_LOGIN = 
			"SELECT U.username AS username,P.password AS password, TRUE AS active"
			+ "FROM s_user U"
			+ "INNER JOIN s_user_password P ON P.id_user = U.id"
			+ "WHERE username=? ";
	
	private static final String SQL_ROLE = 
			"SELECT U.username, P.permission_value AS authority"
			+ "FROM s_user U"
			+ "INNER JOIN s_role R ON U.id_role = R.id "
			+ "INNER JOIN s_role_permission RP ON RP.id_role = R.id"
			+ "INNER JOIN s_permission P ON RP.id_permission = P.id"
			+ "WHERE U.username=? ";
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(13);
	}

	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
			.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery(SQL_LOGIN)
			.authoritiesByUsernameQuery(SQL_ROLE)
			.passwordEncoder(passwordEncoder());
		
	}*/

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests()
			.anyRequest().authenticated()
			.and().logout().permitAll()
			.and().oauth2Login().defaultSuccessUrl("/home", true);
		
	}
	
	@Bean
	public SpringSecurityDialect springSecurityDialect() {
		return new SpringSecurityDialect();
	}
	
}
