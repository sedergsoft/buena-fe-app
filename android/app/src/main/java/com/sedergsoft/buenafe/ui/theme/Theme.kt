package com.sedergsoft.buenafe.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val BuenaFeColorScheme = darkColorScheme(
    primary = BuenaFeRed,
    onPrimary = BuenaFeWhite,
    background = BuenaFeBlack,
    onBackground = BuenaFeCream,
    surface = BuenaFeCharcoal,
    onSurface = BuenaFeCream
)

@Composable
fun BuenaFeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = BuenaFeColorScheme,
        content = content
    )
}
