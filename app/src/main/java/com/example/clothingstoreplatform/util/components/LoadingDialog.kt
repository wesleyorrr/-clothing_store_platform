package com.example.clothingstoreplatform.util.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties


@Composable
fun LoadingDialog(isLoading: Boolean) {
    if (isLoading){
        Dialog(onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(dismissOnClickOutside = false)
            ) {
            Box(modifier = Modifier.width(200.dp))

        }
    }
}