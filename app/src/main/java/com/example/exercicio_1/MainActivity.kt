package pt.ipg.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.exercicio_1.MostraDadosActivity
import com.example.exercicio_1.R
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val INFO_EXTRA_NOME = "MENSAGEM"
        const val INFO_EXTRA_DATA = "DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaDados(view: View) {
        val editTextNome = findViewById<EditText>(R.id.TextInputEditTextNome)

        val editTextEmail= findViewById<EditText>(R.id.TextInputEditTextEmail)

        val editTextTelefone= findViewById<EditText>(R.id.TextInputEditTextTelefone)

        val editTextIdade= findViewById<EditText>(R.id.TextInputEditTextIdade)

        val  nome = editTextNome.text.toString()
        val email = editTextEmail.text.toString()
        val telefone = editTextTelefone.text.toString()
        // Normalmente deve ser pedido a data de nascimento
        val idade = editTextIdade.text.toString().toInt()


        var dadosCorretos = true

        if(nome.isBlank())  {
            editTextNome.error = "Porfavor introduza o nome";
            dadosCorretos  = false
            return
        }

        if(email.isBlank()){
            editTextEmail.error="Por favor introduza o email"
            dadosCorretos = false
        }

        if(telefone.isBlank()){
            editTextEmail.error="Por favor introduza o telefone"
            dadosCorretos = false
        }

        if(idade == null){
            editTextEmail.error="Por favor introduza  uma dade valida"
            dadosCorretos = false
        }

        if(dadosCorretos){
            val intent =Intent(This,MostraDadosActivity::class.java).apply {
                putExtra("NOME",nome)
                putExtra("EMAIL",email)
                putExtra("TELEFONE",telefone)
                putExtra("IDADE",idade)
            }

            startActivity(intent)
        }


        /*if(mensagem.trim().isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }*/



    }

}