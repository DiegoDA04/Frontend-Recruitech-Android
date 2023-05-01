package pe.edu.notcodingdevs.recruitech.shared.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey20
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey40
import pe.edu.notcodingdevs.recruitech.ui.theme.White30

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecruitechTextField(
    placeHolderText: String,
    input: MutableState<String>,
    leadingIcon: @Composable (() -> Unit)?,
    trailingIcon: @Composable (() -> Unit)?,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        modifier = modifier
            .padding(bottom = 12.dp),
        value = input.value,
        onValueChange = {
            input.value = it
        },
        shape = RoundedCornerShape(8.dp),
        textStyle = MaterialTheme.typography.bodyMedium,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Grey40,
            containerColor = White30,
            placeholderColor = Grey20,
            focusedLeadingIconColor =  Grey40,
            unfocusedLeadingIconColor = Grey20,
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            focusedTrailingIconColor = Grey40,
            unfocusedTrailingIconColor = Grey20,
            cursorColor = Grey40
        ),
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        placeholder = {
            Text(
                text = placeHolderText,
                style = MaterialTheme.typography.bodyMedium
            )
        },
        visualTransformation = visualTransformation,
        singleLine = true
    )
}