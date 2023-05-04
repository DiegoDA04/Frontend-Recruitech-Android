package pe.edu.notcodingdevs.recruitech.shared.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import pe.edu.notcodingdevs.recruitech.ui.theme.Blue80

@Composable
fun ScreenTitle(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        color = Blue80,
        style = MaterialTheme.typography.headlineSmall
    )
}