package pe.edu.notcodingdevs.recruitech.data.Remote

private const val BASE_URL = "https://backend-recruitech-production.up.railway.app/api/v1/digital_profile/develop/{id}"

fun digitalProfilesService(): DigitalProfilesService {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    return retrofit.create(DigitalProfilesService::class.java)
}