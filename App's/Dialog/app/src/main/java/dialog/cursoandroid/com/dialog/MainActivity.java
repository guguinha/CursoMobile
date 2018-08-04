package dialog.cursoandroid.com.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criar alert dialog

                dialog = new AlertDialog.Builder( MainActivity.this);

                dialog.setCancelable(false);
                dialog.setIcon(android.R.drawable.btn_star_big_on);

                //configurar titulo
                dialog.setTitle("Titulo do Dialog");

                //configurar mensagem
                dialog.setMessage("Mensagem");

                //configurar botao negativo
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Pressionado botão Não", Toast.LENGTH_SHORT).show();
                            }
                        });
                //configurar botao positivo
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Pressionado botão Sim", Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.create();
                dialog.show();
            }
        });
    }
}
