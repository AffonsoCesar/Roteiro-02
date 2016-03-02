package com.example.affonso.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InglesActivity extends AppCompatActivity {

    private Button nButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingles);

        TextView t = (TextView) findViewById(R.id.textViewTIngles);
        TextView t1 = (TextView)findViewById(R.id.textViewt);
        Intent i = getIntent();
        if (i != null) {
            Bundle b = i.getExtras();
            if (b != null) {
                String cor = b.getString("Cor");
                t.setText("A Cor Escolhida foi: " + cor);
                if (cor.equalsIgnoreCase("Azul")) {
                    t1.setText("A tradução é Blue");
                }
                else if (cor.equalsIgnoreCase("Amarelo")) {
                    t1.setText("A tradução é Yellow");
                }
                else if (cor.equalsIgnoreCase("Vermelho")) {
                    t1.setText("A tradução é Red");
                }
            }
        }
        nButton = (Button)findViewById(R.id.button2);

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar();
            }
        });

    }
    private void voltar () {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
