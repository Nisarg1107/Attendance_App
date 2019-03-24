package e.idea.bvmattendance;

/** Created by Nisarg
 * patelnisarg0711@gmail.com
 * BVM_EC_419
 */


import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Date;

public class p_a_206 extends AppCompatActivity {

    private static final String TAG = "p_a_206";

    TextView mDisplayDate;
    DatePickerDialog.OnDateSetListener mDateSetListener;


    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editTextID;
    Button buttonSubmit;

    DatabaseReference databaseStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_a_206);
        mDisplayDate=(TextView)findViewById(R.id.tvDate);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal= Calendar.getInstance();
                int Year = cal.get(Calendar.YEAR);
                int Month = cal.get(Calendar.MONTH);
                int Day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog= new DatePickerDialog(
                        p_a_206.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        Year,Month,Day
                );
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();


            }
        });

        mDateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                Log.d(TAG,"OnDateset : mm/dd//yyyy: " +month+"/"+dayOfMonth+"/"+year);
                String date= month+"/"+dayOfMonth+"/"+year;
                mDisplayDate.setText(date);
            }
        };

        databaseStudent= FirebaseDatabase.getInstance().getReference("EC206");

        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        editTextID=(EditText)findViewById(R.id.editTextID);
        buttonSubmit=(Button) findViewById(R.id.buttonsa);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addID();
            }

        });
    }

    public void checkbutton(View v) {
        int radioID = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(radioID);

    }
     private void addID(){
        String ID= editTextID.getText().toString().trim();
        String attendance=radioButton.getText().toString().trim();
        String DATE=mDisplayDate.getText().toString().trim();

        if(!TextUtils.isEmpty(ID)){
           String id=  databaseStudent.push().getKey();

           Attendance attendance1= new Attendance(DATE,id, ID, attendance);

           databaseStudent.child(id).setValue(attendance1);

           Toast.makeText(this,"Data Recorded ", Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(this,"You should enter ID",Toast.LENGTH_LONG).show();
        }

    }



}

