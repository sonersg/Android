package com.example.recyclerviewkotlin

import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), ExampleAdapter.onItemClickListener{
    private val exampleList = generateDummyList(25)
    private val adapter = ExampleAdapter(exampleList, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): ArrayList<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_android
                1 -> R.drawable.ic_sun
                else -> R.drawable.ic_audio
            }
            val item = ExampleItem(drawable, "item $i", "Line 2")
            list += item
        }
        return list
    }

    fun insertItem(view: android.view.View) {
        val index = Random.nextInt(8)

        val newItem = ExampleItem(R.drawable.ic_android, "New item at position $index","Line2")

        exampleList.add(index, newItem)
        adapter.notifyItemInserted(index)
    }
    fun removeItem(view: android.view.View) {
        val index = Random.nextInt(8)

        exampleList.removeAt(index)
        adapter.notifyItemRemoved(index)
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Item $position clicked", Toast.LENGTH_SHORT).show()
        val clickedItem : ExampleItem = exampleList[position]
        clickedItem.text1 = "clicked"
        adapter.notifyItemChanged(position)
    }
}