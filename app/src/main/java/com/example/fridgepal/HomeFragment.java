package com.example.fridgepal;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.text.TextUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;



public class HomeFragment extends Fragment {
    ArrayList<String>selectedIngredients = new ArrayList();
    ArrayList<CheckBox>chs = new ArrayList<>();
    Button buscarRecetas;
    private ArrayList<String> nombresRecetas = new ArrayList<>();
    private ArrayList<Integer> ids = new ArrayList<>();
    private ArrayList<String> imagenes = new ArrayList<>();
    private SpoonacularService spoonacularService;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        chs.add(rootView.findViewById(R.id.checkBox1));
        chs.add(rootView.findViewById(R.id.checkBox2));
        chs.add(rootView.findViewById(R.id.checkBox3));
        chs.add(rootView.findViewById(R.id.checkBox4));
        chs.add(rootView.findViewById(R.id.checkBox5));
        chs.add(rootView.findViewById(R.id.checkBox6));
        chs.add(rootView.findViewById(R.id.checkBox7));
        chs.add(rootView.findViewById(R.id.checkBox8));
        chs.add(rootView.findViewById(R.id.checkBox9));
        chs.add(rootView.findViewById(R.id.checkBox10));
        chs.add(rootView.findViewById(R.id.checkBox11));
        chs.add(rootView.findViewById(R.id.checkBox12));
        chs.add(rootView.findViewById(R.id.checkBox13));
        chs.add(rootView.findViewById(R.id.checkBox14));
        chs.add(rootView.findViewById(R.id.checkBox15));
        chs.add(rootView.findViewById(R.id.checkBox16));
        chs.add(rootView.findViewById(R.id.checkBox17));
        chs.add(rootView.findViewById(R.id.checkBox18));
        chs.add(rootView.findViewById(R.id.checkBox19));
        chs.add(rootView.findViewById(R.id.checkBox20));
        chs.add(rootView.findViewById(R.id.checkBox21));
        chs.add(rootView.findViewById(R.id.checkBox22));
        chs.add(rootView.findViewById(R.id.checkBox23));
        chs.add(rootView.findViewById(R.id.checkBox24));
        chs.add(rootView.findViewById(R.id.checkBox25));
        chs.add(rootView.findViewById(R.id.checkBox26));
        chs.add(rootView.findViewById(R.id.checkBox27));
        chs.add(rootView.findViewById(R.id.checkBox28));
        chs.add(rootView.findViewById(R.id.checkBox29));
        chs.add(rootView.findViewById(R.id.checkBox30));
        chs.add(rootView.findViewById(R.id.checkBox31));
        chs.add(rootView.findViewById(R.id.checkBox32));
        chs.add(rootView.findViewById(R.id.checkBox33));
        chs.add(rootView.findViewById(R.id.checkBox34));
        chs.add(rootView.findViewById(R.id.checkBox35));
        chs.add(rootView.findViewById(R.id.checkBox36));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        spoonacularService = retrofit.create(SpoonacularService.class);

