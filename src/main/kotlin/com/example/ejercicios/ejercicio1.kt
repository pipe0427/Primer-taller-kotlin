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

    // se crean empleados antes ya que la empresa siempre tiene que tener empleados asi no tenga clientes
    var juan = Empleado("Juan","123","pipe.04271@gmail.com",2000,Empleado.Dependencia.gerencia, null)
    var majo = Empleado("Majo","321","majo@gmail.com",1000,Empleado.Dependencia.recursosHumanos, null)
    // se crea la empresa con los empleados
    var empresa = Empresa("juan S.A.S","4321", "Armenia-Quindio", arrayListOf(juan,majo))

    // se agrega un empleado
    empresa.agregarEmpleado("felipe","123","felipe.04271@gmail.com",2000,Empleado.Dependencia.gerencia, null)

    // se lista los empleados que estan en la empresa
    println("Empleados:" + "${empresa.listarEmpleados()}")

    // se calcula la nomina de todos los empleados
    empresa.nomina()

    // se calcula la nomina solo de los empleados que tengan dependencia de recursos humanos
    empresa.nominaDependencia(Empleado.Dependencia.recursosHumanos)

    // se actualiza los datos del gerente juan
    empresa.updateEmpleado("felipe","123","felipe.04271@gmail.com",2000,Empleado.Dependencia.gerencia)

    // vuelve y se lista los empleados para corroborar que se actualizo la información
    println("Empleados:" + "${empresa.listarEmpleados()}")

    // aca se elimina el gerente felipe
    empresa.deleteEmpleado("123")

    // se lista nuevamente los empleados para corroborar que si se elimino correctaente
    println("Empleados:" + "${empresa.listarEmpleados()}")

    // se agrega un cliente a la empresa
    empresa.agregarCliente("pocels","0986","pocels@gmail.com","en una casa azul",3148795643)

    // se lista los clientes que esten registrados en la empresa
    println("Clientes:" + "${empresa.listarClientes()}")

    // se actualiza la informacion del cliente y se lista los clientes para corroborar que se hayan actualizado los datos
    empresa.updateCliente("Satniag","0986","quintero@gmail.com","en una casa verde",3148795643)
    println("Clientes:" + "${empresa.clientes[0]}")

    // se elimina el cliente y se listan los clientes para corroborar que se haya borrado correctamente
    empresa.deleteCliente("0986")
    println("Clientes:" + "${empresa.listarClientes()}")







}