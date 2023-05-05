package pe.edu.notcodingdevs.recruitech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.notcodingdevs.recruitech.Profile.data.model.DigitalProfile
import pe.edu.notcodingdevs.recruitech.Profile.data.screens.DigitalProfiles
import pe.edu.notcodingdevs.recruitech.ui.theme.RecruitechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecruitechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    var digitalProfile = DigitalProfile(
                        id = "123687",
                        firstName = "Juan",
                        lastName = "Cruz",
                        email = " ",
                        phone = "",
                        password = "",
                        role = "Junior Developer",
                        description = "Lorem ipsum dolor sit amet, " +
                                "consectetur adipiscing elit. Integer " +
                                "vulputate molestie turpis fermentum hendrerit. " +
                                "Donec sit amet auctor diam.",
                        image = " ",
                        bannerImage = ""
                    )
                    DigitalProfiles(digitalProfile, Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecruitechTheme {
        Greeting("Android")
    }
}