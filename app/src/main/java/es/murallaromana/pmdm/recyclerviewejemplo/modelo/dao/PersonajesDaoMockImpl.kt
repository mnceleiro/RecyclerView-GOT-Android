package es.murallaromana.pmdm.recyclerviewejemplo.modelo.dao

import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

// public class PersonajesDaoMockImpl implements PersonajesDao {
class PersonajesDaoMockImpl : PersonajesDao {

    override fun getTodos() = listOf(
        Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg"),
        Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly", "https://thronesapi.com/assets/images/sam.jpg"),
        Personaje(0,"Arya", "Stark", "No One", "House Stark", "https://thronesapi.com/assets/images/arya-stark.jpg"),
        Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth", "https://thronesapi.com/assets/images/brienne-tarth.jpeg")
    )

//    fun prueba() {
//        var lista = ArrayList<Personaje>()
//        lista[0] = Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
//    }

//    override fun getTodos(): List<Personaje> {
//        return listOf(
//            Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg"),
//            Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly", "https://thronesapi.com/assets/images/sam.jpg"),
//            Personaje(0,"Arya", "Stark", "No One", "House Stark", "https://thronesapi.com/assets/images/arya-stark.jpg"),
//            Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth", "https://thronesapi.com/assets/images/brienne-tarth.jpeg")
//        )
//    }

//    override fun getTodos(): List<Personaje> {
//
//        val p1 = Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg");
//        val p2 = Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly", "https://thronesapi.com/assets/images/sam.jpg");
//        val p3 = Personaje(0,"Arya", "Stark", "No One", "House Stark", "https://thronesapi.com/assets/images/arya-stark.jpg");
//        val p4 = Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth", "https://thronesapi.com/assets/images/brienne-tarth.jpeg");
//
//        val listaPersonajes = listOf(p1, p2, p3, p4)
//
//        return listaPersonajes
//    }


}