package com.example.ejercicios

fun main(){
    fun divicion2(n1:Int, n2:Int){
        var contador = 0
        var n3:Int = n1

        while(n3 > 0){
            n3 -= n2
            contador++
        }
        println(contador)
        println("valor $n3")
    }
    divicion2(12,3)

    var juan = Empleado("Juan","123","pipe.04271@gmail.com",2000,Empleado.Dependencia.gerencia, null)
    var majo = Empleado("Majo","321","majo@gmail.com",1000,Empleado.Dependencia.recursosHumanos, null)
    var felipe = Empleado("felipe","123","felipe.04271@gmail.com",2000,Empleado.Dependencia.gerencia, null)
    var pocels = Cliente("pocels","0986","pocels@gmail.com")
    var empresa = Empresa("juan S.A.S","4321", "Armenia-Quindio", arrayListOf(juan,majo))

    empresa.agregarEmpleado("felipe","123","felipe.04271@gmail.com",2000,Empleado.Dependencia.gerencia, null)
    println("Empleados:" + "${empresa.listarEmpleados()}")
    empresa.deleteEmpleado(juan.document)
    println(empresa.empleados.size)
    println("Empleados:" + "${empresa.listarEmpleados()}")
    empresa.nomina()
    empresa.nominaDependencia(Empleado.Dependencia.recursosHumanos)





}