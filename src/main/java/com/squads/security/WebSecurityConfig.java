package com.squads.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    private DataSource dataSource;
     
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
            .dataSource(dataSource)
            .usersByUsernameQuery("select username, password, enabled from users where username=?")
            .authoritiesByUsernameQuery("select username, authority from authorities where username=?")
        ;
    }

    @Bean 
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http
    	.csrf()
    	.disable()
    	.authorizeRequests()
        .antMatchers("/login*")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/register*")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/perform_register*")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/success*")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/error*")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/css/**")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/js/**")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/images/**")
        .permitAll()
        .anyRequest()
        .authenticated()
    	.and()
        .formLogin()
        .loginPage("/login")
        .loginProcessingUrl("/perform_login")
        .defaultSuccessUrl("/", true)
        .failureUrl("/login?error")
        .and()
        .logout()
        .logoutUrl("/perform_logout")
        .deleteCookies("JSESSIONID");
        return http.build();
    }
}
