package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.namespace.R

class Item(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes){

    constructor(context: Context,attrs: AttributeSet?, defStyleAttr: Int):this (context,attrs,defStyleAttr,0)
    constructor(context: Context, attrs: AttributeSet?):this(context,attrs, 0)
    constructor() : this(context, attrs = null) {

    }


    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.book_item, this, true)
    }
}