package pe.edu.notcodingdevs.recruitech.recruitment.presentation.jobs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import pe.edu.notcodingdevs.recruitech.recruitment.data.model.Job
import pe.edu.notcodingdevs.recruitech.recruitment.presentation.jobs.components.JobExtendedCard
import pe.edu.notcodingdevs.recruitech.recruitment.presentation.jobs.components.SearchJobTextField
import pe.edu.notcodingdevs.recruitech.shared.presentation.components.ScreenTitle


@Composable
fun JobsScreen(
    modifier: Modifier = Modifier
) {
    var inputSearch = remember {
        mutableStateOf("")
    }

    val jobItem: Job = Job(1,"Front End Developer","Dsadasdsa",2000,"Remote","Fulltime","Acme Studios", "Lima")
    val jobItem2: Job = Job(2,"Back End Developer","Dsadasdsa",2000,"Remote","Fulltime","Acme Studios", "Lima")

    var jobList: MutableList<Job> = mutableListOf()

    jobList.add(jobItem)
    jobList.add(jobItem2)


    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ScreenTitle(text = "Jobs")
        Spacer(modifier = Modifier.height(16.dp))
        SearchJobTextField(input = inputSearch, placeholderText = "Search a Job")
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn() {
            items(jobList) {
                job -> JobExtendedCard(job = job, onclick = {})
            }
        }
    }
}