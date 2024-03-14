package com.example.clothingstoreplatform.store.presentation.products_screen.products_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.clothingstoreplatform.store.presentation.products_screen.componets.ProductsViewModel
import com.example.clothingstoreplatform.util.components.LoadingDialog
import com.example.clothingstoreplatform.util.components.MyTopAppBar

@Composable
internal fun ProductScreen(
    viewModel: ProductsViewModel
){

}

@Composable
fun ProductsContent(
    state: ProductViewState
){
    LoadingDialog(isLoading = state.isLoading)
    Scaffold (modifier = Modifier.fillMaxSize(),
        topBar = {
            MyTopAppBar(title  = "Products")


        }
    ){
        LazyVerticalStaggeredGrid(
            modifier = Modifier.padding(top = it.calculateTopPadding()),
            columns = StaggeredGridCells.Fixed(2) ,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalItemSpacing = 10.dp

        ){
                    items(state.products){ products ->

                    }
        }

    }
}