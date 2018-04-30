package spm.mvc_mvp_mvvm.roomAndPaging.room.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Address {

    @PrimaryKey(autoGenerate = true)
    public int addressId;

    public String street;
    public String state;
    public String city;

    @ColumnInfo(name = "post_code")
    public int postCode;
}