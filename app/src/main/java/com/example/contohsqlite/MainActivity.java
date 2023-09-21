package com.example.contohsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHandler dbhandler = new dbHandler(this);

//        dbhandler.addContact(new Contact("Budi", "080000000000"));
//        dbhandler.addContact(new Contact("Siti", "081111111111"));
//        dbhandler.addContact(new Contact("Tono", "082222222222"));

        Log.d("SQLITE", "Membaca isi Database");
        List<Contact> contacts = dbhandler.getAllContacts();
        for (Contact c: contacts){
            String m = "id: "
        }

    }
}