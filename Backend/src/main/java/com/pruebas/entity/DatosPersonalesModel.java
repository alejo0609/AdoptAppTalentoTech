 /** 
 * @author Alejandro Perez CC 8.029.742
 * @author Julian David Giraldo Murillo CC 1.007.240.094
 * @author Andres Escobar Vasquez CC 1.038.096.962
 * @author Jorge Andres Restrepo Cataño CC 98.648.720
 **/
 
package com.pruebas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "datos_personales")
@Data
public class DatosPersonalesModel {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idDatosPersonales;

public void setIdDatosPersonales(Integer id) {
    this.idDatosPersonales = id;
}

@Column(nullable = false, length = 255)
private String name;

@Column(nullable = false, length = 55, unique = true)
private Long dni;

@Column(nullable = false, length = 255)
private String direccion;

@Column(nullable = false, length = 55)
private String ciudad;

@Column(nullable = false, length = 15)
private String telefono;


@Column(nullable = false, length = 155, unique = true)
private String email;


@Column(nullable = false, length = 155)
private String password;



}
/* 
@Column(nullable = false)
private Boolean estado_datosPersonales;
*/