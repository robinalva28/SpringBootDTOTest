package com.inmobiliariadto.inmobiliaria.alquileres;

import com.inmobiliariadto.inmobiliaria.alquileres.dto.PropiedadDTO;
import com.inmobiliariadto.inmobiliaria.alquileres.model.Inquilino;
import com.inmobiliariadto.inmobiliaria.alquileres.model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {

    @GetMapping("propiedad/{id}")
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){

        //Supongamos que obtenemos una propiedad por su id y su inquilino
        //desde una BBDD

        Inquilino inqui = new Inquilino(1L,"12312333","Patricio","Estrella","Hablar");
        Propiedad prop = new Propiedad(123L,"Casa","Fondo de bikini 2287",100.,40000.);

        PropiedadDTO propDTO = new PropiedadDTO(prop.getId_propiedad(),
                prop.getTipo_propiedad(),
                prop.getDireccion(),
                prop.getAlquiler(),
                inqui.getNombre(),
                inqui.getApellido());

        return propDTO;

    }


}
