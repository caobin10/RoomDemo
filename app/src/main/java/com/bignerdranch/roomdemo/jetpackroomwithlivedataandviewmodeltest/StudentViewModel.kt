package com.bignerdranch.roomdemo.jetpackroomwithlivedataandviewmodeltest

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.bignerdranch.roomdemo.db.MyDatabase
import com.bignerdranch.roomdemo.db.bean.Student

class StudentViewModel(application: Application) : AndroidViewModel(application) {

    private val myDatabase: MyDatabase?
    val liveDataStudent: LiveData<List<Student?>?>?

    init {
        myDatabase = MyDatabase.getInstance(application)
        liveDataStudent = myDatabase!!.studentDao()!!.getStudentList()
    }

}