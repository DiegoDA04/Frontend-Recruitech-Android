package pe.edu.notcodingdevs.recruitech.recruitment.presentation.job_detail

import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.notcodingdevs.recruitech.R
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey20

@Composable
fun JobDetailScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(id = R.drawable.ic_launcher_background), contentDescription = "A")
        Text(
            text = "Front End Developer",
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier.padding(bottom = 12.dp)
        )
        Text(
            text = "Acme Studios",
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier.padding(bottom = 12.dp)
        )
        /*
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "4 days ago", style = MaterialTheme.typography.bodyMedium)
            Text(text = "100 applicants", style = MaterialTheme.typography.bodyMedium)
        }
        */
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Location", color = Grey20, style = MaterialTheme.typography.labelSmall, modifier = modifier.padding(8.dp))
                Text(text = "Lima, Perú", style = MaterialTheme.typography.labelSmall)
            }
            Divider(modifier = Modifier
                .fillMaxHeight()
                .width(1.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Job Type", color = Grey20, style = MaterialTheme.typography.labelSmall, modifier = modifier.padding(8.dp))
                Text(text = "Remote", style = MaterialTheme.typography.labelSmall)
            }
            Divider(modifier = Modifier
                .fillMaxHeight()
                .width(1.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Salaries", color = Grey20, style = MaterialTheme.typography.labelSmall, modifier = modifier.padding(8.dp))
                Text(text = "$60-90k", style = MaterialTheme.typography.labelSmall)
            }

        }
        
    }
}