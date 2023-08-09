package com.example.ejercicios

class Empresa(val name: String,val nit: String,val address: String,val empleados:ArrayList<Empleado>) {

    val clientes:ArrayList<Cliente> = ArrayList()

    init {
    }

    // EMPLEADO
    fun buscarEmpleado(document: String):Empleado?{
        return empleados.find { it.document == document }
    }
    fun agregarEmpleado(name:String, document: String,email: String,salary: Int,dependencia: Empleado.Dependencia,empleadosSub:ArrayList<Empleado>?):Empleado?{
        val empleado:Empleado = Empleado(name,document,email,salary,dependencia,empleadosSub)
        val aux:Empleado? = buscarEmpleado(empleado.document)
        if(aux == null){
            empleados.add(empleado)
            return empleado
        }else{
            println("No se agrego ya que el empleado existe")
            return null
        }

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


    // CLIENTE

    fun buscarCliente(document: String):Cliente?{
        return clientes.find { it.document == document }
    }
    fun agregarCliente(name: String,document: String,email: String,address: String,phone:Long):Cliente?{
        val cliente:Cliente = Cliente(name,document,email,address,phone)
        val aux:Cliente? = buscarCliente(cliente.document)
        if(aux == null){
            clientes.add(cliente)
            return cliente
        }else{
            println("No se agrego ya que el cliente existe")
            return null
        }
    }

    fun updateCliente( name:String,  document:String,  email:String,address: String,phone: Long):Boolean{
        var aux:Cliente? = buscarCliente(document)
        if(aux != null){
            aux.name = name
            aux.email = email
            aux.address = address
            aux.phone = phone
            println("Se actualizo correctamente")
            return true
        }else{
            println("No se encontro el empleado")
            return false
        }

    }

    fun deleteCliente(document: String):Boolean{
        val aux:Cliente? = buscarCliente(document)
        if(aux != null){
            clientes.remove(aux)
            println("Se elmino correctamente el cliente ${aux.name}")
            return true
        }else{
            println("No se pudo eliminar el cliente")
            return false
        }
    }
    fun listarClientes(): List<Cliente> {
        return clientes.toList()
    }

    // NOMINA
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