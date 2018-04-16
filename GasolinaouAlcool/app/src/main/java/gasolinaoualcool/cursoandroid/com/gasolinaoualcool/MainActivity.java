package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //recuperar valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                if(textoPrecoAlcool.isEmpty())
                    textoResultado.setText("Preço Alcool não digitado");
                else {
                    if (textoPrecoGasolina.isEmpty())
                        textoResultado.setText("Preço Gasolina não digitado");
                    else{

                        //Converter valores de String para numeros
                        Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                        Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                        //Alcool / Gasolina
                        Double resultado = valorAlcool / valorGasolina;

                        if(resultado >= 0.7){
                            //compensa usar o gasolina
                            textoResultado.setText("É melhor utilizar Gasolina");
                        }else{
                            //compensa usar alcool
                            textoResultado.setText("É melhor utilizar Álcool");
                        }

                    }

                }


            }
        });

    }
}
