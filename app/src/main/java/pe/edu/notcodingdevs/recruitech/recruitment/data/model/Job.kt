package pe.edu.notcodingdevs.recruitech.recruitment.data.model

data class Job(
    val id: Int,
    val occupation: String,
    val description: String,
    val salary: Int,
    val jobType: String,
    val JobTime: String,
    val companyName: String,
    val companyLocation: String,
)