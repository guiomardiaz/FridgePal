package com.example.fridgepal;

import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface SpoonacularService {
    @GET("recipes/findByIngredients")
    Call<JsonArray> searchRecipes(
            @Header("x-api-key") String apiKey,
            @Query("ingredients") String ingredients,
            @Query("number") int number
    );
}
