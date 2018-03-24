package com.example.luca.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class StartActivity extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

//    /**
//     * Some older devices needs a small delay between UI widget updates
//     * and a change of the status and navigation bar.
//     */
//    private static final int UI_ANIMATION_DELAY = 300;
//    private final Handler mHideHandler = new Handler();
//    private View mContentView;
//    private final Runnable mHidePart2Runnable = new Runnable() {
//        @SuppressLint("InlinedApi")
//        @Override
//        public void run() {
//            // Delayed removal of status and navigation bar
//
//            // Note that some of these constants are new as of API 16 (Jelly Bean)
//            // and API 19 (KitKat). It is safe to use them, as they are inlined
//            // at compile-time and do nothing on earlier devices.
//            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
//                    | View.SYSTEM_UI_FLAG_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
//                    //| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    //| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
//        }
//    };
//    private View mControlsView;
//    private final Runnable mShowPart2Runnable = new Runnable() {
//        @Override
//        public void run() {
//            // Delayed display of UI elements
//            ActionBar actionBar = getSupportActionBar();
//            if (actionBar != null) {
//                actionBar.show();
//            }
//            mControlsView.setVisibility(View.VISIBLE);
//        }
//    };
//    private boolean mVisible;
//    private final Runnable mHideRunnable = new Runnable() {
//        @Override
//        public void run() {
//            hide();
//        }
//    };
//    /**
//     * Touch listener to use for in-layout UI controls to delay hiding the
//     * system UI. This is to prevent the jarring behavior of controls going away
//     * while interacting with activity UI.
//     */
//    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
//        @Override
//        public boolean onTouch(View view, MotionEvent motionEvent) {
//            if (AUTO_HIDE) {
//                delayedHide(AUTO_HIDE_DELAY_MILLIS);
//            }
//            return false;
//        }
//    };

    private Button bttAvanti_IN;

    private Button bttAvanti_NP;
    private Button bttIndietro_NP;

    private Button bttAvanti_NB;
    private Button bttIndietro_NB;

    private Button bttAvanti_RP;
    private Button bttIndietro_RP;

    private Button bttAvanti_CS;
    private Button bttIndietro_CS;

    private Button bttAvanti_CR;
    private Button bttIndietro_CR;

    private Button bttAvanti_RC;
    private Button bttIndietro_RC;

    private EditText txtNumeroPartecipanti;
    private EditText txtNumeroBambini;
    private EditText txtCostoRicevimento;

    private RadioButton rbAmico;
    private RadioButton rbCugino;
    private RadioButton rbFratello;
    private RadioButton rbTestimone;
    private RadioButton rbGenitore;

    private RadioButton rbTirchio;
    private RadioButton rbNormale;
    private RadioButton rbBellaFigura;
    private RadioButton rbSpaccone;
    private RadioButton rbGradasso;

    private TextView txtRegalo;

    private FrameLayout flInfo;
    private FrameLayout flNumeroPartecipanti;
    private FrameLayout flNumeroBambini;
    private FrameLayout flRelazioneParentela;
    private FrameLayout flCoefficienteSpacconaggine;
    private FrameLayout flCostoRicevimento;
    private FrameLayout flRegalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

