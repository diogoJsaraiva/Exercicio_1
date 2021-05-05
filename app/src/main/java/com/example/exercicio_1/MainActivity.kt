package pt.ipg.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
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
        val textInputEditTextNome= findViewById<EditText>(R.id.TextInputEditTextNome)
        val nome = textInputEditTextNome.text.toString()
        val textInputEditTextEmail= findViewById<EditText>(R.id.TextInputEditTextEmail)
        val email = textInputEditTextEmail.text.toString()
        val textInputEditTextTelefone= findViewById<EditText>(R.id.TextInputEditTextTelefone)
        val telefone = textInputEditTextNome.text.toString()
        val textInputEditTextIdade= findViewById<EditText>(R.id.TextInputEditTextIdade)
        val nome = textInputEditTextNome.text.toString()


        /*if(mensagem.trim().isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }*/

        val intent = Intent(this, MostraMensagemActivity::class.java).apply {
            putExtra(INFO_EXTRA_NOME, nome )
            putExtra(INFO_EXTRA_EMAIL, email)
        }


        startActivity(intent)
    }
    TextInputEditTextNome
}