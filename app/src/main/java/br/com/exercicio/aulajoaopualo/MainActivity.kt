package br.com.exercicio.aulajoaopualo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtHorario = findViewById<TextView>(R.id.txtHorario)
        val btnAtualizar = findViewById<Button>(R.id.btnAtuualizar)

        btnAtualizar.setOnClickListener {

            val dataAtual = Date()

            val formato = SimpleDateFormat(
                "dd/MM/yyyy HH:mm:ss",
                Locale.getDefault()
            )

            txtHorario.text = formato.format(dataAtual)
        }

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtIdade = findViewById<EditText>(R.id.edtIdade)

        val btnAvancar = findViewById<Button>(R.id.btnAvancar)
        val btnFechar = findViewById<Button>(R.id.btnFechar)

        btnAvancar.setOnClickListener {

            val nome = edtNome.text.toString()
            val idade = edtIdade.text.toString()

            val intent = Intent(this, segundaActive::class.java)

            intent.putExtra("nome", nome)
            intent.putExtra("idade", idade)

            startActivity(intent)
        }

        btnFechar.setOnClickListener {
            finish()
        }
    }
}