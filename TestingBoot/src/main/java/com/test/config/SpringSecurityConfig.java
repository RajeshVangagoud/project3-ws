package com.test.config;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.access.AccessDeniedHandler;

public class SpringSecurityConfig extends WebSecurityConfiguration {

	@Autowired
	private AccessDeniedHandler accessDeniedHandler;

	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/", "home", "/editUser").permitAll()
				.antMatchers("/user/**").hasAnyRole("user").anyRequest().authenticated().and().formLogin()
				.loginPage("/editUser").permitAll().and().logout().permitAll().and().exceptionHandling()
				.accessDeniedHandler(accessDeniedHandler);
	}
	public void configureGlobal(AuthenticationManagerBuilder  auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
		
	}
}
