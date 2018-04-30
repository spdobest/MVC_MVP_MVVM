package spm.mvc_mvp_mvvm.roomAndPaging.room.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import spm.mvc_mvp_mvvm.roomAndPaging.room.dao.MyProduct;


/**
 * Created by husaynhakeem on 6/12/17.
 */

@Database(entities = { MyProduct.class }, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase instance;


    public abstract MyProduct addressDao();


    public static AppDataBase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDataBase.class,
                    "cat-owners-db")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}