package com.android.breakingbadcomposeapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberImagePainter


@Composable
fun NetworkImage(
    modifier: Modifier = Modifier,
    url: String?,
    contentScale: ContentScale = ContentScale.Fit,

) {

    Image(
        painter = rememberImagePainter(
            data = url
        ),
        contentScale= contentScale,
        contentDescription = null,
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun NetworkImagePreview(
    modifier: Modifier = Modifier,
    url: String? = "https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_walter-white-lg.jpg"

) {
    NetworkImage(url = url)

}