//        mVisible = true;
//        mControlsView = findViewById(R.id.fullscreen_content_controls);
//        mContentView = findViewById(R.id.fullscreen_content);


        // Set up the user interaction to manually show or hide the system UI.
        //mContentView.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        toggle();
        //    }
        //});

        bttAvanti_IN=(Button)findViewById(R.id.bttAvanti_IN);

        bttAvanti_NP=(Button)findViewById(R.id.bttAvanti_NP);
        bttIndietro_NP=(Button)findViewById(R.id.bttIndietro_NP);

        bttAvanti_NB=(Button)findViewById(R.id.bttAvanti_NB);
        bttIndietro_NB=(Button)findViewById(R.id.bttIndietro_NB);

        bttAvanti_RP=(Button)findViewById(R.id.bttAvanti_RP);
        bttIndietro_RP=(Button)findViewById(R.id.bttIndietro_RP);

        bttAvanti_CS=(Button)findViewById(R.id.bttAvanti_CS);
        bttIndietro_CS=(Button)findViewById(R.id.bttIndietro_CS);

        bttAvanti_CR=(Button)findViewById(R.id.bttAvanti_CR);
        bttIndietro_CR=(Button)findViewById(R.id.bttIndietro_CR);

        bttAvanti_RC=(Button)findViewById(R.id.bttAvanti_RC);
        bttIndietro_RC=(Button)findViewById(R.id.bttIndietro_RC);

        txtCostoRicevimento=(EditText)findViewById(R.id.txtCostoRicevimento);
        txtNumeroPartecipanti=(EditText)findViewById(R.id.txtNumeroPartecipanti);
        txtNumeroBambini=(EditText)findViewById(R.id.txtNumeroBambini);

        rbAmico=(RadioButton) findViewById(R.id.rbAmico);
        rbCugino=(RadioButton) findViewById(R.id.rbCugino);
        rbFratello=(RadioButton) findViewById(R.id.rbFratello);
        rbTestimone=(RadioButton) findViewById(R.id.rbTestimone);
        rbGenitore=(RadioButton) findViewById(R.id.rbGenitore);

        rbTirchio=(RadioButton) findViewById(R.id.rbTirchio);
        rbNormale=(RadioButton) findViewById(R.id.rbNormale);
        rbBellaFigura=(RadioButton) findViewById(R.id.rbBellaFigura);
        rbSpaccone=(RadioButton) findViewById(R.id.rbSpaccone);
        rbGradasso=(RadioButton) findViewById(R.id.rbGradasso);

        txtRegalo=(TextView)findViewById(R.id.txtRegalo);

        flInfo=(FrameLayout)findViewById(R.id.flInfo);
        flCostoRicevimento=(FrameLayout)findViewById(R.id.flCostoRicevimento);
        flNumeroPartecipanti=(FrameLayout)findViewById(R.id.flNumeroPartecipanti);
        flNumeroBambini=(FrameLayout)findViewById(R.id.flNumeroBambini);
        flRelazioneParentela=(FrameLayout)findViewById(R.id.flRelazioneParentela);
        flCoefficienteSpacconaggine=(FrameLayout)findViewById(R.id.flCoefficienteSpacconaggine);
        flRegalo=(FrameLayout)findViewById(R.id.flRegalo);

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        //findViewById(R.id.bttAvanti_CP).setOnTouchListener(mDelayHideTouchListener);

        flInfo.setVisibility(View.VISIBLE);
        flCostoRicevimento.setVisibility(View.INVISIBLE);
        flNumeroPartecipanti.setVisibility(View.INVISIBLE);
        flNumeroBambini.setVisibility(View.INVISIBLE);
        flRelazioneParentela.setVisibility(View.INVISIBLE);
        flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);
        flRegalo.setVisibility(View.INVISIBLE);

        //Reset valori.
        resetVals();

        //Setta gli eventi.
        setEvents();
    }

//    @Override
//    protected void onPostCreate(Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//
//        // Trigger the initial hide() shortly after the activity has been
//        // created, to briefly hint to the user that UI controls
//        // are available.
//        delayedHide(100);
//    }

//    private void toggle() {
//        if (mVisible) {
//            hide();
//        } else {
//            show();
//        }
//    }
//
//    private void hide() {
//        // Hide UI first
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.hide();
//        }
//        //mControlsView.setVisibility(View.GONE);
//        mVisible = false;
//
//        // Schedule a runnable to remove the status and navigation bar after a delay
//        mHideHandler.removeCallbacks(mShowPart2Runnable);
//        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
//    }
//
//    @SuppressLint("InlinedApi")
//    private void show() {
//        // Show the system bar
//        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
//        mVisible = true;
//
//        // Schedule a runnable to display UI elements after a delay
//        mHideHandler.removeCallbacks(mHidePart2Runnable);
//        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
//    }

