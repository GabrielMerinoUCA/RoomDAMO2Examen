package ni.edu.uca.miproyectofinal.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ni.edu.uca.miproyectofinal.data.model.Vendedor

@Dao
interface DaoVendedor {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addVendedor(vendedor: Vendedor)

    @Query("SELECT * FROM Vendedor ORDER BY idVendedor")
    fun readAllVendedorData(): LiveData<List<Vendedor>>

    @Update
    suspend fun updateVendedor(vendedor: Vendedor)

    @Delete
    suspend fun deleteVendedor(vendedor: Vendedor)
}