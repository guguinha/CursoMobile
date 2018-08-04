package listview.cursoandroid.com.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {
            "AWP das Arabias x 500kk", "Ak47 x 30kk",
            "AWP Dragon x 1B", "p90 asd x 500kk",
            "Deagle top x 700kk", "caixa espectral x 10kk",
            "Asimob x 100kk", "Stronglipongle x 50kk",
            "100kk x Mp4", "etc x etc","P2000 x 10kk",
            "USP x 100kk", "0,50R$ x 5kk"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter( adaptador );

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorClicado = listaItens.getItemAtPosition( position ).toString();
                Toast.makeText(getApplicationContext(), "Você escolheu realizar a seguinte troca: " + valorClicado, Toast.LENGTH_LONG).show();
            }
        });

    }
}
