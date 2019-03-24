package e.idea.bvmattendance;


/** Created by Nisarg
 * patelnisarg0711@gmail.com
 * BVM_EC_419
 */

    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

public class department extends AppCompatActivity {
    Button butd_206;
    Button butd_207;
    Button butd_208;
    Button butd_209;
    Button butd_210;
    Button butd_203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        butd_206=(Button)findViewById(R.id.button206);
        butd_206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is_cs=new Intent(department.this, p_a_206.class);
                startActivity(is_cs);
            }
        });

        butd_207=(Button)findViewById(R.id.button207);
        butd_207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is_cs=new Intent(department.this, p_a_207.class);
                startActivity(is_cs);
            }
        });

        butd_208=(Button)findViewById(R.id.button208);
        butd_208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is_cs=new Intent(department.this, p_a_208.class);
                startActivity(is_cs);
            }
        });

        butd_209=(Button)findViewById(R.id.button209);
        butd_209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is_cs=new Intent(department.this, p_a_209.class);
                startActivity(is_cs);
            }
        });

        butd_210=(Button)findViewById(R.id.button210);
        butd_210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is_cs=new Intent(department.this, p_a_210.class);
                startActivity(is_cs);
            }
        });

        butd_203=(Button)findViewById(R.id.button203);
        butd_203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is_cs=new Intent(department.this, p_a_ma203.class);
                startActivity(is_cs);
            }
        });
    }
}
