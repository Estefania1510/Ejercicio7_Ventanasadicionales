package mx.edu.tecmm.moviles.ejercicio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    lateinit var txtvisual:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)
     txtvisual = findViewById<TextView>(R.id.txtvisual)
    }

    fun numero1(v: View){
        txtvisual.append("1")
    }
    fun numero2(v: View){
        txtvisual.append("2")
    }
    fun numero3(v: View){
        txtvisual.append("3")
    }
    fun numero4(v: View){
        txtvisual.append("4")
    }
    fun Eliminartodo(v: View){
        txtvisual.text = ""
    }
    fun Eliminar(v: View){
        val textoActual = txtvisual.text.toString()
        if (textoActual.isNotEmpty()) {
            val nuevoTexto = textoActual.substring(0, textoActual.length - 1)
            txtvisual.text = nuevoTexto
        }

    }

}

