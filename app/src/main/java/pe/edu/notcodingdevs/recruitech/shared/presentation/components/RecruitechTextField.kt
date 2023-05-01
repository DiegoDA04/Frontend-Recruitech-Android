package pe.edu.notcodingdevs.recruitech.shared.presentation.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey20
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecruitechTextField(
    placeHolderText: String,
    leadingIcon: @Composable (() -> Unit)?,
    trailingIcon: @Composable (() -> Unit)?,
    modifier: Modifier = Modifier
) {
   val input = remember {
       mutableStateOf("")
   }

    OutlinedTextField(
        modifier = modifier,
        value = input.value,
        onValueChange = {
            input.value = it
        },
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Grey40,
            containerColor = Color.White,
            placeholderColor = Grey20,
            focusedLeadingIconColor =  Grey40,
            unfocusedLeadingIconColor = Grey20,
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            focusedTrailingIconColor = Grey40,
            unfocusedTrailingIconColor = Grey20
        ),
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        placeholder = {
            Text(
                text = placeHolderText,
                style = MaterialTheme.typography.labelMedium
            )
        },
        singleLine = true
    )
}