package com.example.affonso.roteiro02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    private EditText nCor;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            nCor = (EditText) findViewById(R.id.cor);
            ((Button) findViewById(R.id.button)).setOnClickListener(new Traduzir("TRADUZIR", null));
            ((Button) findViewById(R.id.button4)).setOnClickListener(new Traduzir("TRADUZIR", "INGLES"));
            ((Button) findViewById(R.id.button5)).setOnClickListener(new Traduzir("TRADUZIR", "FRANCES"));
            }

        private class Traduzir implements View.OnClickListener {
        private String action;
        private String category;

        Traduzir(String action, String category){
            this.action = action;
            this.category = category;
        }

        @Override
        public void onClick(View v) {
            String cor = nCor.getText().toString();
            if (cor.equalsIgnoreCase("Azul") || cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Vermelho")) {
                Intent i = new Intent(this.action);
                    if (this.category != null)
                        i.addCategory(this.category);
                    Bundle b = new Bundle();
                    b.putString("Cor", cor);
                    i.putExtras(b);
                    startActivity(i);
            }
            else {
                View focus = null;
                if (TextUtils.isEmpty(cor)) {
                    nCor.setError("Campo Vazio");
                    focus = nCor;
                    focus.requestFocus();
                } else {
                    nCor.setError("Cor Inválida, Digite Novamente");
                    focus = nCor;
                    focus.requestFocus();
                }
            }
        }
    }
}