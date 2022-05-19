package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.namespace.R;

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
class Item extends View{

    public Item(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bk =
    }
}


    }
}