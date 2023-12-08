package com.bignerdranch.roomdemo.adapter

import com.bignerdranch.roomdemo.R
import com.bignerdranch.roomdemo.db.bean.Student
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import kotlinx.android.synthetic.main.list_item_student.view.*

class StudentAdapter(layoutResId: Int = R.layout.list_item_student) :
    BaseQuickAdapter<Student, BaseViewHolder>(layoutResId) {

    override fun convert(holder: BaseViewHolder, item: Student) {

        holder.itemView.run {
            tvId.text = item.id.toString()
            tvName.text = item.name
            tvAge.text = item.age
        }

    }
}