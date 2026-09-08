package br.com.exercicio.aulajoaopualo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class segundaActive : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda)

        val txtNome = findViewById<TextView>(R.id.txtNomeRecebido)
        val txtIdade = findViewById<TextView>(R.id.txtIdadeRecebida)

        val edtCidade = findViewById<EditText>(R.id.edtCidade)
        val edtCurso = findViewById<EditText>(R.id.edtCurso)

        val btnAvancar = findViewById<Button>(R.id.btnAvancar)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getStringExtra("idade")

        txtNome.text = "Nome: $nome"
        txtIdade.text = "Idade: $idade"

        btnAvancar.setOnClickListener {

            val cidade = edtCidade.text.toString()
            val curso = edtCurso.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)

            intent.putExtra("nome", nome)
            intent.putExtra("idade", idade)
            intent.putExtra("cidade", cidade)
            intent.putExtra("curso", curso)

            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}