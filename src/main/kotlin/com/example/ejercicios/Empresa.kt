package com.example.ejercicios

class Empresa(val name: String,val nit: String,val address: String,val empleados:ArrayList<Empleado>) {

    /** var clientes:ArrayList<Cliente> = ArrayList()*/

    init {
    }
    fun buscarEmpleado(document: String):Empleado?{
        return empleados.find { it.document == document }
    }
    fun agregarEmpleado(name:String, document: String,email: String,salary: Int,dependencia: Empleado.Dependencia,empleadosSub:ArrayList<Empleado>?):Empleado{
        val empleado:Empleado = Empleado(name,document,email,salary,dependencia,empleadosSub)
        empleados.add(empleado)
        return empleado
    }

    fun updateEmpleado( name:String,  document:String,  email:String,  salary:Int,  dependencia: Empleado.Dependencia):Boolean{
        var aux:Empleado? = buscarEmpleado(document)
            if(aux != null){
                aux.name = name
                aux.email = email
                aux.salary = salary
                aux.dependencia = dependencia
                println("Se actualizo correctamente")
                return true
            }else{
                println("No se encontro el empleado")
                return false
            }

    }

    fun deleteEmpleado(document: String):Boolean{
        val aux:Empleado? = buscarEmpleado(document)
        if(aux != null){
            empleados.remove(aux)
            println("Se elimino correctamente")
            return true
        }else{
            println("No se pudo eliminar")
            return false
        }
    }

    fun listarEmpleados(): List<Empleado> {
        return empleados.toList()
    }



    /**fun buscarCliente(document: String):Cliente?{
        return clientes.find { it.document == document }
    }
    fun agregarCliente(cliente:Cliente){
        val aux:Cliente? = buscarCliente(cliente.document)
        if(aux == null){
            clientes.add(cliente)
            println("Se agrego correctamente")
        }
        println("No se pudo agregar")
    }

    fun updateCliente( name:String,  document:String,  email:String){
        var aux:Cliente? = buscarCliente(document)
        if(aux != null){
            aux.name = name
            aux.email = email
            println("Se actualizo correctamente")
        }else{
            println("No se encontro el empleado")
        }

    }

    fun deleteCliente(document: String){
        val aux:Cliente? = buscarCliente(document)
        if(aux != null){
            clientes.remove(aux)
        }
    }*/

    fun nomina(){
        var nomina:Int = 0
        for(i in empleados){
            nomina += i.salary
        }
        println("La nomina total de los empleados es de $nomina")
    }

    fun nominaDependencia(dependencia: Empleado.Dependencia){
        var nomina:Int = 0
        for(i in empleados){
            if(i.dependencia.equals(dependencia)){
                nomina += i.salary
            }
        }
        println("La nomina total de $dependencia es de $nomina")
    }



}