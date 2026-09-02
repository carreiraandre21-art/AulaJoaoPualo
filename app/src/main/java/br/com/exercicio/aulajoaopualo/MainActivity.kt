package br.com.exercicio.aulajoaopualo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.txtHorario)
        val Botao = findViewById<Button>(R.id.btnAtuualizar)

        Botao.setOnClickListener {

            val dataAtual = Date()
            val formato = SimpleDateFormat("dd/MM/YYYY HH:mm:ss" )
            val dataExinbida = formato.format(dataAtual)

            texto.text = dataExinbida


        }
    }
}