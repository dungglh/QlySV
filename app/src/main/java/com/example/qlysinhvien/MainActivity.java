package com.example.qlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.qlysinhvien.data.DBManager;
import com.example.qlysinhvien.model.Student;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtMSSV;
    private EditText edtEmail;
    private EditText edtNsinh;
    private Button btnSave;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMSSV = findViewById(R.id.mssv);
        edtName = findViewById(R.id.name);
        edtEmail = findViewById(R.id.email);
        edtNsinh = findViewById(R.id.nsinh);
        btnSave = findViewById(R.id.btn_save);
        listView = findViewById(R.id.list)

        final DBManager dbManager = new DBManager(this);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = createStudent();
                if (student!=null){
                    dbManager.addStudent(createStudent());
                }
            }
        });

    }

    private Student createStudent(){
        String name = edtName.getText().toString();
        String mssv = edtMSSV.getText().toString();
        String email = edtEmail.getText().toString();
        String nsinh = edtNsinh.getText().toString();

        Student student = new Student(mssv, name,email,nsinh);
        return student;
    }
}