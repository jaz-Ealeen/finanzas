package com.example.proyectofinanzasskel;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    private static AppDatabase instance;
    static AppDatabase getDatabase(final Context context){
        if (instance == null){
            synchronized (AppDatabase.class){
                instance = Room.databaseBuilder(context, AppDatabase.class, "DB").allowMainThreadQueries().build();
            }
        }
        return instance;
    }

}
