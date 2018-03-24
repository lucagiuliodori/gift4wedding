package com.example.luca.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;
import static java.lang.Math.exp;

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

    private Button bttSalvaAvanzate;

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
    private FrameLayout flSettings;
    private FrameLayout flLastFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

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

        bttSalvaAvanzate=(Button)findViewById(R.id.bttSalvaAvanzate);

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
        flSettings=(FrameLayout)findViewById(R.id.flSettings);

        flInfo.setVisibility(View.VISIBLE);
        flCostoRicevimento.setVisibility(View.INVISIBLE);
        flNumeroPartecipanti.setVisibility(View.INVISIBLE);
        flNumeroBambini.setVisibility(View.INVISIBLE);
        flRelazioneParentela.setVisibility(View.INVISIBLE);
        flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);
        flRegalo.setVisibility(View.INVISIBLE);
        flSettings.setVisibility(View.INVISIBLE);

        flLastFrameLayout=flInfo;

        //Reset valori.
        resetVals();

        //Setta gli eventi.
        setEvents();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.options_menu,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        int id=item.getItemId();
//        switch(id)
//        {
//            case R.id.advanced:
//                allFrameInvisible();
//                flSettings.setVisibility(View.VISIBLE);
//                break;
//        }
//        return false;
//    }

    private void allFrameInvisible()
    {
        flInfo.setVisibility(View.INVISIBLE);
        flCostoRicevimento.setVisibility(View.INVISIBLE);
        flNumeroPartecipanti.setVisibility(View.INVISIBLE);
        flNumeroBambini.setVisibility(View.INVISIBLE);
        flRelazioneParentela.setVisibility(View.INVISIBLE);
        flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);
        flRegalo.setVisibility(View.INVISIBLE);
        flSettings.setVisibility(View.INVISIBLE);
    }

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
                flLastFrameLayout=flNumeroPartecipanti;
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
                flLastFrameLayout=flNumeroBambini;
            }
        });
        bttIndietro_NP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flNumeroPartecipanti.setVisibility(View.INVISIBLE);
                flInfo.setVisibility(View.VISIBLE);
                flLastFrameLayout=flInfo;
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
                flLastFrameLayout=flRelazioneParentela;
            }
        });
        bttIndietro_NB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flNumeroBambini.setVisibility(View.INVISIBLE);
                flNumeroPartecipanti.setVisibility(View.VISIBLE);
                flLastFrameLayout=flNumeroPartecipanti;
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
                flLastFrameLayout=flCoefficienteSpacconaggine;
            }
        });
        bttIndietro_RP.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flRelazioneParentela.setVisibility(View.INVISIBLE);
                flNumeroBambini.setVisibility(View.VISIBLE);
                flLastFrameLayout=flNumeroBambini;
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
                flLastFrameLayout=flCostoRicevimento;
            }
        });
        bttIndietro_CS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);
                flRelazioneParentela.setVisibility(View.VISIBLE);
                flLastFrameLayout=flRelazioneParentela;
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
                flLastFrameLayout=flRegalo;
            }
        });
        bttIndietro_CR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flCostoRicevimento.setVisibility(View.INVISIBLE);
                flCoefficienteSpacconaggine.setVisibility(View.VISIBLE);
                flLastFrameLayout=flCoefficienteSpacconaggine;
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
                flLastFrameLayout=flNumeroPartecipanti;
            }
        });
        bttIndietro_RC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flRegalo.setVisibility(View.INVISIBLE);
                flCostoRicevimento.setVisibility(View.VISIBLE);
                flLastFrameLayout=flCostoRicevimento;
            }
        });

        //Salva avanzate.
        bttSalvaAvanzate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flSettings.setVisibility(View.INVISIBLE);
                flLastFrameLayout.setVisibility(View.VISIBLE);

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
        DecimalFormat dec = new DecimalFormat("###,###,###,###,###,##0.00 €");

        flCoefficienteSpacconaggine.setVisibility(View.INVISIBLE);

        //Esegue il calcolo.

        if(txtCostoRicevimento.getText().toString().isEmpty())
            costoPranzo=0;
        else
            costoPranzo=Integer.parseInt(txtCostoRicevimento.getText().toString());

        if(txtNumeroPartecipanti.getText().toString().isEmpty())
            numeroInvitati=0;
        else
            numeroInvitati=Integer.parseInt(txtNumeroPartecipanti.getText().toString());

        if(txtNumeroBambini.getText().toString().isEmpty())
            numeroBambini=0;
        else
            numeroBambini=Integer.parseInt(txtNumeroBambini.getText().toString());

        coefficienteParentela=0.3;
        if(rbCugino.isChecked())
            coefficienteParentela=0.4;
        else if(rbFratello.isChecked())
            coefficienteParentela=0.6;
        else if(rbTestimone.isChecked())
            coefficienteParentela=0.8;
        else if(rbGenitore.isChecked())
            coefficienteParentela=0.9;

        coefficienteSpacconaggine=-0.1;
        if(rbNormale.isChecked())
            coefficienteSpacconaggine=0;
        else if(rbBellaFigura.isChecked())
            coefficienteSpacconaggine=0.2;
        else if(rbSpaccone.isChecked())
            coefficienteSpacconaggine=0.4;
        else if(rbGradasso.isChecked())
            coefficienteSpacconaggine=0.6;

        regalo=((numeroBambini/2+numeroInvitati)*costoPranzo*exp(coefficienteParentela)*exp(coefficienteSpacconaggine));

        return(dec.format(regalo));
    }
}
