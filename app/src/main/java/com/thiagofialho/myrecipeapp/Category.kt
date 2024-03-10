package com.thiagofialho.myrecipeapp

data class Category(val idCategory: String,
    val strCategory: String,
    val strThumb: String,
    val strCategoryDescription: String
    )

data class CategoriesResponse(val categories: List<Category>)
