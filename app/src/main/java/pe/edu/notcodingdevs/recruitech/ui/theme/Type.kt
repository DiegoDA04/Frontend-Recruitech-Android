package pe.edu.notcodingdevs.recruitech.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
val RecruitechTypography = Typography(

    headlineMedium = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Black,
        fontSize = 30.sp,
        textAlign = TextAlign.Left,
        color = Grey50
    ),
    bodyLarge = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = LatoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)