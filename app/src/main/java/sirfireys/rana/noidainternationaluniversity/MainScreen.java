package sirfireys.rana.noidainternationaluniversity;

import android.app.Dialog;
import android.content.Intent;
//import android.net.Uri;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class MainScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_new);

        ConnectivityCheck check=new ConnectivityCheck();
        if(check.connectionStatus(MainScreen.this)==0){
            Toast.makeText(this,"Internet Connection is not available.Some feature may show un-expected behaviour",Toast.LENGTH_LONG).show();
        }


    }


    public void contactNIU(View vi) {


        Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
        inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/contact.html");
        inten.putExtra("title","Admissions");
        startActivity(inten);


    }

    public void shareApp(View view) {
        String urlShare="Download Noida International University and experience the brand new flat UI,Know about NIU,Fee Structure,Academics,Admission process,Locate NIU in a single click,Download NIU-CSE class notes and much more....https://play.google.com/store/apps/details?id=sirfireys.rana.noidainternationaluniversity ";
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,urlShare );
        sendIntent.setType("text/plain");
        startActivity(sendIntent);

    }
    public void showAboutSET(View view) {


        final Dialog dialog = new Dialog(this);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.popup_lin_lay);


        dialog.setContentView(R.layout.popup_about_niu);

        ListView listV = (ListView) dialog.findViewById(R.id.listview_about_niu);
        dialog.setTitle("About SET");
        final String[] abtNiu = {"Faculty Directory", "SET Departments", "SET Presentation"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(dialog.getContext(), android.R.layout.simple_list_item_1, abtNiu);

        listV.setAdapter(adapter);
        dialog.show();


        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String str = abtNiu[position];
                dialog.dismiss();

                String layout_toSet = str;

                if (layout_toSet.equalsIgnoreCase("Faculty Directory")) {
//                    setTitle(layout_toSet);
//                    setContentView(R.layout.why_niu);
//                    Intent inten = new Intent(Intent.ACTION_VIEW, Uri.parse("http://set.niu.edu.in/?page_id=57"));
//                    startActivity(inten);


                    Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
                    inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/Fac_dir.html");
                    inten.putExtra("title",layout_toSet);
                    startActivity(inten);


                }

                if (layout_toSet.equalsIgnoreCase("SET Departments")) {

//                    setTitle(layout_toSet);
//                    setContentView(R.layout.vc_message);
//                    Intent inten = new Intent(Intent.ACTION_VIEW, Uri.parse("http://set.niu.edu.in/?page_id=73"));
//                    startActivity(inten);

                    Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
                    inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/set_dep.html");
                    inten.putExtra("title",layout_toSet);
                    startActivity(inten);


                }
                if (layout_toSet.equalsIgnoreCase("SET Presentation")) {
//                    setTitle(layout_toSet);
//                    setContentView(R.layout.our_foundation);


                    Intent in = new Intent(MainScreen.this, AboutNIUAct.class);
                    in.putExtra("layout", layout_toSet);
                    in.putExtra("from", "aboutSET");
                    startActivity(in);


//                    Intent inten=new Intent(Intent.ACTION_VIEW, Uri.parse("http://set.niu.edu.in/?page_id=73"));
//                    startActivity(inten);

                }


//                Intent in = new Intent(MainScreen.this, AboutNIUAct.class);
//                in.putExtra("layout", str);
//                in.putExtra("from","aboutSET");
//                startActivity(in);

            }
        });

    }

    public void showAboutOptions(View v) {

        final Dialog dialog = new Dialog(this);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.popup_lin_lay);


        dialog.setContentView(R.layout.popup_about_niu);

        ListView listV = (ListView) dialog.findViewById(R.id.listview_about_niu);
        dialog.setTitle("About NIU");


        final String[] abtNiu = {"Why NIU", "VC Message", "Our Foundation", "Grow with NIU"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(dialog.getContext(), android.R.layout.simple_list_item_1, abtNiu);

        listV.setAdapter(adapter);
        dialog.show();
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String str = abtNiu[position];
                dialog.dismiss();
                Intent in = new Intent(MainScreen.this, AboutNIUAct.class);
                in.putExtra("layout", str);
                in.putExtra("from", "");

                startActivity(in);

            }
        });
    }

    public void cseDownloads(View view) {
        Intent intent = new Intent(MainScreen.this, ClassList.class);
        startActivity(intent);
    }

    public void showAcademics(View v) {

        final Dialog dialog = new Dialog(this);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.popup_lin_lay);


        dialog.setContentView(R.layout.popup_about_niu);

        ListView listV = (ListView) dialog.findViewById(R.id.listview_about_niu);
        dialog.setTitle("Academics");


        final String[] abtNiu = {"Hostel Fee", "Courses & Fees", "Research & Publications"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(dialog.getContext(), android.R.layout.simple_list_item_1, abtNiu);

        listV.setAdapter(adapter);
        dialog.show();
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String str = abtNiu[position];
                dialog.dismiss();

                String layout_toSet = str;

                if (layout_toSet.equalsIgnoreCase("Hostel Fee")) {
//                    setTitle(layout_toSet);
//                    setContentView(R.layout.why_niu);
//                    Intent inten=new Intent(Intent.ACTION_VIEW, Uri.parse("http://set.niu.edu.in/?page_id=57"));
//                    startActivity(inten);


                    Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
                    inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/hostel_fee.html");
                    inten.putExtra("title",layout_toSet);
                    startActivity(inten);


                }

                if (layout_toSet.equalsIgnoreCase("Courses & Fees")) {

                    Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
                    inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/course_fee.html");
                    inten.putExtra("title",layout_toSet);
                    startActivity(inten);

                }
                if (layout_toSet.equalsIgnoreCase("Research & Publications")) {
//                    setTitle(layout_toSet);
//                    setContentView(R.layout.our_foundation);
//                    http://set.niu.edu.in/?page_id=90


                    Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
                    inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/res_pub.html");
                    inten.putExtra("title",layout_toSet);
                    startActivity(inten);

                }


//
//                Intent in = new Intent(MainScreen.this, AboutNIUAct.class);
//                in.putExtra("layout", str);
//                in.putExtra("from","");
//
//                startActivity(in);

            }
        });
    }

    public void aboutUs(View vi) {
        // TODO Auto-generated method stub
        Intent intent = new Intent(MainScreen.this, AboutUsActivity.class);
        intent.putExtra("START", "ABOUT_US_START");
        startActivity(intent);

    }

    public void showAdmission(View v) {
//        http://set.niu.edu.in/?page_id=11


        Intent inten = new Intent(MainScreen.this,WebviewActivity.class);
        inten.putExtra("url","http://www.sandeeprana011.hostfree.us/web_pages/admissions.html");
        inten.putExtra("title","Admissions");
        startActivity(inten);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_map) {
//            Toast.makeText(MainScreen.this,"From Developers: Sorry this feature is currently not available .\"Shortest Path to NIU\" feature is coming up in the next update.",Toast.LENGTH_LONG).show();
//            27.890879,78.079491
            Intent inteb=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=28.372125,77.540731(Noida International University)"));
            startActivity(inteb);


            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main_screen,
//                    container, false);
            return null;
        }
    }

}