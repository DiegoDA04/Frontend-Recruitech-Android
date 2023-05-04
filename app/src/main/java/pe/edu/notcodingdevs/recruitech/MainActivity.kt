package pe.edu.notcodingdevs.recruitech

import ChatScreen
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import pe.edu.notcodingdevs.recruitech.messages.presentation.ApplicationViewModel
import pe.edu.notcodingdevs.recruitech.messages.presentation.channels.ChannelsScreen
import pe.edu.notcodingdevs.recruitech.ui.theme.RecruitechTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: ApplicationViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecruitechTheme {
                // A surface container using the 'background' color from the theme
                viewModel.loginUser("jackid", getString(R.string.jwt_token))
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChatScreen()
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
        ChannelsScreen()
    }
}