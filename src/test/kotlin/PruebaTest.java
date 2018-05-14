import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

public class PruebaTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PruebaTest.class);

    @Test
    public void debeEjecutarMetodosConMiAnotation(){
        Arrays.asList(this.getClass().getDeclaredMethods()).stream()
                                                           .filter(method -> method.getAnnotation(HelenaTest.class) != null)
                                                           .forEach(method -> ejecutarMetodo(method));
    }

    private void ejecutarMetodo(final Method method){
        try {
            method.invoke(new PruebaTest());
        } catch (Throwable e) {
            LOGGER.error("Ha ocurrido un error", e);
        }
    }

    @HelenaTest
    public void miPrimerMetodo(){
        System.out.println("Mi primero metodo");
    }

    @HelenaTest
    public void miSegundoMetodo(){
        System.out.println("Mi segundo metodo");
    }

    @HelenaTest
    public void miSegundoMetodoHector(){
        System.out.println("Mi segundo metodo hector");
    }
}
