package CalculadoraRest.demo;

//@author Nigth Crawler

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Indica a SpringBoot que esta clase es un servicio Rest
@RestController

/*
Define la URL dónde se van a exponer todos
los servicios o métodos de esta clase
*/
@RequestMapping("/")
public class Conversor {
    
    
    /* @GetMapping
    Es una notación para exponer el método como un servicio y
    que está disponible mediante el método Get en la URL / (raíz [localhost:8080/])    
    */
    /*@RequestMapping(value = "hello", method = RequestMethod.GET)
    Es una notación para exponer el método como un servicio y
    que está disponible mediante el método Get en la URL /hello (localhost:8080/hello)
    */ 
    
    @GetMapping (path = "{ingresarCantidad}/{de}/{a}")
    public String convertirMoneda(@PathVariable String ingresarCantidad, @PathVariable String de, @PathVariable String a){
        
        double cantidad = Double.parseDouble(ingresarCantidad);
        
        OperacionesConversor operacionesConversor = new OperacionesConversor();
        operacionesConversor.convertirMoneda(cantidad, de, a);
        
        return ingresarCantidad+ " "+ de +" Son: "+ operacionesConversor.convertirMoneda(cantidad, de, a)+" "+a;
        
    }
}
