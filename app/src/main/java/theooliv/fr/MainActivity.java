package theooliv.fr;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import static theooliv.fr.R.layout.activity_page_de_menu;

public class MainActivity extends AppCompatActivity {
    private EditText identifiant = null;
    private EditText motdepasse = null;
    private TextView res = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          /**attribut de la page de connexion*/
        identifiant= findViewById(R.id.identifiant);
        motdepasse= findViewById(R.id.motdepasse);
        Button btn1 = findViewById(R.id.btn1);
        res = findViewById(R.id.res);
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String id = identifiant.getText().toString();
                String mdp = motdepasse.getText().toString();
                if(id.equals("nakote") && mdp.equals("djikeudjie")){
                    openActiity2();
                }else{res.setText("réessayer");}
            }
        });
        }
         public void openActiity2(){
          Intent intent = new Intent(this, pageDeMenu.class);
          startActivity(intent);
         }
}
