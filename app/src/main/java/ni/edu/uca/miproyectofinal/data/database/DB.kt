package ni.edu.uca.miproyectofinal.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ni.edu.uca.miproyectofinal.data.dao.DaoAdmin
import ni.edu.uca.miproyectofinal.data.dao.DaoVendedor
import ni.edu.uca.miproyectofinal.data.model.Admin
import ni.edu.uca.miproyectofinal.data.model.Vendedor

@Database(entities = [Admin::class, Vendedor::class], version = 1, exportSchema = false)
abstract class DB: RoomDatabase() {
    abstract fun daoVendedor(): DaoVendedor
    abstract fun daoAdmin(): DaoAdmin

    companion object{
        @Volatile
        private var INSTANCE: DB? = null

        fun getDatabase(context: Context): DB{
            synchronized(this){
                val tempInstance = INSTANCE
                if(tempInstance != null){
                    return tempInstance
                }
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DB::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}