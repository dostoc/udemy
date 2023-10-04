package com.spring.udemy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource("classpath:textos.properties")
    // Si quisieramos agregar mas se pondria una compa al final de la Linea 7 y nuevamente @...
})


public class TextosPropertiesConfig {
    
}
