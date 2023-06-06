package com.example.fridgepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class Recetas extends AppCompatActivity {

    TextView txt,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    ImageView img,img2,img3,img4,img5,img6,img7,img8,img9,img10;
    Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10, volver;

    ArrayList<String> nombreRecetas = new ArrayList<>();
    ArrayList<Integer> idsRecetas = new ArrayList<>();
    ArrayList<String> imagenesRecetas = new ArrayList<>();
    ArrayList<TextView> textos = new ArrayList<>();
    ArrayList<ImageView> imagenes = new ArrayList<>();
    ArrayList<Button> botones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        nombreRecetas = getIntent().getStringArrayListExtra("nombresRecetas");
        idsRecetas = getIntent().getIntegerArrayListExtra("recipeId");
        imagenesRecetas = getIntent().getStringArrayListExtra("imagenes");


        txt = findViewById(R.id.nombreReceta1);
        img = findViewById(R.id.receta1);

        txt2 = findViewById(R.id.nombreReceta2);
        img2 = findViewById(R.id.receta2);

        txt3 = findViewById(R.id.nombreReceta3);
        img3 = findViewById(R.id.receta3);

        txt4 = findViewById(R.id.nombreReceta4);
        img4 = findViewById(R.id.receta4);

        txt5 = findViewById(R.id.nombreReceta5);
        img5 = findViewById(R.id.receta5);

        txt6 = findViewById(R.id.nombreReceta6);
        img6 = findViewById(R.id.receta6);

        txt7 = findViewById(R.id.nombreReceta7);
        img7 = findViewById(R.id.receta7);

        txt8 = findViewById(R.id.nombreReceta8);
        img8 = findViewById(R.id.receta8);

        txt9 = findViewById(R.id.nombreReceta9);
        img9 = findViewById(R.id.receta9);

        txt10 = findViewById(R.id.nombreReceta10);
        img10 = findViewById(R.id.receta10);

        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        boton10 = findViewById(R.id.boton10);
        volver = findViewById(R.id.volver);

        textos.add(txt);
        textos.add(txt2);
        textos.add(txt3);
        textos.add(txt4);
        textos.add(txt5);
        textos.add(txt6);
        textos.add(txt7);
        textos.add(txt8);
        textos.add(txt9);
        textos.add(txt10);

        imagenes.add(img);
        imagenes.add(img2);
        imagenes.add(img3);
        imagenes.add(img4);
        imagenes.add(img5);
        imagenes.add(img6);
        imagenes.add(img7);
        imagenes.add(img8);
        imagenes.add(img9);
        imagenes.add(img10);

        botones.add(boton1);
        botones.add(boton2);
        botones.add(boton3);
        botones.add(boton4);
        botones.add(boton5);
        botones.add(boton6);
        botones.add(boton7);
        botones.add(boton8);
        botones.add(boton9);
        botones.add(boton10);

       try {

           for (int i = 0 ; i < nombreRecetas.size();i++){
                textos.get(i).setText(nombreRecetas.get(i));
                botones.get(i).setEnabled(true);
                botones.get(i).setVisibility(View.VISIBLE);
           }

           for (int i = 0 ; i < imagenesRecetas.size();i++){
               Picasso.get().load(imagenesRecetas.get(i)).into(imagenes.get(i));
           }


       }catch(IndexOutOfBoundsException e){

       }




        botones.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(0), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(0);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });
        botones.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(1), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(1);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(2), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(2);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });


        botones.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(3), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(3);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(4), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(4);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(5), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(5);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(6), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(6);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(7), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(7);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(8), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(8);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        botones.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encodedRecipeName = null;
                try {
                    encodedRecipeName = URLEncoder.encode(nombreRecetas.get(9), "UTF-8");
                    String url = "https://spoonacular.com/recipes/" + encodedRecipeName + "-" + idsRecetas.get(9);

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para volver a HomeFragment
                nombreRecetas.clear();
                idsRecetas.clear();
                imagenesRecetas.clear();

                Intent i = new Intent(getApplicationContext(),Nevera.class);
                startActivity(i);

                finish(); // Cierra la actividad actual
            }
        });

    }
    @Override
    public void onBackPressed() {
        nombreRecetas.clear();
        idsRecetas.clear();
        imagenesRecetas.clear();

        Intent i = new Intent(getApplicationContext(),Nevera.class);
        startActivity(i);

        super.onBackPressed();
    }


}