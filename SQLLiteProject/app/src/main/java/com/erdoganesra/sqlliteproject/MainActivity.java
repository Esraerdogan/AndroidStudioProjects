package com.erdoganesra.sqlliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            //sql kodu //SQLLite'da metinlere varchar denir.//eklemek için insert into kullanılır.
            //cursor imleç görevi görür. //* -> her şey demek.
            SQLiteDatabase database = this.openOrCreateDatabase("Musicians", MODE_PRIVATE, null);
            //integer primary key otamatik id eklemek için kullanılır.
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians( id INTEGER PRIMARY KEY,name VARCHAR, age INT)");

            //database.execSQL("INSERT INTO musicians (name, age) VALUES('James', 50)");
            //database.execSQL("INSERT INTO musicians (name, age) VALUES('Lars', 60)");
            //database.execSQL("INSERT INTO musicians (name, age) VALUES('Kirk', 55)");

            //update güncellemek, set de ayarlamak için kullanılır.
            //database.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Lars'");
            //database.execSQL("UPDATE musicians SET name = 'Kirk Hammett' WHERE id = 3");

            //delete adı üzerinde silmek için.
            database.execSQL("DELETE FROM musicians WHERE id = 2");

            //where filtrelemek için kullanılır.
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name = 'James'", null);
            //%s -> s ile bitenleri getirmek için. K% -> k ile başlayanlar için.
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians  WHERE name LIKE '%s'", null);

            Cursor cursor = database.rawQuery("SELECT * FROM musicians ", null);

            int nameIx = cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");
            int idIx = cursor.getColumnIndex("id");

            while (cursor.moveToNext()){
                System.out.println("Name: " +cursor.getString(nameIx));
                System.out.println("Age: " +cursor.getInt(ageIx));
                System.out.println("Id: " +cursor.getInt(idIx));
            }
            cursor.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}