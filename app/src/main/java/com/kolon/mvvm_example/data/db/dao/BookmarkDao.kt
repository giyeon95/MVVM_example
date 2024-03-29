package com.kolon.mvvm_example.data.db.dao

import androidx.paging.DataSource
import androidx.room.*
import com.kolon.mvvm_example.data.db.entity.Bookmark

@Dao
interface BookmarkDao {

    @Query("SELECT * FROM Bookmark ORDER BY created ASC")
    fun findAll(): DataSource.Factory<Int, Bookmark>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(bookmark: Bookmark)

    @Delete
    fun delete(bookmark: Bookmark)


}