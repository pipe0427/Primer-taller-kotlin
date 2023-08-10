package com.example.ejercicios
// se le pone data para moldear los datos
//se le pone override para poder sobreescribir la variable
data class Cliente(override var name:String,override var document:String,override var email:String,var address:String, var phone:Long): Persona(name,document,email ) {
}