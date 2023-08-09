package com.example.ejercicios

data class Empleado(var name:String,val document:String,var email:String,var salary:Int,var dependencia:Dependencia,var empleadosSub:ArrayList<Empleado>?) {

    enum class Dependencia{
        ventas,
        recursosHumanos,
        gerencia,
        operativo
    }

}