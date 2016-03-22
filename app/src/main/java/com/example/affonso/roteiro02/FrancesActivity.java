package com.example.affonso.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrancesActivity extends AppCompatActivity {

    private Button fButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frances);

        TextView t = (TextView) findViewById(R.id.textViewTFrances);
        TextView t2 = (TextView) findViewById(R.id.textViewF);
        Intent i = getIntent();
        if (i != null) {
            Bundle b = i.getExtras();
            if (b != null) {
                String cor = b.getString("Cor");
                t.setText("A Cor Escolhida foi: " + cor);
                if (cor.equalsIgnoreCase("Azul")) {
                    t2.setText("A tradução é Bleu");
                }
                else if (cor.equalsIgnoreCase("Amarelo")) {
                    t2.setText("A tradução é Jaune");
                }
                else if (cor.equalsIgnoreCase("Vermelho")) {
                    t2.setText("A tradução é Rouge");
                }
            }

        }
        fButton = (Button)findViewById(R.id.button3);

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                voltar();
            }
        });

    }
    private void voltar () {
        finish();
    }
}