//    /**
//     * Schedules a call to hide() in [delay] milliseconds, canceling any
//     * previously scheduled calls.
//     */
//    private void delayedHide(int delayMillis) {
//        mHideHandler.removeCallbacks(mHideRunnable);
//        mHideHandler.postDelayed(mHideRunnable, delayMillis);
//    }

    private void setEvents()
    {
        //Info.
        bttAvanti_IN.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flInfo.setVisibility(View.INVISIBLE);
                flNumeroPartecipanti.setVisibility(View.VISIBLE);
            }
        });

        //Numero partecipanti.
        bttAvanti_NP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flNumeroPartecipanti.setVisibility(View.INVISIBLE);
                flNumeroBambini.setVisibility(View.VISIBLE);
            }
        });
        bttIndietro_NP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flNumeroPartecipanti.setVisibility(View.INVISIBLE);
                flInfo.setVisibility(View.VISIBLE);
            }
        });

        //Numero bambini.
        bttAvanti_NB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flNumeroBambini.setVisibility(View.INVISIBLE);
                flRelazioneParentela.setVisibility(View.VISIBLE);
            }
        });
        bttIndietro_NB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flNumeroBambini.setVisibility(View.INVISIBLE);
                flNumeroPartecipanti.setVisibility(View.VISIBLE);
            }
        });

        //Relazione parentela.
        bttAvanti_RP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flRelazioneParentela.setVisibility(View.INVISIBLE);
                flCoefficienteSpacconaggine.setVisibility(View.VISIBLE);
            }
        });
        bttIndietro_RP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flRelazioneParentela.setVisibility(View.INVISIBLE);
                flNumeroBambini.setVisibility(View.VISIBLE);
            }
        });

        //Coefficiente spacconaggine.
        bttAvanti_CS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);
                flCostoRicevimento.setVisibility(View.VISIBLE);
            }
        });
        bttIndietro_CS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);
                flRelazioneParentela.setVisibility(View.VISIBLE);
            }
        });

        //Costo cerimonia.
        bttAvanti_CR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                //Calcolo e settaggio valore.
                txtRegalo.setText(calcoloRegalo());

                flCostoRicevimento.setVisibility(View.INVISIBLE);
                flRegalo.setVisibility(View.VISIBLE);
            }
        });
        bttIndietro_CR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flCostoRicevimento.setVisibility(View.INVISIBLE);
                flCoefficienteSpacconaggine.setVisibility(View.VISIBLE);
            }
        });

        //Regalo.
        bttAvanti_RC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                //Reset valori.
                resetVals();

                flRegalo.setVisibility(View.INVISIBLE);
                flNumeroPartecipanti.setVisibility(View.VISIBLE);
            }
        });
        bttIndietro_RC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flRegalo.setVisibility(View.INVISIBLE);
                flCostoRicevimento.setVisibility(View.VISIBLE);
            }
        });
    }

    private void resetVals()
    {
        //Reset valori.
        txtCostoRicevimento.setText("90");
        txtNumeroPartecipanti.setText("1");
        txtNumeroBambini.setText("0");
        rbAmico.setChecked(true);
        rbNormale.setChecked(true);
    }

    private String calcoloRegalo()
    {
        int numeroBambini,numeroInvitati;
        double costoPranzo,coefficienteParentela,coefficienteSpacconaggine,regalo;
        DecimalFormat dec = new DecimalFormat("###,###,###,###,###,###.00 €");

        flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);

        //Esegue il calcolo.
        costoPranzo=Integer.parseInt(txtCostoRicevimento.getText().toString());

        numeroInvitati=Integer.parseInt(txtNumeroPartecipanti.getText().toString());

        numeroBambini=Integer.parseInt(txtNumeroBambini.getText().toString());

        coefficienteParentela=1;
        if(rbCugino.isChecked())
            coefficienteParentela=1.2;
        else if(rbFratello.isChecked())
            coefficienteParentela=1.5;
        else if(rbTestimone.isChecked())
            coefficienteParentela=1.8;
        else if(rbGenitore.isChecked())
            coefficienteParentela=2;

        coefficienteSpacconaggine=0.8;
        if(rbNormale.isChecked())
            coefficienteSpacconaggine=1;
        else if(rbBellaFigura.isChecked())
            coefficienteSpacconaggine=1.2;
        else if(rbSpaccone.isChecked())
            coefficienteSpacconaggine=1.3;
        else if(rbGradasso.isChecked())
            coefficienteSpacconaggine=1.5;

        regalo=((numeroBambini/2+numeroInvitati)*costoPranzo+costoPranzo*30/100)*coefficienteParentela*coefficienteSpacconaggine;

        return(dec.format(regalo));
    }
}
