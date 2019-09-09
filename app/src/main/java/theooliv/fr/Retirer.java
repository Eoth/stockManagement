package theooliv.fr;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class Retirer extends AppCompatActivity {
    int nb; int nb1; int nb2; int nb3;
    private static final int DIALOG_ALERT = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retirer);
        nb = getIntent().getIntExtra("nombre1", 0);
        nb1 = getIntent().getIntExtra("nombre2", 0);
        nb2 = getIntent().getIntExtra("nombre3", 0);
        nb3 = getIntent().getIntExtra("nombre4", 0);

        Button btn5 = findViewById(R.id.btn5);

        Button draw1 = findViewById(R.id.rmenu1);
        Button draw2 = findViewById(R.id.rmenu2);
        Button draw3 = findViewById(R.id.rmenu3);
        Button draw4 = findViewById(R.id.rmenu4);

        final TextView elem1 = findViewById(R.id.retir1);
        final TextView elem2 = findViewById(R.id.retir2);
        final TextView elem3 = findViewById(R.id.retir3);
        final TextView elem4 = findViewById(R.id.retir4);

        final ImageView image1 = findViewById(R.id.image1);
        final ImageView image2 = findViewById(R.id.image2);
        final ImageView image3 = findViewById(R.id.image3);
        final ImageView image4 = findViewById(R.id.image4);

        if(nb>0)
        {elem1.setText(nb+" en stocks");}
        else{elem1.setText("Rupture de stock");
            image1.setImageResource(R.drawable.img5);}

        if(nb1>0)
        {elem2.setText(nb1+" en stocks");}
        else{elem2.setText("Rupture de stock");
            image2.setImageResource(R.drawable.img5);}

        if(nb2>0)
        {elem3.setText(nb2+" en stocks");}
        else{elem3.setText("Rupture de stock");
            image3.setImageResource(R.drawable.img5);}

        if(nb3>0)
        {elem4.setText(nb3+" en stocks");}
        else{elem4.setText("Rupture de stock");
            image4.setImageResource(R.drawable.img5);}

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous();
            }
        });

        draw1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb -= 1;
               if(nb <= 5) showDialog(DIALOG_ALERT);
                if(nb>0)
                { elem1.setText(nb +" en stocks");
                    image1.setImageResource(R.drawable.img2);}
                else{elem1.setText("Rupture de stock");
                    image1.setImageResource(R.drawable.img5);}
                 }});
        draw2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb1 -= 1;
                if(nb1 <= 5) showDialog(DIALOG_ALERT);
                if(nb1>0)
                { elem2.setText(nb1 +" en stocks");
                    image2.setImageResource(R.drawable.img3);}
                else{elem2.setText("Rupture de stock");
                    image2.setImageResource(R.drawable.img5);}
            }});
        draw3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb2 -= 1;
                if(nb2 <= 5) showDialog(DIALOG_ALERT);
                if(nb2>0)
                { elem3.setText(nb2 +" en stocks");
                    image3.setImageResource(R.drawable.img6);}
                else{elem3.setText("Rupture de stock");
                    image3.setImageResource(R.drawable.img5);}
            }});
        draw4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb3 -= 1;
               if(nb3 <= 5) showDialog(DIALOG_ALERT);
                if(nb3>0)
                { elem4.setText(nb3 +" en stocks");
                    image4.setImageResource(R.drawable.img7);}
                else{elem4.setText("Rupture de stock");
                    image4.setImageResource(R.drawable.img5);}
            }});
    }
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_ALERT:
                // Create out AlterDialog
                Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(" Attention il reste moins 5 articles en stock");
                builder.setCancelable(true);
                builder.setPositiveButton("Ok", new CancelOnClickListener ());
                AlertDialog dialog = builder.create();
                dialog.show();
        }
        return super.onCreateDialog(id);
    }
    private final class CancelOnClickListener  implements
            DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(getApplicationContext(), "!!Tenez compte!!",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void previous(){
        Intent intent = new Intent(this, pageDeMenu.class);
        intent.putExtra("retirerNb1",nb);
        intent.putExtra("retirerNb2",nb1);
        intent.putExtra("retirerNb3",nb2);
        intent.putExtra("retirerNb4",nb3);
        startActivity(intent);
    }

}
