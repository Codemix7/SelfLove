package com.codemix.selflove;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout Q;
    private NavigationView nv;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.Q = (DrawerLayout) this.findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, Q, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        Q.addDrawerListener(toggle);
        toggle.syncState();
        nv = (NavigationView)findViewById(R.id.navigationid);
        nv.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.home) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }

        String str = "https://www.facebook.com/codemix7";
        String str2 = "android.intent.action.VIEW";
        if (menuItem.getItemId() == R.id.facebook) {
            Intent intent = new Intent(str2);
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
        if (menuItem.getItemId() == R.id.rateid) {
            Intent intent2 = new Intent(str2);
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.powerofpositivethink"));
            startActivity(intent2);
        }

        if (menuItem.getItemId() == R.id.moreappsmend) {
            Intent intent4 = new Intent(str2);
            intent4.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Code+Mix"));
            startActivity(intent4);
        }
        if (menuItem.getItemId() == R.id.contact) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("অনুগ্রহপূর্বক রেটিং দিয়ে উৎসাহ প্রদান করুন!");
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setMessage("রেটিং দিন' বাটনে ক্লিক করে আপনার মূল্যবান মতামত ও ৫ স্টার রেটিং দিন। বের হতে চাইলে 'বের হন' বাটনে ক্লিক করুন!")
                    .setPositiveButton("রেটিং দিন", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            String url = "https://play.google.com/store/apps/details?id=com.codemix.powerofpositivethink";
                            Intent up = new Intent(Intent.ACTION_VIEW);
                            up.setData(Uri.parse(url));
                            startActivity(up);
                        }
                    })
                    .setNeutralButton("আরো অ্যাপস", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            String url = "https://play.google.com/store/apps/developer?id=Code+Mix";
                            Intent up = new Intent(Intent.ACTION_VIEW);
                            up.setData(Uri.parse(url));
                            startActivity(up);
                        }
                    })
                    .setNegativeButton(" বের হন", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }


                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
        if (menuItem.getItemId() == R.id.gk) {
            Intent intent6 = new Intent(str2);
            intent6.setData(Uri.parse("https://play.google.com/store/apps/details?id=hreday.sagar.moralstories"));
            startActivity(intent6);
        }
        if (menuItem.getItemId() == R.id.EnglishSikun) {
            Intent intent7 = new Intent(str2);
            intent7.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.idioms_phrase"));
            startActivity(intent7);
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.id_about:
                Intent i = new Intent(MainActivity.this, about.class);
                startActivity(i);

                break;
            case R.id.id_share:

                Intent s = new Intent(Intent.ACTION_SEND);
                s.setAction(Intent.ACTION_SEND);
                s.setType("text/plain");
                s.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.codemix.powerofpositivethink");

                startActivity(s);
                break;
            case R.id.id_update:
                String url = "https://play.google.com/store/apps/details?id=com.codemix.powerofpositivethink";
                Intent up = new Intent(Intent.ACTION_VIEW);
                up.setData(Uri.parse(url));
                startActivity(up);

                break;
        }


        if (toggle.onOptionsItemSelected(item))


            return true;
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("অনুগ্রহপূর্বক রেটিং দিয়ে উৎসাহ প্রদান করুন!");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("রেটিং দিন' বাটনে ক্লিক করে আপনার মূল্যবান মতামত ও ৫ স্টার রেটিং দিন। বের হতে চাইলে 'বের হন' বাটনে ক্লিক করুন!")
                .setPositiveButton("রেটিং দিন", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/details?id=com.codemix.powerofpositivethink";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNeutralButton("আরো অ্যাপস", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/developer?id=Code+Mix";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNegativeButton(" বের হন", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }


                });
        AlertDialog alert = builder.create();
        alert.show();

    }

    public void think1(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void think2(View view) {
        Intent intent = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);
    }
    public void think3(View view) {
        Intent intent = new Intent(MainActivity.this,Main4Activity.class);
        startActivity(intent);
    } public void think4(View view) {
        Intent intent = new Intent(MainActivity.this,Main5Activity.class);
        startActivity(intent);
    }
    public void think5(View view) {
        Intent intent = new Intent(MainActivity.this,Main6Activity.class);
        startActivity(intent);
    }
    public void think6(View view) {
        Intent intent = new Intent(MainActivity.this,Main7Activity.class);
        startActivity(intent);
    }
    public void think7(View view) {
        Intent intent = new Intent(MainActivity.this,Main8Activity.class);
        startActivity(intent);
    }
    public void think8(View view) {
        Intent intent = new Intent(MainActivity.this,Main9Activity.class);
        startActivity(intent);
    }
    public void think9(View view) {
        Intent intent = new Intent(MainActivity.this,Main10Activity.class);
        startActivity(intent);
    }
    public void think10(View view) {
        Intent intent = new Intent(MainActivity.this,Main11Activity.class);
        startActivity(intent);
    }
    public void think11(View view) {
        Intent intent = new Intent(MainActivity.this,Main12Activity.class);
        startActivity(intent);
    }
}