        ImageView imageView = rootView.findViewById(R.id.imageView6);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Zanahoria", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView2 = rootView.findViewById(R.id.imageView7);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Lechuga", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView3 = rootView.findViewById(R.id.imageView8);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Tomate", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView4 = rootView.findViewById(R.id.imageView8);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Tomate", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView5 = rootView.findViewById(R.id.imageView9);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Brocoli", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView6 = rootView.findViewById(R.id.imageView10);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Carne Picada", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView7 = rootView.findViewById(R.id.imageView11);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Pollo", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView8 = rootView.findViewById(R.id.imageView12);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Salchichas", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView9 = rootView.findViewById(R.id.imageView13);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Ternera", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView10 = rootView.findViewById(R.id.imageView);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Naranja", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView11 = rootView.findViewById(R.id.imageView2);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Piña", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView12 = rootView.findViewById(R.id.imageView3);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Platano", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView13 = rootView.findViewById(R.id.imageView4);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Costilla", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView14 = rootView.findViewById(R.id.imageView5);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Jamón", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView15 = rootView.findViewById(R.id.imageView14);
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Bacon", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView16 = rootView.findViewById(R.id.imageView15);
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Cebolla", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView17 = rootView.findViewById(R.id.imageView16);
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Maiz", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView18 = rootView.findViewById(R.id.imageView17);
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Patatas", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView19 = rootView.findViewById(R.id.imageView18);
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Pimiento", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView20 = rootView.findViewById(R.id.imageView19);
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Aguacate", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView21 = rootView.findViewById(R.id.imageView20);
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coco", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView22 = rootView.findViewById(R.id.imageView21);
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Fresa", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView23 = rootView.findViewById(R.id.imageView22);
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Limon", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView24 = rootView.findViewById(R.id.imageView23);
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "York", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView25 = rootView.findViewById(R.id.imageView25);
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Almejas", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView26 = rootView.findViewById(R.id.imageView26);
        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Anchoas", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView27 = rootView.findViewById(R.id.imageView27);
        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Boqueron", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView28 = rootView.findViewById(R.id.imageView28);
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Gambas", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView29 = rootView.findViewById(R.id.imageView29);
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Langosta", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imageView30 = rootView.findViewById(R.id.imageView30);
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Lubina", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView31 = rootView.findViewById(R.id.imageView31);
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Mejillon", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imageView32 = rootView.findViewById(R.id.imageView32);
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Pulpo", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView33 = rootView.findViewById(R.id.imageView34);
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Leche", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imageView34 = rootView.findViewById(R.id.imageView35);
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Mantequilla", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView35 = rootView.findViewById(R.id.imageView40);
        imageView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Nata", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView36 = rootView.findViewById(R.id.imageView38);
        imageView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Queso", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView37 = rootView.findViewById(R.id.imageView39);
        imageView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Manzana", Toast.LENGTH_SHORT).show();
            }
        });

        buscarRecetas = rootView.findViewById(R.id.buscarRecetas);
        buscarRecetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedIngredients.clear(); // Limpiar la lista de ingredientes seleccionados antes de agregar los nuevos

                for(int i = 0; i < chs.size() ; i++) {
                    if (chs.get(i).isChecked()) {
                        // Agregar el ingrediente al ArrayList de ingredientes seleccionados
                        selectedIngredients.add(chs.get(i).getText().toString());
                    }
                }

                System.out.println(selectedIngredients);

                if (selectedIngredients.isEmpty()){
                    Toast.makeText(getContext(), "Selecciona ingredientes", Toast.LENGTH_SHORT).show();
                }

                String apiKey = "f4a9735dddbe4a5f8caad98b7f459e34";
                String ingredients = TextUtils.join(",", selectedIngredients);
                int number = 10; // Número de recetas que deseas obtener

                System.out.println(ingredients);
                Call<JsonArray> call = spoonacularService.searchRecipes(apiKey, ingredients, number);
                call.enqueue(new Callback<JsonArray>() {
                    @Override
                    public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {

                        System.out.println(response.body());
                        if (response.isSuccessful()) {
                            JsonArray recipesJson = response.body();


                            for (JsonElement recipeElement : recipesJson) {
                                JsonObject recipeObject = recipeElement.getAsJsonObject();

                                String recipeName = recipeObject.get("title").getAsString();
                                int recipeId = recipeObject.get("id").getAsInt();
                                String imagen = recipeObject.get("image").getAsString();

                                nombresRecetas.add(recipeName);
                                ids.add(recipeId);
                                imagenes.add(imagen);



                                System.out.println(recipeName);
                                System.out.println(recipeId);
                                System.out.println(imagen);
                                /*System.out.println(source);*/

                                Intent intent = new Intent(getActivity(), Recetas.class);
                                intent.putStringArrayListExtra("nombresRecetas", nombresRecetas);
                                intent.putExtra("recipeId", ids);
                                intent.putExtra("imagenes", imagenes);
                                startActivity(intent);
                            }
                        } else {

                            System.out.println("Error: " + response.code());
                        }
                    }

                    @Override
                    public void onFailure(Call<JsonArray> call, Throwable t) {

                    }
                });

            }
        });

        Button addButton = rootView.findViewById(R.id.botonAñadirIng);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                View dialogView = inflater.inflate(R.layout.activity_dialog, null);


                LinearLayout checkboxContainer = dialogView.findViewById(R.id.checkbox_container);
                checkboxContainer.setBackgroundColor(Color.parseColor("#FFFFFF"));



                ArrayList<String> ingredientList = new ArrayList<>();
                ingredientList.add("Mushroom");
                ingredientList.add("Rice");
                ingredientList.add("Pasta");
                ingredientList.add("Egg");

                // Agregar casillas de verificación para cada ingrediente
                for (String ingredient : ingredientList) {
                    CheckBox checkBox = new CheckBox(getContext());
                    checkBox.setText(ingredient);
                    checkBox.setTextColor(Color.parseColor("#000000"));
                    checkboxContainer.addView(checkBox);
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);
                AlertDialog alertDialog = builder.create();


                Button confirmButton = dialogView.findViewById(R.id.confirmar);
                confirmButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        ArrayList<String> selectedIngredients = new ArrayList<>();
                        for (int i = 0; i < checkboxContainer.getChildCount(); i++) {
                            View view = checkboxContainer.getChildAt(i);
                            if (view instanceof CheckBox) {
                                CheckBox checkBox = (CheckBox) view;
                                if (checkBox.isChecked()) {
                                    selectedIngredients.add(checkBox.getText().toString());
                                }
                            }
                        }

                        Toast.makeText(getContext(), "Ingredientes seleccionados: " + TextUtils.join(", ", selectedIngredients), Toast.LENGTH_SHORT).show();



                        alertDialog.dismiss();

                        LinearLayout ingredientContainer = new LinearLayout(getContext());
                        ingredientContainer.setOrientation(LinearLayout.HORIZONTAL);


                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );

                        layoutParams.setMargins(5, 5, 5, 5);
                        ingredientContainer.setLayoutParams(layoutParams);

                        System.out.println(selectedIngredients);


                        for (String ingredient : selectedIngredients) {

                            LinearLayout itemLayout = new LinearLayout(getContext());
                            itemLayout.setOrientation(LinearLayout.VERTICAL);
                            itemLayout.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    1
                            ));


                            ImageView imageView = new ImageView(getContext());
                            imageView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    1

                            ));

                            imageView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if (ingredient.equals("Mushroom")) {
                                        Toast.makeText(getContext(), "Champiñon", Toast.LENGTH_SHORT).show();
                                    }else if (ingredient.equals("Rice")) {
                                        Toast.makeText(getContext(), "Arroz", Toast.LENGTH_SHORT).show();
                                    }else if (ingredient.equals("Pasta")) {
                                        Toast.makeText(getContext(), "Pasta", Toast.LENGTH_SHORT).show();
                                    }else if (ingredient.equals("Egg")) {
                                        Toast.makeText(getContext(), "Huevo", Toast.LENGTH_SHORT).show();
                                    }

                                    }
                            });

                            if(ingredient.equals("Pasta")) {
                                imageView.setImageResource(R.drawable.pasta);
                                itemLayout.addView(imageView);
                            }
                            if(ingredient.equals("Egg")) {
                                imageView.setImageResource(R.drawable.huevo);
                                itemLayout.addView(imageView);
                            }
                            if(ingredient.equals("Mushroom")) {
                                imageView.setImageResource(R.drawable.champi);
                                itemLayout.addView(imageView);
                            }
                            if(ingredient.equals("Rice")) {
                                imageView.setImageResource(R.drawable.arroz);
                                itemLayout.addView(imageView);
                            }


                            CheckBox checkBox = new CheckBox(getContext());
                            checkBox.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    1
                            ));
                            checkBox.setText(ingredient);
                            checkBox.setTextColor(Color.parseColor("#000000"));
                            checkBox.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#000000")));
                            itemLayout.addView(checkBox);

                            chs.add(checkBox);


                            ingredientContainer.addView(itemLayout);
                        }


                        LinearLayout ingredientLayout = rootView.findViewById(R.id.ingredientLayout);
                        ingredientLayout.addView(ingredientContainer);

                    }
                });

                alertDialog.show();
            }
        });


        return rootView;
    }

}