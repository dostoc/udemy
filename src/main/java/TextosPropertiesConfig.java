import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource("classpath:textos.properties")
    // Si quisieramos agregar mas se pondria una compa al final de la Linea 7 y nuevamente @...
})
public class TextosPropertiesConfig {
    @Value("${texto.ejemplovariablesrutacontroller.index.titulo}")
    private String indexTitulo;
}
