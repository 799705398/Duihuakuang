package com.example.dage.duihuakuang;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class duihuakuang extends AppCompatActivity {
    LayoutInflater inflater;
    String str1="";
    String str2="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duihuakuang);
        Button bt1= (Button) this.findViewById(R.id.button);
        bt1.setOnClickListener(onClick);
        Button bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(duihuakuang.this);
                inflater = getLayoutInflater();
                view = inflater.inflate(R.layout.login_dialo4g,null);
                final EditText editText1 =(EditText)view.findViewById(R.id.editTextUserId);
                final EditText editText2 =(EditText)view.findViewById(R.id.editTextPwd);
                Button bt3 = (Button) findViewById(R.id.button2);
                builder.setView(view)
                        .setTitle("Login");
                builder.setNegativeButton("Login", new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialog, int which) {
                        if(editText2.getText().toString().equals("123")&&editText1.getText().toString().equals("abc"))
                        {
                            Toast.makeText(duihuakuang.this, "登录成功", Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(duihuakuang.this, "登陆失败", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                builder.show();
            }
        });
    }
    private View.OnClickListener onClick=new View.OnClickListener(){
        public void onClick(View v)
        {
            new AlertDialog.Builder(duihuakuang.this)
                    .setTitle("提示")
                    .setMessage("请输入用户名以及密码")
                    .setPositiveButton("确定",null)
                    .show();
        }

    };
}