package com.ebookfrenzy.final

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.ebookfrenzy.contactfinal.Contact
import com.ebookfrenzy.contactfinal.ContactDAO

@Database(entities = [(Contact::class)], version = 1)
abstract class ContactRoomDatabase: RoomDatabase() {

    abstract fun contactDAO(): ContactDAO

    companion object {

        private var INSTANCE: ContactRoomDatabase? = null

        internal fun getDatabase(context: Context): ContactRoomDatabase? {
            if (INSTANCE == null) {
                synchronized(ContactRoomDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE =
                            Room.databaseBuilder<ContactRoomDatabase>(
                                context.applicationContext,
                                ContactRoomDatabase::class.java,
                                "contact_database").build()
                    }
                }
            }
            return INSTANCE
        }
    }




}