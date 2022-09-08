package udemy.java.app_cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class JogoCaraCoroaActivity extends AppCompatActivity {

    private ImageButton changeVoltaMainActivity;
    private ImageView imageViewCaraCoroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_cara_coroa);

        changeVoltaMainActivity = findViewById(R.id.imageButton_voltar);
        changeVoltaMainActivity.setOnClickListener(view -> {
            Intent intent = new Intent(
                    getApplicationContext(), MainActivity.class
            );
            startActivity(intent);
            finish();
        });
        imageViewCaraCoroa = findViewById(R.id.imageView_moedaCaraCoroa);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");



        if (numero == 0) {
            imageViewCaraCoroa.setImageResource(R.drawable.moeda_cara);
        } else {
            imageViewCaraCoroa.setImageResource(R.drawable.moeda_coroa);
        }

        /**
        imageViewCaraCoroa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[]  opcoes = { "cara","coroa" };
                String caraCoroa = opcoes[numero];

                switch (caraCoroa) {

                    case "cara" :
                    imageViewCaraCoroa.setImageResource(R.drawable.moeda_cara);
                    break;

                    case "coroa" :
                        imageViewCaraCoroa.setImageResource(R.drawable.moeda_coroa);
                        break;
                }
            }
        });*/

        }
}


