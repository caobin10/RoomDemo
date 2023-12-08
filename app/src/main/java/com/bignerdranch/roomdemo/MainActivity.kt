package com.bignerdranch.roomdemo

import android.content.DialogInterface
import android.os.AsyncTask
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.roomdemo.adapter.StudentAdapter
import com.bignerdranch.roomdemo.db.MyDatabase
import com.bignerdranch.roomdemo.db.bean.Student
import com.bignerdranch.roomdemo.jetpackroomwithlivedataandviewmodeltest.StudentViewModel
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemLongClickListener
import kotlinx.android.synthetic.main.activity_main.recyclerView

/**
 *
 * @date
 */
class MainActivity : AppCompatActivity(), OnItemLongClickListener {

    //

    private val mStudentAdapter by lazy {
        StudentAdapter().apply {
            setOnItemLongClickListener(this@MainActivity)
        }
    }

    private var myDatabase: MyDatabase? = null
    private var studentList: MutableList<Student>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btnInsertStudent).setOnClickListener {
            openAddStudentDialog()
        }
        studentList = ArrayList()

        val layoutManager = LinearLayoutManager(this@MainActivity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = mStudentAdapter
//        mStudentAdapter.setList(studentList)

        myDatabase = MyDatabase.getInstance(this)
        val studentViewModel: StudentViewModel =
            ViewModelProvider(this)[StudentViewModel::class.java]
        studentViewModel.liveDataStudent!!.observe(this) { students ->
            (studentList as ArrayList<Student?>).clear()
            (studentList as ArrayList<Student?>).addAll(students!!)
//            studentAdapter2!!.notifyDataSetChanged()
            mStudentAdapter.setList(studentList)
            mStudentAdapter.notifyDataSetChanged()
        }
    }

    private fun updateOrDeleteDialog(student: Student?) {
        val options = arrayOf("更新", "删除")
        AlertDialog.Builder(this@MainActivity)
            .setTitle("")
            .setItems(options) { _, which ->
                if (which == 0) {
                    openUpdateStudentDialog(student)
                } else if (which == 1) {
                    if (student != null) {
                        DeleteStudentTask(student).execute()
                    }
                }
            }.show()
    }

    private fun openAddStudentDialog() {
        val customView: View = this.layoutInflater.inflate(R.layout.dialog_layout_student, null)
        val etName = customView.findViewById<EditText>(R.id.etName)
        val etAge = customView.findViewById<EditText>(R.id.etAge)
        val builder = AlertDialog.Builder(this@MainActivity)
        val dialog = builder.create()
        dialog.setTitle("Add Student")
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK") { dialog, which ->
            if (TextUtils.isEmpty(etName.text.toString()) || TextUtils.isEmpty(etAge.text.toString())) {
                Toast.makeText(this@MainActivity, "输入不能为空", Toast.LENGTH_SHORT).show()
            } else {
                InsertStudentTask(etName.text.toString(), etAge.text.toString()).execute()
            }
        }
        dialog.setButton(
            DialogInterface.BUTTON_NEGATIVE,
            "CANCEL"
        ) { dialog, which -> dialog.dismiss() }
        dialog.setView(customView)
        dialog.show()
    }

    private fun openUpdateStudentDialog(student: Student?) {
        if (student == null) {
            return
        }
        val customView: View = this.layoutInflater.inflate(R.layout.dialog_layout_student, null)
        val etName = customView.findViewById<EditText>(R.id.etName)
        val etAge = customView.findViewById<EditText>(R.id.etAge)
        etName.setText(student.name)
        etAge.setText(student.age)
        val builder = AlertDialog.Builder(this@MainActivity)
        val dialog = builder.create()
        dialog.setTitle("Update Student")
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK") { dialog, which ->
            if (TextUtils.isEmpty(etName.text.toString()) || TextUtils.isEmpty(etAge.text.toString())) {
                Toast.makeText(this@MainActivity, "输入不能为空", Toast.LENGTH_SHORT).show()
            } else {
                UpdateStudentTask(
                    student.id,
                    etName.text.toString(),
                    etAge.text.toString()
                ).execute()
            }
        }
        dialog.setButton(
            DialogInterface.BUTTON_NEGATIVE,
            "CANCEL"
        ) { dialog, which -> dialog.dismiss() }
        dialog.setView(customView)
        dialog.show()
    }

    private inner class InsertStudentTask(var name: String, var age: String) :
        AsyncTask<Void?, Void?, Void?>() {
        override fun doInBackground(vararg params: Void?): Void? {
            myDatabase!!.studentDao()!!.insertStudent(Student(name, age))
            return null
        }
    }

    private inner class UpdateStudentTask(var id: Int, var name: String, var age: String) :
        AsyncTask<Void?, Void?, Void?>() {
        override fun doInBackground(vararg params: Void?): Void? {
            myDatabase!!.studentDao()!!.updateStudent(Student(id, name, age))
            return null
        }
    }

    private inner class DeleteStudentTask(var student: Student) : AsyncTask<Void?, Void?, Void?>() {
        override fun doInBackground(vararg params: Void?): Void? {
            myDatabase!!.studentDao()!!.deleteStudent(student)
            return null
        }
    }

    override fun onItemLongClick(
        adapter: BaseQuickAdapter<*, *>,
        view: View,
        position: Int
    ): Boolean {
        updateOrDeleteDialog((studentList as ArrayList<Student?>)[position])
        return true
    }
}