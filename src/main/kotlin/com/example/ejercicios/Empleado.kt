package com.example.ejercicios
// se le pone data para moldear los datos
//se le pone override para poder sobreescribir la variable
 data class Empleado(override var name:String, override var document:String, override var email:String, var salary:Int, var dependencia:Dependencia, var empleadosSub:ArrayList<Empleado>?):Persona(name,document,email) {

    enum class Dependencia{
        ventas,
        recursosHumanos,
        gerencia,
        operativo
    }

}