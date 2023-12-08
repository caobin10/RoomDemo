package com.bignerdranch.roomdemo.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u001a\u0010\t\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0018\u00010\nH\'J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/bignerdranch/roomdemo/db/dao/StudentDao;", "", "deleteStudent", "", "student", "Lcom/bignerdranch/roomdemo/db/bean/Student;", "getStudentById", "id", "", "getStudentList", "Landroidx/lifecycle/LiveData;", "", "insertStudent", "updateStudent", "app_debug"})
public abstract interface StudentDao {
    
    @androidx.room.Insert()
    public abstract void insertStudent(@org.jetbrains.annotations.Nullable()
    com.bignerdranch.roomdemo.db.bean.Student student);
    
    @androidx.room.Delete()
    public abstract void deleteStudent(@org.jetbrains.annotations.Nullable()
    com.bignerdranch.roomdemo.db.bean.Student student);
    
    @androidx.room.Update()
    public abstract void updateStudent(@org.jetbrains.annotations.Nullable()
    com.bignerdranch.roomdemo.db.bean.Student student);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM student")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.roomdemo.db.bean.Student>> getStudentList();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM student WHERE id = :id")
    public abstract com.bignerdranch.roomdemo.db.bean.Student getStudentById(int id);
}