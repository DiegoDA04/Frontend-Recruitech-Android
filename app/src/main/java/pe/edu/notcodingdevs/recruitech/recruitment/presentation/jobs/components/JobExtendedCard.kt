package pe.edu.notcodingdevs.recruitech.recruitment.presentation.jobs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import pe.edu.notcodingdevs.recruitech.R
import pe.edu.notcodingdevs.recruitech.recruitment.data.model.Job
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey20


@Composable
fun JobExtendedCard(
    job: Job,
    onclick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.height(IntrinsicSize.Min).padding(bottom = 8.dp).clickable { onclick },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Company Image",
                modifier = Modifier.height(48.dp)
            )
            Column {
                Text(
                    text = job.companyName,
                    style = MaterialTheme.typography.labelMedium,
                    modifier = modifier.padding(bottom = 2.dp))
                Text(text = job.companyLocation, style = MaterialTheme.typography.labelSmall, color = Grey20)
            }
            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(2.dp),
                color = Color.Black
            )
            Column {
                Text(text = job.occupation, style = MaterialTheme.typography.labelMedium, modifier = modifier.padding(bottom = 2.dp))
                Text(text = job.salary.toString(), style = MaterialTheme.typography.labelSmall, color = Grey20, modifier = modifier.padding(bottom = 2.dp))
                Text(text = "${job.JobTime} - ${job.jobType}", style = MaterialTheme.typography.labelSmall, color = Grey20)
            }
        }
    }
}