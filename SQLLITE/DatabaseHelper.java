package com.example.panche.kitchenapp;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Panche on 2/22/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static DatabaseHelper databaseHelper;

    final static String DATABASE_NAME = "KITCHEN_DATABASE";
    final static int DATABASE_VERSION = 1;
    final static String RECIPES_TABLE = "Recipes";
    final static String PRODUCT_TABLE = "Products";

//    columns of RECIPES TABLE
    final static String RECIPES_ID = "ID";
    final static String RECIPES_TEXT = "RECIPES";


//    columns of PRODUCT_TABLE

    final static String PRODUCT_ID = "ID";
    final static String PRODUCT_NAME = "Product_name";
    final static String PRODUCT_QUANTITY = "Quantity";


//    SQL Statement for tables creation

    final static String SQL_CREATE_RECIPES_TABLE = "CREATE TABLE " + RECIPES_TABLE + " ("
                                                    + RECIPES_ID + " INTEGER PRIMARY KEY,"
                                                    + RECIPES_TEXT + " TEXT"
                                                    + ");";
    final static String SQL_CREATE_PRODUCT_TABLE = "CREATE TABLE " + PRODUCT_TABLE + " ("
                                                    + PRODUCT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                                                    + PRODUCT_NAME + " TEXT,"
                                                    + PRODUCT_QUANTITY + " REAL"
                                                    + ");";


    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    public static DatabaseHelper getInstance(Context context){
        if(databaseHelper == null)
            databaseHelper = new DatabaseHelper(context);
        return databaseHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_RECIPES_TABLE);
        db.execSQL(SQL_CREATE_PRODUCT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //TO DO

    }
}
