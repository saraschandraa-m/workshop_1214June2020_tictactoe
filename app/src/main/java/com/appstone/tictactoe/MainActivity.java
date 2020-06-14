package com.appstone.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ImageView mIv11, mIv12, mIv13, mIv21, mIv22, mIv23, mIv31, mIv32, mIv33;
    private TextView mTvPlayer1Status, mTvPlayer2Status, mTvWonStatus;
    private Button mBtnReset;

    private String[] combo1 = new String[]{"11", "12", "13"};
    private String[] combo2 = new String[]{"21", "22", "23"};
    private String[] combo3 = new String[]{"31", "32", "33"};
    private String[] combo4 = new String[]{"11", "22", "33"};
    private String[] combo5 = new String[]{"13", "22", "31"};
    private String[] combo6 = new String[]{"12", "22", "32"};
    private String[] combo7 = new String[]{"11", "21", "31"};
    private String[] combo8 = new String[]{"13", "23", "33"};

    private ArrayList<String> player1Combos = new ArrayList<>();
    private ArrayList<String> player2Combos = new ArrayList<>();
    private ArrayList<WinningCombo> winningCombos = new ArrayList<>();

    private boolean isPlayer1Turn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIv11 = findViewById(R.id.ll_11);
        mIv12 = findViewById(R.id.ll_12);
        mIv13 = findViewById(R.id.ll_13);
        mIv21 = findViewById(R.id.ll_21);
        mIv22 = findViewById(R.id.ll_22);
        mIv23 = findViewById(R.id.ll_23);
        mIv31 = findViewById(R.id.ll_31);
        mIv32 = findViewById(R.id.ll_32);
        mIv33 = findViewById(R.id.ll_33);

        mTvPlayer1Status = findViewById(R.id.tv_player_1);
        mTvPlayer2Status = findViewById(R.id.tv_player_2);
        mTvWonStatus = findViewById(R.id.tv_player_won);

        mBtnReset = findViewById(R.id.btn_reset_game);

        mIv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("11");
                    isPlayer1Turn = false;
                    mIv11.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("11");
                    isPlayer1Turn = true;
                    mIv11.setImageResource(R.drawable.ic_o);
                }
                mIv11.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("12");
                    isPlayer1Turn = false;
                    mIv12.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("12");
                    isPlayer1Turn = true;
                    mIv12.setImageResource(R.drawable.ic_o);
                }
                mIv12.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("13");
                    isPlayer1Turn = false;
                    mIv13.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("13");
                    isPlayer1Turn = true;
                    mIv13.setImageResource(R.drawable.ic_o);
                }
                mIv13.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("21");
                    isPlayer1Turn = false;
                    mIv21.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("21");
                    isPlayer1Turn = true;
                    mIv21.setImageResource(R.drawable.ic_o);
                }
                mIv21.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("22");
                    isPlayer1Turn = false;
                    mIv22.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("22");
                    isPlayer1Turn = true;
                    mIv22.setImageResource(R.drawable.ic_o);
                }
                mIv22.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("23");
                    isPlayer1Turn = false;
                    mIv23.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("23");
                    isPlayer1Turn = true;
                    mIv23.setImageResource(R.drawable.ic_o);
                }
                mIv23.setEnabled(false);
                changePlayerHighlight();
            }
        });


        mIv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("31");
                    isPlayer1Turn = false;
                    mIv31.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("31");
                    isPlayer1Turn = true;
                    mIv31.setImageResource(R.drawable.ic_o);
                }
                mIv31.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("32");
                    isPlayer1Turn = false;
                    mIv32.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("32");
                    isPlayer1Turn = true;
                    mIv32.setImageResource(R.drawable.ic_o);
                }
                mIv32.setEnabled(false);
                changePlayerHighlight();
            }
        });

        mIv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlayer1Turn) {
                    player1Combos.add("33");
                    isPlayer1Turn = false;
                    mIv33.setImageResource(R.drawable.ic_x);
                } else {
                    player2Combos.add("33");
                    isPlayer1Turn = true;
                    mIv33.setImageResource(R.drawable.ic_o);
                }
                mIv33.setEnabled(false);
                changePlayerHighlight();
            }
        });


        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1Combos.clear();
                player2Combos.clear();
                mIv11.setImageResource(0);
                mIv12.setImageResource(0);
                mIv13.setImageResource(0);
                mIv21.setImageResource(0);
                mIv22.setImageResource(0);
                mIv23.setImageResource(0);
                mIv31.setImageResource(0);
                mIv32.setImageResource(0);
                mIv33.setImageResource(0);

                mIv11.setEnabled(true);
                mIv12.setEnabled(true);
                mIv13.setEnabled(true);
                mIv21.setEnabled(true);
                mIv22.setEnabled(true);
                mIv23.setEnabled(true);
                mIv31.setEnabled(true);
                mIv32.setEnabled(true);
                mIv33.setEnabled(true);

                isPlayer1Turn = true;
                changePlayerHighlight();
                mTvWonStatus.setText("");
            }
        });

        WinningCombo winningCombo1 = new WinningCombo();
        winningCombo1.combo = combo1;

        WinningCombo winningCombo2 = new WinningCombo();
        winningCombo2.combo = combo2;

        WinningCombo winningCombo3 = new WinningCombo();
        winningCombo3.combo = combo3;

        WinningCombo winningCombo4 = new WinningCombo();
        winningCombo4.combo = combo4;

        WinningCombo winningCombo5 = new WinningCombo();
        winningCombo5.combo = combo5;

        WinningCombo winningCombo6 = new WinningCombo();
        winningCombo6.combo = combo6;

        WinningCombo winningCombo7 = new WinningCombo();
        winningCombo7.combo = combo7;

        WinningCombo winningCombo8 = new WinningCombo();
        winningCombo8.combo = combo8;

        winningCombos.add(winningCombo1);
        winningCombos.add(winningCombo2);
        winningCombos.add(winningCombo3);
        winningCombos.add(winningCombo4);
        winningCombos.add(winningCombo5);
        winningCombos.add(winningCombo6);
        winningCombos.add(winningCombo7);
        winningCombos.add(winningCombo8);

        changePlayerHighlight();
    }

    private void changePlayerHighlight() {
        if (isPlayer1Turn) {
            mTvPlayer1Status.setEnabled(true);
            mTvPlayer1Status.setAlpha(1.0f);
            mTvPlayer2Status.setEnabled(false);
            mTvPlayer2Status.setAlpha(0.5f);
        } else {
            mTvPlayer1Status.setEnabled(false);
            mTvPlayer1Status.setAlpha(0.5f);
            mTvPlayer2Status.setEnabled(true);
            mTvPlayer2Status.setAlpha(1.0f);
        }


//        for (int i = 0; i < winningCombos.size(); i++) {
//            WinningCombo combo = winningCombos.get(i);
//        }

        for (WinningCombo combo : winningCombos) {
            String[] combinations = combo.combo;
            if (player1Combos.containsAll(Arrays.asList(combinations))) {
                mTvWonStatus.setText("Player 1 has won");
                stopGame();
            } else if (player2Combos.containsAll(Arrays.asList(combinations))) {
                mTvWonStatus.setText("Player 2 has won");
                stopGame();
            }else if(player1Combos.size() + player2Combos.size() == 9){
                mTvWonStatus.setText("Game is drawn");
                stopGame();
            }
        }
    }

    private void stopGame() {
        mIv11.setEnabled(false);
        mIv12.setEnabled(false);
        mIv13.setEnabled(false);
        mIv21.setEnabled(false);
        mIv22.setEnabled(false);
        mIv23.setEnabled(false);
        mIv31.setEnabled(false);
        mIv32.setEnabled(false);
        mIv33.setEnabled(false);
    }


    class WinningCombo {
        public String[] combo;
    }
}
