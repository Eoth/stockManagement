package theooliv.fr;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Ajouter extends AppCompatActivity {
     int nb; int nb1; int nb2; int nb3;
    private EditText edit1 = null,edit2=null, edit3=null, edit4=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ajouter);
        edit1= findViewById(R.id.textView1);
        edit2= findViewById(R.id.textView2);
        edit3= findViewById(R.id.textView3);
        edit4= findViewById(R.id.textView4);

        nb = getIntent().getIntExtra("nombre1", 0);
        nb1 = getIntent().getIntExtra("nombre2", 0);
        nb2 = getIntent().getIntExtra("nombre3", 0);
        nb3 = getIntent().getIntExtra("nombre4", 0);

        Button btn4 = findViewById(R.id.btn4);

        Button add1 = findViewById(R.id.menu1);
        Button add2 = findViewById(R.id.menu2);
        Button add3 = findViewById(R.id.menu3);
        Button add4 = findViewById(R.id.menu4);

        final TextView elem1 = findViewById(R.id.elem1);
        final TextView elem2 = findViewById(R.id.elem2);
        final TextView elem3 = findViewById(R.id.elem3);
        final TextView elem4 = findViewById(R.id.elem4);

        final ImageView image1 = findViewById(R.id.im1);
        final ImageView image2 = findViewById(R.id.im2);
        final ImageView image3 = findViewById(R.id.im3);
        final ImageView image4 = findViewById(R.id.im4);

        if (nb > 0) {
            elem1.setText(nb+" en stocks");
        } else {
            elem1.setText("Rupture de stock");
            image1.setImageResource(R.drawable.img5); }

        if (nb1 > 0) {
            elem2.setText(nb1+" en stocks");
        } else {
            elem2.setText("Rupture de stock");
            image2.setImageResource(R.drawable.img5); }

        if (nb2 > 0) {
            elem3.setText(nb2+" en stocks");
        } else {
            elem3.setText("Rupture de stock");
            image3.setImageResource(R.drawable.img5); }

        if (nb3 > 0) {
            elem4.setText(nb3+" en stocks");
        } else {
            elem4.setText("Rupture de stock");
            image4.setImageResource(R.drawable.img5); }


        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { previous(); }});

        add1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                nb += 1;
                if(!edit1.getText().toString().equals("")) nb = nb+Integer.parseInt(edit1.getText().toString());
                if (nb > 0) {
                    image1.setImageResource(R.drawable.img2);
                    elem1.setText(nb+" en stocks");
                } else {
                    elem1.setText("Rupture de stock");
                    image1.setImageResource(R.drawable.img5);
                } }});

        add2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb1 += 1;
                if(!edit2.getText().toString().equals("")) nb1 = nb1+Integer.parseInt(edit2.getText().toString());
                if (nb1 > 0) {
                    image2.setImageResource(R.drawable.img3);
                    elem2.setText(nb1+" en stocks");
                } else {
                    elem2.setText("Rupture de stock");
                    image2.setImageResource(R.drawable.img5); } }});
        add3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb2 += 1;
                if(!edit3.getText().toString().equals("")) nb2 = nb2+Integer.parseInt(edit3.getText().toString());
                if (nb2 > 0) {
                    image3.setImageResource(R.drawable.img6);
                    elem3.setText(nb2+" en stocks");
                } else {
                    elem3.setText("Rupture de stock");
                    image3.setImageResource(R.drawable.img5); } }});
        add4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb3 += 1;
                if(!edit4.getText().toString().equals("")) nb3 = nb3+Integer.parseInt(edit4.getText().toString());
                if (nb3 > 0) {
                    image4.setImageResource(R.drawable.img7);
                    elem4.setText(nb3+" en stocks");
                } else {
                    elem4.setText("Rupture de stock");
                    image4.setImageResource(R.drawable.img5); } }});

    }
    public void previous(){
        Intent intent = new Intent(this, pageDeMenu.class);
        intent.putExtra("ajouter1",nb);
        intent.putExtra("ajouter2",nb1);
        intent.putExtra("ajouter3",nb2);
        intent.putExtra("ajouter4",nb3);
        startActivity(intent);
    }

}
