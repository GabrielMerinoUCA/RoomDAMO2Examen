package ni.edu.uca.miproyectofinal.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Admin")
data class Admin (
    @PrimaryKey(autoGenerate = true) val idAdmin: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "apellido") val apellido: String,
    @ColumnInfo(name = "username") val username: String,
    @ColumnInfo(name = "pwd") val pwd: String
 ) : Parcelable