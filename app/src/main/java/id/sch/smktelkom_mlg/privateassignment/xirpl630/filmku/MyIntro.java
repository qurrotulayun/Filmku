package id.sch.smktelkom_mlg.privateassignment.xirpl630.filmku;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Filmku", "Informasi Film nih",
                R.drawable.icon, Color.parseColor("#fce4e")));
        addSlide(AppIntroFragment.newInstance("Filmku", "Ada film Terbaru",
                R.drawable.icon, Color.parseColor("#e8eaf6")));
        addSlide(AppIntroFragment.newInstance("Filmku", "Banyak Pilihan Film yang Lagi Tayang",
                R.drawable.icon, Color.parseColor("#fff8e1")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        finish();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "next", Toast.LENGTH_SHORT).show();
    }
}
