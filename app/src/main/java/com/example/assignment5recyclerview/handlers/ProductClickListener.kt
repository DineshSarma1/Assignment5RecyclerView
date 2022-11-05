package com.example.assignment5recyclerview.handlers

import com.example.assignment5recyclerview.data.Product

interface ProductClickListener {
    fun onProductItemClicked(product: Product)
}