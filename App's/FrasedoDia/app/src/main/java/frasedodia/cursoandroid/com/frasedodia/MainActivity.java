package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView textoNovaFrase;
    private TextView textoReferencia;

    private String frase2;

    private String[] frases = {
            "Boy, identico boy, identico, vou dar uma passadinha ai visse",
            "Hihihihihihihihihihi",
            "Então avante irmão, avante neh, avante e cabeça pra cima e xau",
            "Eu vou ai, eu vou ai, segura a bola, eu vou ai",
            "Blz, blz, fecha de que horas essa porra ai",
            "Boyzão, vamo sair pra comer boy, namoral se encontrar ai",
            "Resenha enorme ai com os caras poh, ta doido",
            "HeuHhaesuhuhaeauh",
            "Trabalhando dessa maneira agora, na brutalidade",
            "HAha eita carai, Hei, Hou, Shei, Ui titia, Ai titia",
            "Que frase espetacular nos definiu completamente, 100% definição",
            "Cada um com seu gosto e espero respeito porque respeito seus gostos e você tem que respeitar o meu também, sem mais",
            "Ei guga arrocha no mei do cu, arrocha no mei do cu.. Hahaaa",
            "Regra basica da vida: Na volta descida vira subida",
            "Vamo quebrar esse filha da puta, vamos quebrar esse filha da puta",
            "UhuhuhuhuHuH",
            "Oxe esse boy e todo otario, mai pronto rai timbora",
            "Oxe, Te Danas"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.texoNovaFraseId);
        textoReferencia = (TextView) findViewById(R.id.textoReferenciaId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {

            String frase2;

            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                frase2 = "\""+frases[numeroAleatorio]+"\"";
                textoNovaFrase.setText(frase2);
                textoReferencia.setText("Carvalho, M. S.");
            }
        });
    }
}