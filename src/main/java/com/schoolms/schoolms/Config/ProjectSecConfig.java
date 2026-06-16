package com.schoolms.schoolms.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login", "/signup", "/home", "/login.css", "/style.css", "/script.js", "/h2-console/**").permitAll()
                        .requestMatchers("/dashboard", "/notices").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER", "STUDENT", "LIBRARIAN", "ACCOUNTANT")
                        .requestMatchers("/schedule", "/exams", "/attendance").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER", "STUDENT")
                        .requestMatchers("/library").hasAnyRole("ADMIN", "PRINCIPAL", "LIBRARIAN", "STUDENT")
                        .requestMatchers("/students", "/classes").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER")
                        .requestMatchers("/fees").hasAnyRole("ADMIN", "PRINCIPAL", "ACCOUNTANT")
                        .requestMatchers("/teachers", "/settings").hasAnyRole("ADMIN", "PRINCIPAL")
                        .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
                .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()))
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
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder){
        UserDetails student = User.withUsername("student@gmail.com")
                .password(encoder.encode("password"))
                .roles("STUDENT")
                .build();
        UserDetails admin = User.withUsername("admin@gmail.com")
                .password(encoder.encode("password"))
                .roles("ADMIN")
                .build();
        UserDetails principal = User.withUsername("principal@gmail.com")
                .password(encoder.encode("password"))
                .roles("PRINCIPAL")
                .build();
        UserDetails teacher = User.withUsername("teacher@gmail.com")
                .password(encoder.encode("password"))
                .roles("TEACHER")
                .build();
        UserDetails librarian = User.withUsername("librarian@gmail.com")
                .password(encoder.encode("password"))
                .roles("LIBRARIAN")
                .build();
        UserDetails accountant = User.withUsername("accountant@gmail.com")
                .password(encoder.encode("password"))
                .roles("ACCOUNTANT")
                .build();
        return new InMemoryUserDetailsManager(admin, librarian, teacher, principal, student, accountant);
    }
}
