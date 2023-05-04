package pe.edu.notcodingdevs.recruitech.feature_login.presentation.login


import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.notcodingdevs.recruitech.R
import pe.edu.notcodingdevs.recruitech.shared.presentation.components.RecruitechButton
import pe.edu.notcodingdevs.recruitech.shared.presentation.components.RecruitechTextField
//import pe.edu.notcodingdevs.recruitech.ui.theme.ButtonColor
import pe.edu.notcodingdevs.recruitech.ui.theme.RecruitechTheme

@Composable
fun Login(viewModel: LoginViewModel, context:Context) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        val email: String by viewModel.email.observeAsState("")
        val password: String by viewModel.password.observeAsState("")
        var login: Boolean by remember { mutableStateOf(true) }
        val authenticator by viewModel.authenticator.observeAsState(initial = "")

        Logo()
        Error(login)
        Form(viewModel, email, password)
        Options()

        RecruitechButton(
            text = "Login",
            onClick = {
                viewModel.validate()
                if (authenticator == "success") {
                    login = true
                    Toast.makeText(context,"Login successfully", Toast.LENGTH_SHORT)
                } else {
                    Toast.makeText(context,"Hello", Toast.LENGTH_SHORT)
                    println("$authenticator")
                    login = false
                }
            },
            modifier = Modifier.fillMaxWidth()
        )

        /*Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(ButtonColor),
            shape = RoundedCornerShape(8.dp),
            onClick = {
                viewModel.validate()
                if (authenticator == "success") {
                    login = true
                    Toast.makeText(context,"Login successfully", Toast.LENGTH_SHORT)
                } else {
                    Toast.makeText(context,"Hello", Toast.LENGTH_SHORT)
                    println("$authenticator")
                    login = false
                }
            }
        ) {
            Text(text = "Login")
        }*/

        Spacer(modifier = Modifier.height(120.dp))

        SingUp()
    }
}

@Composable
fun SingUp() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Don't have an account?",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
        )
        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "Sign up",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF3949AB)
            )
        }
    }
}

@Composable
fun Options() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {})
            Text(text = "Remember me", fontSize = 12.sp, fontWeight = FontWeight.Medium)
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forgot Password", fontSize = 12.sp)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form(viewModel: LoginViewModel, email: String, password: String) {
    var visiblepassword by remember { mutableStateOf(false) }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        leadingIcon = { Icon(Icons.Outlined.Email, null) },
        singleLine = true,
        label = { Text("Email") },
        value = email,
        onValueChange = {
            viewModel.setEmail(it)
        }
    )
    Spacer(modifier = Modifier.height(8.dp))
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        leadingIcon = { Icon(Icons.Outlined.Lock, null) },
        label = { Text("Password") },
        singleLine = true,
        value = password,
        onValueChange = {
            viewModel.setPassword(it)
        },
        visualTransformation = if (visiblepassword) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val image = if (visiblepassword) Icons.Default.Visibility else Icons.Default.VisibilityOff
            val description = if (visiblepassword) "Hide password" else "Show password"

            IconButton(onClick = {visiblepassword = !visiblepassword}){
                Icon(imageVector  = image, description)
            }
        }
    )
}

@Composable
fun Logo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.recruitech_logo),
            contentDescription = "Recruitech Logo",
            modifier = Modifier
                .height(128.dp)
                .width(128.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Sign in to your account",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun Error(login: Boolean) {
    if (!login) {
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Your email or password is invalid. Please try again.",
            fontSize = 16.sp,
            modifier = Modifier
                .background(color = Color(255, 0, 0, 27))
                .padding(8.dp),
            color = Color(108, 93, 93)
        )
    }
    else {
        Spacer(modifier = Modifier.height(27.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    RecruitechTheme {
        //Login(LoginViewModel())
    }
}