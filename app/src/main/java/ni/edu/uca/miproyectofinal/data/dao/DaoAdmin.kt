package ni.edu.uca.miproyectofinal.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ni.edu.uca.miproyectofinal.data.model.Admin

@Dao
interface DaoAdmin {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addAdmin(admin: Admin)

    @Query("SELECT * FROM Admin ORDER BY id")
    fun readAllAdminData(): LiveData<List<Admin>>

    @Update
    suspend fun updateAdmin(admin: Admin)

    @Delete
    suspend fun deleteAdmin(admin: Admin)
}