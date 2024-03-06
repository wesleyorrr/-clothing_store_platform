package com.example.clothingstoreplatform.store.presentation.products_screen.componets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.clothingstoreplatform.store.domain.model.Product

@Composable
fun ProductCard(
    modifier: Modifier,
    product: Product
) {
    Card(modifier = modifier, shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {

        Column(modifier = Modifier.padding(15.dp)){

        }


    }
}