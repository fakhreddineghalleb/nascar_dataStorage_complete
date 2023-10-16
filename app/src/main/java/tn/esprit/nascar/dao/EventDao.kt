package tn.esprit.nascar.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import tn.esprit.nascar.models.Events

@Dao
interface EventDao {

    @Insert
    fun insertEvent(events: Events)
    @Update
    fun updateEvent(events: Events)
    @Delete
    fun deleteEvent(events: Events)

    @Query("SELECT * FROM eventTable")
    fun getAllEvent() : MutableList<Events>
    @Query("SELECT * FROM eventTable WHERE id like :id LIMIT 1")
    fun getFindEventById(id: Int) : Events

}