package spm.mvc_mvp_mvvm.roomAndPaging.room.dbUtility;


import spm.mvc_mvp_mvvm.roomAndPaging.room.database.AppDataBase;
import spm.mvc_mvp_mvvm.roomAndPaging.room.entity.Address;

/**
 * Created by husaynhakeem on 6/12/17.
 */

public class DataGenerator {


    private static DataGenerator instance;
    private static AppDataBase dataBase;


    public static DataGenerator with(AppDataBase appDataBase) {

        if (dataBase == null)
            dataBase = appDataBase;

        if (instance == null)
            instance = new DataGenerator();

        return instance;
    }




    private Address addressInstance(String street, String state, String city, int postCode) {
        Address address = new Address();

        address.street = street;
        address.state = state;
        address.city = city;
        address.postCode = postCode;

        return address;
    }
}