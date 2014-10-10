package sirfireys.rana.noidainternationaluniversity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class AboutNIUAct extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();
        String layout_toSet = "";
        String fromAct = "";
        fromAct = intent.getStringExtra("from");
        layout_toSet = intent.getStringExtra("layout");


        if (fromAct.equalsIgnoreCase("aboutSET")) {


            if (layout_toSet.equalsIgnoreCase("Faculty Directory")) {
                setTitle(layout_toSet);
                setContentView(R.layout.why_niu);

            }

            if (layout_toSet.equalsIgnoreCase("SET Departments")) {

                setTitle(layout_toSet);
                setContentView(R.layout.vc_message);
            }
            if (layout_toSet.equalsIgnoreCase("SET Presentation")) {


                setTitle(layout_toSet);
                setContentView(R.layout.download_presentation);

            }

        }


        if (fromAct.equals("")) {
            if (layout_toSet.equalsIgnoreCase("Why NIU")) {
                setTitle(layout_toSet);
                setContentView(R.layout.why_niu);

            }

            if (layout_toSet.equalsIgnoreCase("VC Message")) {

                setTitle(layout_toSet);
                setContentView(R.layout.vc_message);
            }
            if (layout_toSet.equalsIgnoreCase("Our Foundation")) {
                setTitle(layout_toSet);
                setContentView(R.layout.our_foundation);
            }
            if (layout_toSet.equalsIgnoreCase("Grow with NIU")) {
                setTitle(layout_toSet);
                setContentView(R.layout.grow_up_with_niu);
            }


        }
        if (fromAct.equals("academics")) {
            if (layout_toSet.equalsIgnoreCase("Hostel Fee")) {
                setTitle(layout_toSet);
                setContentView(R.layout.hostel_fee);

            }

            if (layout_toSet.equalsIgnoreCase("VC Message")) {

                setTitle(layout_toSet);
                setContentView(R.layout.vc_message);
            }
            if (layout_toSet.equalsIgnoreCase("Our Foundation")) {
                setTitle(layout_toSet);
                setContentView(R.layout.our_foundation);
            }
            if (layout_toSet.equalsIgnoreCase("Grow with NIU")) {
                setTitle(layout_toSet);
                setContentView(R.layout.grow_up_with_niu);
            }


        }


    }


    public void downloadPresentation(View view) {

        Intent inten = new Intent(Intent.ACTION_VIEW, Uri.parse("http://set.niu.edu.in/wp-content/uploads/2014/06/SET-PPT-FINAL.ppt"));
        startActivity(inten);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.about_niu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
