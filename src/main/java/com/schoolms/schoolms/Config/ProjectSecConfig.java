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
                        .dispatcherTypeMatchers(jakarta.servlet.DispatcherType.FORWARD, jakarta.servlet.DispatcherType.ERROR).permitAll()
                        .requestMatchers("/", "/login", "/signup", "/home", "/login.css", "/style.css", "/script.js", "/h2-console/**","/public/**","/error").permitAll()
                        .requestMatchers("/dashboard", "/notices").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER", "STUDENT", "LIBRARIAN", "ACCOUNTANT")
                        .requestMatchers("/schedule", "/exams", "/attendance").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER", "STUDENT")
                        .requestMatchers("/library").hasAnyRole("ADMIN", "PRINCIPAL", "LIBRARIAN", "STUDENT")
                        .requestMatchers("/students", "/classes").hasAnyRole("ADMIN", "PRINCIPAL", "TEACHER")
                        .requestMatchers("/fees").hasAnyRole("ADMIN", "PRINCIPAL", "ACCOUNTANT")
                        .requestMatchers("/add-user").hasAnyRole("ADMIN")
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
}
