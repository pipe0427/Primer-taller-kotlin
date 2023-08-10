package com.example.ejercicios

// se le pone open ya que por defecto la variable es final lo cual no deja modificar a una clase hija, lo cual hay que ponerle open a las variables
// se le pone open a la clase para heredar
open class Persona (open var name:String,open var document:String,open var email:String) {
}