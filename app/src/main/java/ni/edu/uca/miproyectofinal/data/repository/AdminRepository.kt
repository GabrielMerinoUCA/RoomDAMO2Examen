package ni.edu.uca.miproyectofinal.data.repository

import androidx.lifecycle.LiveData
import ni.edu.uca.miproyectofinal.data.dao.DaoAdmin
import ni.edu.uca.miproyectofinal.data.model.Admin

class AdminRepository (private val daoAdmin: DaoAdmin) {
    val readAllAdminData: LiveData<List<Admin>> = daoAdmin.readAllAdminData()

    suspend fun addAdmin(admin: Admin) {
        daoAdmin.addAdmin(admin)
    }

    suspend fun updateAdmin(admin: Admin) {
        daoAdmin.updateAdmin(admin)
    }

    suspend fun deleteAdmin(admin: Admin) {
        daoAdmin.deleteAdmin(admin)
    }
}