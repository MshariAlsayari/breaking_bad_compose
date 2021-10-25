package com.android.breakingbadcomposeapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation


@Composable
fun NetworkImage(
    modifier: Modifier = Modifier,
    url: String?

) {

    Image(
        painter = rememberImagePainter(
            data = url
        ),
        contentDescription = null,
        modifier = modifier
    )


}