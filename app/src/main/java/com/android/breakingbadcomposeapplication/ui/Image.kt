package com.android.breakingbadcomposeapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation


@Composable
fun NetworkImage(
    modifier: Modifier = Modifier,
    url: String = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"

) {

    Image(
        painter = rememberImagePainter(
            data = url
        ),
        contentDescription = null,
        modifier = modifier
    )


}