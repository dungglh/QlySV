package com.example.qlysinhvien.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.qlysinhvien.model.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "students_manager";
    private static final String TABLE_NAME = "students";
    private static final String ID = "id";
    private static final String MSSV = "mssv";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String NSINH = "nsinh";
    private static int VERSION = 1;

    private Context context;

    //câu truy vấn tạo bảng
    private String SQLQuery = "CREATE TABLE "+ TABLE_NAME+" ( "+
            ID + " integer primary key, "+
            MSSV + " TEXT, "+
            NAME + " TEXT, "+
            EMAIL + " TEXT, "+
            NSINH + " TEXT )";

    public DBManager(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //khởi tạo DATABASE_NAME, TABLE_NAME
        //nơi khởi tạo table chi dc goi 1 lan duy nhat
        db.execSQL(SQLQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // update version sẽ gọi phương thức nì
    }

    public void addStudent(Student student){
        SQLiteDatabase database = this.getWritableDatabase(); //goi de doc va chinh sua db

        //noi truyen du lieu vao
        ContentValues values=new ContentValues();
        values.put(NAME, student.getmName());
        values.put(MSSV, student.getmMSSV());
        values.put(EMAIL, student.getmEmail());
        values.put(NSINH, student.getmNSinh());

        database.insert(TABLE_NAME, null, values);
        database.close();
    }

    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();

        String selectQuery = "SELECT * FROM "+ TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        db.rawQuery(sel)
    }
}
