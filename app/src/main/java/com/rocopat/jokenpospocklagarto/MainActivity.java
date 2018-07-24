package com.rocopat.jokenpospocklagarto;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img_Player1, img_Player2;
    Random rd_Player1, rd_Player2;
    TextView txt_winner;
    Button btn_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play = (Button) findViewById(R.id.btn_play);
        img_Player1 = (ImageView) findViewById(R.id.img_Player1);
        img_Player2 = (ImageView) findViewById(R.id.img_Player2);
        rd_Player1 = new Random();
        rd_Player2 = new Random();
        txt_winner = (TextView) findViewById(R.id.txt_winner);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_winner.setVisibility(View.INVISIBLE);

                int rdInt = rd_Player1.nextInt(5) + 1;
                String name = "jk" + rdInt;
                int id_Player1 = getResources().getIdentifier(name, "drawable", getPackageName());
                img_Player1.setImageResource(id_Player1);

                rdInt = rd_Player2.nextInt(5) + 1;
                name = "jk" + rdInt;
                int id_Player2 = getResources().getIdentifier(name, "drawable", getPackageName());
                img_Player2.setImageResource(id_Player2);

                /*
                1 - Lagarto - 2131099734
                2 - Papel - 2131099735
                3 - Pedra - 2131099736
                4 - Spock - 2131099737
                5 - Tesoura - 2131099738
                */

                if (id_Player1 == id_Player2){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("Empate!");
                }

                // POSSIBILIDADES P1 VENCER

                if (id_Player1 == 2131099734 && (id_Player2 == 2131099735 || id_Player2 == 2131099737)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("1 w!");
                }

                if (id_Player1 == 2131099735 && (id_Player2 == 2131099736 || id_Player2 == 2131099737)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("1 w!");
                }

                if (id_Player1 == 2131099736 && (id_Player2 == 2131099738 || id_Player2 == 2131099734)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("1 w!");
                }

                if (id_Player1 == 2131099737 && (id_Player2 == 2131099738 || id_Player2 == 2131099736)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("1 w!");
                }

                if (id_Player1 == 2131099738 && (id_Player2 == 2131099735 || id_Player2 == 2131099734)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("1 w!");
                }

                // POSSIBILIDADES P2 VENCER

                if (id_Player2 == 2131099734 && (id_Player1 == 2131099735 || id_Player1 == 2131099737)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("2 w!");
                }

                if (id_Player2 == 2131099735 && (id_Player1 == 2131099736 || id_Player1 == 2131099737)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("2 w!");
                }

                if (id_Player2 == 2131099736 && (id_Player1 == 2131099738 || id_Player1 == 2131099734)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("2 w!");
                }

                if (id_Player2 == 2131099737 && (id_Player1 == 2131099738 || id_Player1 == 2131099736)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("2 w!");
                }

                if (id_Player2 == 2131099738 && (id_Player1 == 2131099735 || id_Player1 == 2131099734)){
                    txt_winner.setVisibility(View.VISIBLE);
                    txt_winner.setText("2 w!");
                }
            }
        });
    }
}
