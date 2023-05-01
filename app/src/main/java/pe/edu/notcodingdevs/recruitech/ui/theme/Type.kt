package pe.edu.notcodingdevs.recruitech.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import pe.edu.notcodingdevs.recruitech.R

// Recruitech Typography

val RubikFont = FontFamily(
    Font(R.font.rubik_light, FontWeight.Light),
    Font(R.font.rubik_regular, FontWeight.Normal),
    Font(R.font.rubik_medium, FontWeight.Medium),
    Font(R.font.rubik_semibold, FontWeight.SemiBold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = RubikFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = RubikFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = RubikFont,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = RubikFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = RubikFont,
        fontWeight = FontWeight.Medium,
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