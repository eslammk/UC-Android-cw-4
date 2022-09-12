package com.example.class44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> myList = new ArrayList<>();
       int CurrentStudent = 0 ;
       Context context ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this ;
        TextView nameText = findViewById(R.id.textViewname);
        TextView ageText = findViewById(R.id.textViewage);
        ImageView image = findViewById(R.id.imageView);
        TextView gradeText = findViewById(R.id.textViewGrade);
        Button butt = findViewById(R.id.buttonnext);

        Student firstStudent = new Student ("Eslam" ,100 ,23 , R.drawable.pic11 );
        Student secondStudent = new Student ("Hoor" ,99 ,20 , R.drawable.picc22 );
        Student thirdStudent = new Student ( "Ghalia",98 ,22 , R.drawable.pic33 );

        myList.add(firstStudent);
        myList.add(secondStudent);
        myList.add(thirdStudent);

        nameText.setText(myList.get(CurrentStudent).getStudentName());
        ageText.setText(myList.get(CurrentStudent).getStudentAge() + "");
        gradeText.setText(myList.get(CurrentStudent).getStudentGrade() + "");
        image.setImageResource(myList.get(CurrentStudent).getImage());

        butt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                CurrentStudent++;
                if (CurrentStudent == myList.size()) {

                    Toast.makeText(context, "the end os list", Toast.LENGTH_SHORT).show();
                    CurrentStudent = 0;
                }
                nameText.setText(myList.get(CurrentStudent).getStudentName());
                ageText.setText(myList.get(CurrentStudent).getStudentAge() + "");
                gradeText.setText(myList.get(CurrentStudent).getStudentGrade() + "");
                image.setImageResource(myList.get(CurrentStudent).getImage());

            }
    });
}

}