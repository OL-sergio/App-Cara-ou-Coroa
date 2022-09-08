package udemy.java.app_cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton changeJogoCaraCoroaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeJogoCaraCoroaActivity = findViewById(R.id.imageButton_jogar);
        changeJogoCaraCoroaActivity.setOnClickListener(view -> {
            Intent intent = new Intent(
                    getApplicationContext(), JogoCaraCoroaActivity.class
            );

            int numero = new Random().nextInt(2);
            intent.putExtra("numero", numero);
            startActivity(intent);
        });


    }
}