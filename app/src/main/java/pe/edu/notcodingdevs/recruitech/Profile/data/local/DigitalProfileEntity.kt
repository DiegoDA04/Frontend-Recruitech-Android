package pe.edu.notcodingdevs.recruitech.Profile.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("DigitalProfile")
class DigitalProfileEntity(
    @PrimaryKey
    val id: String
)