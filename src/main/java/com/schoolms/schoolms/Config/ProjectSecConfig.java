package com.schoolms.schoolms.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login", "/signup", "/css/**", "/js/**", "/home", "/login.css").permitAll()
                        .requestMatchers("/dashboard", "/notices").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER", "STUDENT", "LIBRARIAN", "ACCOUNTANT")
                        .requestMatchers("/schedule", "/exams", "/attendance").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER", "STUDENT")
                        .requestMatchers("/library").hasAnyRole("ADMIN", "PRINCIPAL", "LIBRARIAN", "STUDENT")
                        .requestMatchers("/students", "/classes").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER")
                        .requestMatchers("/fees").hasAnyRole("ADMIN", "PRINCIPAL", "ACCOUNTANT")
                        .requestMatchers("/teachers", "/settings").hasAnyRole("ADMIN", "PRINCIPAL")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/dashboard", true)
                        .failureUrl("/login?error=true")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/login?logout=true")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll()
                );

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails student= User.withDefaultPasswordEncoder()
                .username("student@gmail.com")
                .password("password")
                .roles("STUDENT")
                .build();
        UserDetails admin= User.withDefaultPasswordEncoder()
                .username("admin@gmail.com")
                .password("password")
                .roles("ADMIN")
                .build();
        UserDetails principal= User.withDefaultPasswordEncoder()
                .username("principal@gmail.com")
                .password("password")
                .roles("PRINCIPAL")
                .build();
        UserDetails teacher= User.withDefaultPasswordEncoder()
                .username("teacher@gmail.com")
                .password("password")
                .roles("TEACHER")
                .build();
        UserDetails librarian= User.withDefaultPasswordEncoder()
                .username("librarian@gmail.com")
                .password("password")
                .roles("LIBRARIAN")
                .build();
        UserDetails accountant= User.withDefaultPasswordEncoder()
                .username("accountant@gmail.com")
                .password("password")
                .roles("ACCOUNTANT")
                .build();
        return new InMemoryUserDetailsManager(admin,librarian,teacher,principal,student,accountant);
    }
}
