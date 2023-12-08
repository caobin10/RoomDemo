package com.bignerdranch.roomdemo;

import java.lang.System;

/**
 * @date
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001f !B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J(\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/bignerdranch/roomdemo/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "()V", "mStudentAdapter", "Lcom/bignerdranch/roomdemo/adapter/StudentAdapter;", "getMStudentAdapter", "()Lcom/bignerdranch/roomdemo/adapter/StudentAdapter;", "mStudentAdapter$delegate", "Lkotlin/Lazy;", "myDatabase", "Lcom/bignerdranch/roomdemo/db/MyDatabase;", "studentList", "", "Lcom/bignerdranch/roomdemo/db/bean/Student;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemLongClick", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "openAddStudentDialog", "openUpdateStudentDialog", "student", "updateOrDeleteDialog", "DeleteStudentTask", "InsertStudentTask", "UpdateStudentTask", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.chad.library.adapter.base.listener.OnItemLongClickListener {
    private final kotlin.Lazy mStudentAdapter$delegate = null;
    private com.bignerdranch.roomdemo.db.MyDatabase myDatabase;
    private java.util.List<com.bignerdranch.roomdemo.db.bean.Student> studentList;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    private final com.bignerdranch.roomdemo.adapter.StudentAdapter getMStudentAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateOrDeleteDialog(com.bignerdranch.roomdemo.db.bean.Student student) {
    }
    
    private final void openAddStudentDialog() {
    }
    
    private final void openUpdateStudentDialog(com.bignerdranch.roomdemo.db.bean.Student student) {
    }
    
    @java.lang.Override()
    public boolean onItemLongClick(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.BaseQuickAdapter<?, ?> adapter, @org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\'\u0010\r\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/bignerdranch/roomdemo/MainActivity$InsertStudentTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "name", "", "age", "(Lcom/bignerdranch/roomdemo/MainActivity;Ljava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getName", "setName", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
    final class InsertStudentTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String age;
        
        public InsertStudentTask(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String age) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAge() {
            return null;
        }
        
        public final void setAge(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\'\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0015\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/bignerdranch/roomdemo/MainActivity$UpdateStudentTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "id", "", "name", "", "age", "(Lcom/bignerdranch/roomdemo/MainActivity;ILjava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getName", "setName", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
    final class UpdateStudentTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        private int id;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String age;
        
        public UpdateStudentTask(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String age) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAge() {
            return null;
        }
        
        public final void setAge(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\'\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/bignerdranch/roomdemo/MainActivity$DeleteStudentTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "student", "Lcom/bignerdranch/roomdemo/db/bean/Student;", "(Lcom/bignerdranch/roomdemo/MainActivity;Lcom/bignerdranch/roomdemo/db/bean/Student;)V", "getStudent", "()Lcom/bignerdranch/roomdemo/db/bean/Student;", "setStudent", "(Lcom/bignerdranch/roomdemo/db/bean/Student;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
    final class DeleteStudentTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        @org.jetbrains.annotations.NotNull()
        private com.bignerdranch.roomdemo.db.bean.Student student;
        
        public DeleteStudentTask(@org.jetbrains.annotations.NotNull()
        com.bignerdranch.roomdemo.db.bean.Student student) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.roomdemo.db.bean.Student getStudent() {
            return null;
        }
        
        public final void setStudent(@org.jetbrains.annotations.NotNull()
        com.bignerdranch.roomdemo.db.bean.Student p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
    }
}