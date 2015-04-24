package sample.data.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/attractions").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/api/customers*").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/api/hotels*").hasRole("ADMIN").and()
                .csrf().disable();
    }
}