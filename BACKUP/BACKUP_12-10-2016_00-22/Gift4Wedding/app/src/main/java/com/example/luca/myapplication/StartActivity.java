package com.example.luca.myapplication;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

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

    private Button bttAvanti_IN;

    private Button bttAvanti_NP;
    private Button bttIndietro_NP;

    private Button bttAvanti_NB;
    private Button bttIndietro_NB;

    private Button bttAvanti_R;
    private Button bttIndietro_R;

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
    private RadioButton rbParente;
    private RadioButton rbTestimone;

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

        bttAvanti_R=(Button)findViewById(R.id.bttAvanti_R);
        bttIndietro_R=(Button)findViewById(R.id.bttIndietro_R);

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
        rbParente=(RadioButton) findViewById(R.id.rbParente);
        rbTestimone=(RadioButton) findViewById(R.id.rbTestimone);

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
        flRelazioneParentela=(FrameLayout)findViewById(R.id.flRelazione);
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

        //MobileAds.initialize(getApplicationContext(), "@string/banner_ad_unit_id_app");
        //AdView mAdView = (AdView) findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
        //mAdView.loadAd(adRequest);

        //Reset valori.
        resetVals();

        //Setta gli eventi.
        setEvents();
    }

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
        bttAvanti_R.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                flRelazioneParentela.setVisibility(View.INVISIBLE);
                flCoefficienteSpacconaggine.setVisibility(View.VISIBLE);
                flLastFrameLayout=flCoefficienteSpacconaggine;
            }
        });
        bttIndietro_R.setOnClickListener(new View.OnClickListener()
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
        if(rbParente.isChecked())
            coefficienteParentela=0.6;
        else if(rbTestimone.isChecked())
            coefficienteParentela=0.8;

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
