package com.josejunior.biscoitodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josejunior.biscoitodasorte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var b: ActivityMainBinding

    //Frases
    val frases = arrayListOf<String>(
        "A vida trará coisas boas se tiveres paciência.",
        "Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.",
        "Não compense na ira o que lhe falta na razão.",
        "Defeitos e virtudes são apenas dois lados da mesma moeda.",
        "A maior de todas as torres começa no solo.",
        "Não há que ser forte. Há que ser flexível.",
        "Gente todo dia arruma os cabelos, por que não o coração?",
        "A juventude não é uma época da vida, é um estado de espírito.",
        "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.",
        "Siga os bons e aprenda com eles.",
        "Não importa o tamanho da montanha, ela não pode tapar o sol.",
        "")
    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        b.btnProximaFrase.setOnClickListener {
            //versão com random value
            value = (0..(frases.size -1)).random()
            b.txvFrase.text = frases[value]


            /* versão sem random value
            b.txvFrase.text = frases[value]
            if(value < frases.size - 1){
                value++
            }else{
                value = 0
            }*/

        }
    }
}