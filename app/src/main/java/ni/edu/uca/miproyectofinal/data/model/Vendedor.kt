package ni.edu.uca.miproyectofinal.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Vendedor")
data class Vendedor (
    @PrimaryKey(autoGenerate = true) val idVendedor: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "apellido") val apellido: String,
    @ColumnInfo(name = "username") val username: String,
    @ColumnInfo(name = "idTienda") val idTienda: Int,
    @ColumnInfo(name = "pwd") val pwd: String
) : Parcelable