package com.bignerdranch.roomdemo.jetpackroomwithlivedataandviewmodeltest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/bignerdranch/roomdemo/jetpackroomwithlivedataandviewmodeltest/StudentViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "liveDataStudent", "Landroidx/lifecycle/LiveData;", "", "Lcom/bignerdranch/roomdemo/db/bean/Student;", "getLiveDataStudent", "()Landroidx/lifecycle/LiveData;", "myDatabase", "Lcom/bignerdranch/roomdemo/db/MyDatabase;", "app_debug"})
public final class StudentViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.bignerdranch.roomdemo.db.MyDatabase myDatabase = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.roomdemo.db.bean.Student>> liveDataStudent = null;
    
    public StudentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.roomdemo.db.bean.Student>> getLiveDataStudent() {
        return null;
    }
}