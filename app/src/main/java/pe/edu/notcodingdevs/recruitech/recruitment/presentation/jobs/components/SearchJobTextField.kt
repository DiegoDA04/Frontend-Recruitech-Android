package pe.edu.notcodingdevs.recruitech.recruitment.presentation.jobs.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey20
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey40
import pe.edu.notcodingdevs.recruitech.ui.theme.White30

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchJobTextField(
    input: MutableState<String>,
    placeholderText: String,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = input.value,
        onValueChange = {
            input.value = it
        },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        textStyle = MaterialTheme.typography.labelMedium,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Grey40,
            containerColor = White30,
            placeholderColor = Grey20,
            focusedLeadingIconColor =  Grey40,
            unfocusedLeadingIconColor = Grey20,
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            focusedTrailingIconColor = Grey40,
            unfocusedTrailingIconColor = Grey20
        ),
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "Search Icon")
        },
        placeholder = {
            Text(
                text = placeholderText,
                style = MaterialTheme.typography.labelMedium
            )
        },
        singleLine = true
    )
}