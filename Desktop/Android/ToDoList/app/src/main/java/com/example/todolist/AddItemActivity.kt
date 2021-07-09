package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class AddItemActivity : AppCompatActivity() {
    private lateinit var itemNameEditText: EditText
    private lateinit var isUrgentCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)
        itemNameEditText = findViewById(R.id.item_name_edit_text)
        isUrgentCheckBox = findViewById(R.id.is_urgent_checkbox)
    }
    public fun saveItemAction(view: View){

    }
    public fun cancelAction(view:View){
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}