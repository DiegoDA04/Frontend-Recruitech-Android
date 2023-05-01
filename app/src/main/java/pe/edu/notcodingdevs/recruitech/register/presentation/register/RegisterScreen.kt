package pe.edu.notcodingdevs.recruitech.register.presentation.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import pe.edu.notcodingdevs.recruitech.shared.presentation.components.RecruitechButton
import pe.edu.notcodingdevs.recruitech.shared.presentation.components.RecruitechTextField
import pe.edu.notcodingdevs.recruitech.ui.theme.Blue40
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey40
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey50

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color.White)
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        val emailInput = remember {
            mutableStateOf("")
        }
        val passwordInput = remember {
            mutableStateOf("")
        }
        val passwordVisibility = remember {
            mutableStateOf(false)
        }
        val icon = if (passwordVisibility.value) Icons.Default.Visibility else Icons.Default.VisibilityOff


        // Title
        Text(
            text = "Join Recruitech",
            style = MaterialTheme.typography.headlineMedium,
            color = Grey50,
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        // Description
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            style = MaterialTheme.typography.bodyMedium,
            color = Grey40,
            textAlign = TextAlign.Left,
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 18.dp)
        )

        // Email - Text Field
        RecruitechTextField(
            placeHolderText = "Email",
            input = emailInput,
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = "Email icon")
            },
            trailingIcon = {},
            modifier = modifier.fillMaxWidth()
        )

        // Password - Text Field
        RecruitechTextField(
            placeHolderText = "Password",
            input = passwordInput,
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = "Lock icon")
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        passwordVisibility.value = !passwordVisibility.value
                    }
                ) {
                    Icon(icon, "Visibility icon")
                }
            },
            modifier = modifier.fillMaxWidth(),
            visualTransformation = if(passwordVisibility.value) VisualTransformation.None
            else PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(12.dp))
        // Sign Up - Button
        RecruitechButton(
            text = "Continue",
            onClick = { },
            modifier = modifier.fillMaxWidth().shadow(
                elevation = 12.dp,
                shape = RoundedCornerShape(8.dp),
                spotColor = Blue40
            )
        )
    }
}