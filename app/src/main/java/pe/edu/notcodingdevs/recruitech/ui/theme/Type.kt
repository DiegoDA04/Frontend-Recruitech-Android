package pe.edu.notcodingdevs.recruitech.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.notcodingdevs.recruitech.R

// Recruitech Typography
val LatoFont = FontFamily(
    Font(R.font.lato_thin, FontWeight.Thin),
    Font(R.font.lato_light, FontWeight.Light),
    Font(R.font.lato_regular, FontWeight.Normal),
    Font(R.font.lato_bold, FontWeight.Bold),
    Font(R.font.lato_black, FontWeight.Black)
)

// Set of Material typography styles to start with
val Typography = Typography(

    headlineMedium = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Black,
        fontSize = 28.sp,
        color = Blue80,
        letterSpacing = 0.25.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Black,
        fontSize = 24.sp,
        color = Blue80,
        letterSpacing = 0.5.sp
    )
)