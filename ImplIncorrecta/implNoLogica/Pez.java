package Taller12.ImplIncorrecta.implNoLogica;




/*Intenta implementar interfaces en clases 
que no tienen lógica relevante para esas
 interfaces y discute por qué es una mala práctica. */

public class Pez implements Volador {
    @Override
    public void volar() {
        System.out.println("Un pez no puede volar.");
         // Implementación no relevante por que evidentemente un pescao no vuela
    }
}
