package tplife.com.tplife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.support.design.widget.TabLayout;
import java.util.ArrayList;

import tplife.com.tplife.common.PlayerManager;

public class MainActivity extends AppCompatActivity implements PlayerManager.PlayerStateListener{

    private PlayerManager player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
//        android.support.design.widget.TabLayout tabLayout=null;
//
//
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 1").setIcon(R.mipmap.ic_launcher));

        double ipad2 = (double) (20 * (132 / 160) * (9.7 / (Math.sqrt(1024 * 1024 + 768 * 768))));
        System.out.println(ipad2+"---");
//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }
//        //透明状态栏
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
////        //透明导航栏
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);



        change(this.str, this.anInt,this.ch);

        System.out.print("****"+this.str + " and ");
        System.out.print(this.anInt);
        System.out.print(this.ch);

        //initPlayer();

        System.out.print("DDDDDD");

        //test
    }



    String str = new String("good");
    int anInt=3;

    char[] ch = { 'a', 'b', 'c' };



    public void change(String str, int anInt,char chd[]) {

        str.toUpperCase();
        anInt=5;
        chd[0]='f';

    }


    private void test(){


        System.out.println("hahhadddd");



    }



    private void abv() {

    }
    private void abv1() {

    }
    private void abv2() {

    }

    private void ABD(int a) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
