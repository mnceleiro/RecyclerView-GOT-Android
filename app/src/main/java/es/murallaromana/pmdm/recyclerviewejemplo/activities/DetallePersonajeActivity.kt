package es.murallaromana.pmdm.recyclerviewejemplo.activities

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

class DetallePersonajeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_personaje)

        val personaje = intent.extras?.get("personaje") as Personaje?

        // TODO: Aquí enlazaría los datos con la interfaz de usuario


        // Esto tambien se puede cambiar en el activity del manifest
//        setTitle(if (personaje != null) personaje.nombre else "Nuevo Personaje")

//        setTitle(personaje?.nombre ?: "Nuevo personaje")
        if (personaje != null) setTitle(personaje.nombre)
        else setTitle("Nuevo personaje")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detalle_personaje, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.accion_guardar) {
                Toast.makeText(this, "Personaje guardado.", Toast.LENGTH_SHORT).show()

            return true

        } else if (item.itemId == R.id.accion_borrar) {
//            Toast.makeText(this, "Personaje borrado.", Toast.LENGTH_SHORT).show()

            val builder = AlertDialog.Builder(this)
            val dialog = builder.setTitle("Borrar personaje")
                .setMessage("Estás apunto de borrar el personaje de: Daenerys Targaryan, ¿estás seguro?")
                .setPositiveButton("Aceptar", { dialog, id ->
                    finish()
                })
                .setNegativeButton("Cancelar", null)
                .create()

            dialog.show()

            return true

        } else {
            return super.onOptionsItemSelected(item)
        }
    }

}