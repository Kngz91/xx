package com.example.myapplication;

import static com.example.myapplication.R.layout.book_item;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    /** Fields*/
    LinearLayout linearLayout;
    Button[] buttons;
    Form form = new Form();
    Item bookItem = new Item();
    ArrayList<Book>bookshelf = form.getBooks();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.Linear);
//        bookItem =(View) findViewById(book_item);
        form.booksAdd();
        int length = form.getSize();
        buttons = new Button[length];
        linearLayout.addView(bookItem);

        for (int i = 0; i < length; i++) {
            buttons[i] = new Button(getApplicationContext());
            buttons[i].setId(i);
            buttons[i].setText(bookshelf.get(i).getName());
            linearLayout.addView(buttons[i]);
        }



    }
}