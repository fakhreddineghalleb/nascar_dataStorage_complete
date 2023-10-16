package tn.esprit.nascar.utils

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import tn.esprit.nascar.dao.EventDao
import tn.esprit.nascar.models.Events

@Database(entities = [Events::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun eventDao() : EventDao

    companion object{

        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): AppDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(ctx.applicationContext,
                    AppDatabase::class.java,"nascar_db")
                    .allowMainThreadQueries()
                    .build()

            return instance!!
        }

    }
}