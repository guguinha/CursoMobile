package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {
            "Áries", "Leão", "Sagitário",
            "Touro", "Virgem", "Capricórnio",
            "Gêmeos", "Libra", "Aquário",
            "Câncer", "Escorpião", "Peixes"
    };

    private String[] perfis = {
            "Segundo a mitologia grega, o filho do rei Atamas – Frixo -, ia ser assassinado pela sua madrasta, quando um carneiro com lã de ouro, conhecido também como o velocino de ouro, que foi enviado pela sua mãe. O carneiro foi sacrificado no lugar do menino, ganhando um túmulo no pomar de Ares, que é o deus da guerra.",
            "Foi o primeiro signo do Zodíaco a ser criado, ele inicia a primavera e também o início do ano. A imagem do touro vem de um episódio em que Zeus, chefe dos deuses, usou da imagem desse animal para conseguir seduzir uma princesa.",
            "Dois filhos de Zeus, conhecidos como Castor e Pólux, se apaixonaram por duas garotas comprometidas, desafiando os companheiros das moças. Castor morreu e então Pólux pediu para que Zeus o matasse. Em homenagem aos filhos, Zeus colocou a imagem dos gêmeos nos céus.",
            "O caranguejo foi enviado para lutar contra Hércules, filho bastardo de Zeus pela sua mulher oficial, Hera. O animal morreu em batalha mas foi lhe concedida uma imagem no céu diante de tamanha coragem.",
            "Morto por Hércules, o animal foi estrangulado e de sua pele foi feito um manto para o Herói. Em sua homenagem, foi destinado com as estrelas a forma do animal no céu.",
            "Representação da deusa da justiça, ela ficou doente pelas guerras dos homens. Foi o último ser celestial a subir para o Olimpo, então Minerva, a deusa da sabedoria, colocou uma imagem no céus como homenagem.",
            "O item utilizado por Virgem para pesar a alma dos recém mortos, determinado se teriam benefícios ou malefícios na vida após a morte.",
            "Apoi, irmão de Artêmis ficou com inveja da amizade da irmã com o gigante Órion, enviando um escorpião para mordê-lo. O escorpião foi morto e então Zeus colocou sua imagem no céu como homenagem.",
            "Quiron era o centauro mais sábio de sua raça. Ele foi atingido por uma flecha lançada por Hércules, então foi homenageado por Zeus com uma constelação.",
            "Segunda as lendas gregas, a cabra que aparece tem uma cauda de peixe. Isso representa Pan, deus da natureza, que enquanto fugia do Titã Tifon, se jogou na água na fuga. Porém acabou morrendo enquanto virava peixe pois a outra metade de seu corpo estava fora d’água.",
            "Conhecido como um dos símbolos aquáticos dos babilônicos, o seu mês representa o período das chuvas, o que deu origem ao símbolo do homem segurando o jarro de água.",
            "Afrodite e seu filho, Eros, se transformaram em peixes para conseguir escapar do titã Tifon, que temia a água. Então Atena criou a constelação como forma de lembrar esse acontecimento."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter( adaptador );

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), perfis[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
