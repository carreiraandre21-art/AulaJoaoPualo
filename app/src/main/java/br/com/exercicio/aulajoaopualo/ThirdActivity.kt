package br.com.exercicio.aulajoaopualo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val txtNome = findViewById<TextView>(R.id.txtExibirNome)
        val txtIdade = findViewById<TextView>(R.id.txtExibirIdade)
        val txtCidade = findViewById<TextView>(R.id.txtExibirCidade)
        val txtCurso = findViewById<TextView>(R.id.txtExibirCurso)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        txtNome.text =
            "Nome: ${intent.getStringExtra("nome")}"

        txtIdade.text =
            "Idade: ${intent.getStringExtra("idade")}"

        txtCidade.text =
            "Cidade: ${intent.getStringExtra("cidade")}"

        txtCurso.text =
            "Curso: ${intent.getStringExtra("curso")}"

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}