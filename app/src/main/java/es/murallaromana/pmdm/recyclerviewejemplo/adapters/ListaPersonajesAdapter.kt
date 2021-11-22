package es.murallaromana.pmdm.recyclerviewejemplo.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.activities.DetallePersonajeActivity
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ItemPersonajeBinding
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

class ListaPersonajesAdapter(val personajes: List<Personaje>) :
    RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    override fun getItemCount() = personajes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonajesViewHolder(ItemPersonajeBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)

        holder.enlazarDatos(personaje)


    }

    class PersonajesViewHolder(val itemBinding: ItemPersonajeBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun enlazarDatos(personaje: Personaje) {
            itemBinding.tvNombre.setText(personaje.nombre)
            itemBinding.tvTitulo.setText(personaje.titulo)

            Picasso.get().load(personaje.url).into(itemBinding.ivFoto)

            itemBinding.layoutItemPersonaje.setOnClickListener {
                val intent = Intent(itemBinding.root.context, DetallePersonajeActivity::class.java)
                intent.putExtra("personaje", personaje)
                itemBinding.root.context.startActivity(intent)
            }
        }
    }
}