package com.noober.floatmenu

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AdapterView
import com.noober.menu.FloatMenu
import android.widget.Toast
import android.view.MotionEvent
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity(), AdapterView.OnItemLongClickListener {
    private val point = Point()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val itemList: MutableList<String> = ArrayList()
        for (i in 0..19) {
            itemList.add("菜单$i")
        }
        val myAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, itemList)
        listView.adapter = myAdapter
        listView.setOnItemLongClickListener(this)
    }

    override fun onItemLongClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long): Boolean {
        val floatMenu = FloatMenu(this@MainActivity)
        floatMenu.items("菜单1", "菜单2", "菜单3")
        floatMenu.show(point)
        floatMenu.setOnItemClickListener { v, position ->
            Toast.makeText(
                this@MainActivity,
                "你好",
                Toast.LENGTH_SHORT
            ).show()
        }
        return true
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_DOWN) {
            point.x = ev.rawX.toInt()
            point.y = ev.rawY.toInt()
        }
        return super.dispatchTouchEvent(ev)
    }
}
