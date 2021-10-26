package es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades

class Personaje(
    var id: Long,
    var nombre: String,
    var apellido: String,
    var titulo: String,
    var familia: String,
    var url: String,
    var descripcion: String = ""
) {

    fun getNombreCompleto(): String {
        return nombre + " " + apellido
    }

    fun getNombreCompleto2(): String {
        return "El nombre es: ${this.nombre} y el apellido es: ${this.apellido}"
    }

    fun getNombreCompleto3() = "El nombre es: ${this.nombre} y el apellido es: ${this.apellido}"

}