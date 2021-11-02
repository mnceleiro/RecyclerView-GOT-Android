package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.adapters.ListaPersonajesAdapter
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityMainBinding
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.dao.PersonajesDao
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.dao.PersonajesDaoMockImpl
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflo las vistas
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtengo los datos de los personajes
        val personajesDao = PersonajesDaoMockImpl()
        val listaPersonajes = personajesDao.getTodos()

        // Creo los componentes que necesita el RecyclerView
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapter(listaPersonajes)

        // Asocio el RecyclerView con sus componentes
        binding.rvListaPersonajes.adapter = adapter
        binding.rvListaPersonajes.layoutManager = layoutManager

        // Si la lista no va a cambiar
        binding.rvListaPersonajes.setHasFixedSize(true)
    }
}