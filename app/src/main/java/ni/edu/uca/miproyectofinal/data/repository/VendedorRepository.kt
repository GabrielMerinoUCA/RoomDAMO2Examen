package ni.edu.uca.miproyectofinal.data.repository

import androidx.lifecycle.LiveData
import ni.edu.uca.miproyectofinal.data.dao.DaoAdmin
import ni.edu.uca.miproyectofinal.data.dao.DaoVendedor
import ni.edu.uca.miproyectofinal.data.model.Admin
import ni.edu.uca.miproyectofinal.data.model.Vendedor

class VendedorRepository (private val daoVendedor: DaoVendedor) {
    val readAllVendedorData: LiveData<List<Vendedor>> = daoVendedor.readAllVendedorData()

    suspend fun addVendedor(vendedor: Vendedor) {
        daoVendedor.addVendedor(vendedor)
    }

    suspend fun updateVendedor(vendedor: Vendedor) {
        daoVendedor.updateVendedor(vendedor)
    }

    suspend fun deleteVendedor(vendedor: Vendedor) {
        daoVendedor.deleteVendedor(vendedor)
    }
}