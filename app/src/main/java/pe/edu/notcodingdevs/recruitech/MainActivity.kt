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
import pe.edu.notcodingdevs.recruitech.recruitment.presentation.job_detail.JobDetailScreen
import pe.edu.notcodingdevs.recruitech.recruitment.presentation.jobs.JobsScreen
import pe.edu.notcodingdevs.recruitech.ui.theme.RecruitechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecruitechTheme {

                JobsScreen()
            }
        }
    }
}
