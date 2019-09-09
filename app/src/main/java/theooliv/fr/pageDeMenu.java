package theooliv.fr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class pageDeMenu extends AppCompatActivity {
    int nb = 11;
    int nb1 = 11;
    int nb2 = 11;
    int nb3 = 11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_de_menu);

        nb = getIntent().getIntExtra("ajouter1", nb);
        nb1 = getIntent().getIntExtra("ajouter2", nb1);
        nb2 = getIntent().getIntExtra("ajouter3", nb2);
        nb3 = getIntent().getIntExtra("ajouter4",nb3);

        nb = getIntent().getIntExtra("retirerNb1", nb);
        nb1 = getIntent().getIntExtra("retirerNb2", nb1);
        nb2 = getIntent().getIntExtra("retirerNb3", nb2);
        nb3 = getIntent().getIntExtra("retirerNb4", nb3);

        /*attribut de la page de menu */
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn_dec = findViewById(R.id.btn_deconected);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirAjouterActivity();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirRetierctivity();
            }
        });
        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retour();
            }
        });
    }
    public void ouvrirAjouterActivity()
    {
        Intent intent = new Intent(this, Ajouter.class);
        intent.putExtra("nombre1",nb);
        intent.putExtra("nombre2",nb1);
        intent.putExtra("nombre3",nb2);
        intent.putExtra("nombre4",nb3);
        startActivity(intent);
    }
    public void ouvrirRetierctivity(){
        Intent intent = new Intent(this, Retirer.class);
        intent.putExtra("nombre1",nb);
        intent.putExtra("nombre2",nb1);
        intent.putExtra("nombre3",nb2);
        intent.putExtra("nombre4",nb3);
        startActivity(intent);
    }
    public void retour(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
