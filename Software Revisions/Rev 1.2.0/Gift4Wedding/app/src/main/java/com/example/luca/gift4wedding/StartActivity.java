package com.example.luca.gift4wedding;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.example.luca.gift4wedding.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
public class StartActivity extends Activity {
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

    private TextView lblInfo;
    private TextView lblTitleInfo;
    private TextView lblNumeroPartecipanti;
    private TextView lblBambiniEsclusi;
    private TextView lblNumeroBambini;
    private TextView lblRelazioneParentela;
    private TextView lblCoefficienteSpacconaggine;
    private TextView lblCostoRicevimento;
    private TextView lblStimato;
    private TextView lblRegaloConsigliato;
    private TextView lblRegalo;
    private TextView lblNotaRegalo1;
    private TextView lblNotaRegalo2;
    private TextView lblRev;

    private FrameLayout flInfo;
    private FrameLayout flNumeroPartecipanti;
    private FrameLayout flNumeroBambini;
    private FrameLayout flRelazioneParentela;
    private FrameLayout flCoefficienteSpacconaggine;
    private FrameLayout flCostoRicevimento;
    private FrameLayout flRegalo;
    private FrameLayout flSettings;
    private FrameLayout flLastFrameLayout;

    private static final float ratioTextScreenWidthTitles=((float)1/18);
    private static final float ratioTextScreenWidthTexts=((float)1/32);
    private static final float ratioTextScreenWidthRadioButtons=((float)1/27);
    private static final float ratioTextScreenWidthButtons=((float)1/27);
    private static final float ratioTextScreenWidthInputTexts=((float)1/18);

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

        lblInfo=(TextView)findViewById(R.id.lblInfo);
        lblTitleInfo=(TextView)findViewById(R.id.lblTitleInfo);
        lblNumeroPartecipanti=(TextView)findViewById(R.id.lblNumeroPartecipanti);
        lblBambiniEsclusi=(TextView)findViewById(R.id.lblBambiniEsclusi);
        lblNumeroBambini=(TextView)findViewById(R.id.lblNumeroBambini);
        lblRelazioneParentela=(TextView)findViewById(R.id.lblRelazioneParentela);
        lblCoefficienteSpacconaggine=(TextView)findViewById(R.id.lblCoefficienteSpacconaggine);
        lblCostoRicevimento=(TextView)findViewById(R.id.lblCostoRicevimento);
        lblStimato=(TextView)findViewById(R.id.lblStimato);
        lblRegaloConsigliato=(TextView)findViewById(R.id.lblRegaloConsigliato);
        lblRegalo=(TextView)findViewById(R.id.lblRegalo);
        lblNotaRegalo1=(TextView)findViewById(R.id.lblNotaRegalo1);
        lblNotaRegalo2=(TextView)findViewById(R.id.lblNotaRegalo2);
        lblRev=(TextView)findViewById(R.id.lblRev);

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

        setControls();
    }

    private void setControls()
    {

        //Set revision text.
        lblRev.setText("Rev. "+BuildConfig.VERSION_NAME);

        //Setta gli eventi.
        setEvents();

        //Set all frames invisible.
        allFrameInvisible();

        //Set text size.
        adaptTextSize();

        //Reset valori.
        resetVals();

        //Set info frame visible.
        flInfo.setVisibility(View.VISIBLE);

        //Set admob.
        MobileAds.initialize(getApplicationContext(), "@string/banner_ad_unit_id_app");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void adaptTextSize()
    {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int deviceWidth = metrics.widthPixels;
        int titlesSize=(int)(ratioTextScreenWidthTitles*deviceWidth);
        int textSize=(int)(ratioTextScreenWidthTexts*deviceWidth);
        int radioButtonSize=(int)(ratioTextScreenWidthRadioButtons*deviceWidth);
        int buttonSize=(int)(ratioTextScreenWidthButtons*deviceWidth);
        int inputTextSize=(int)(ratioTextScreenWidthInputTexts*deviceWidth);

        //Set titles textbox size.
        lblTitleInfo.setTextSize(titlesSize);
        lblNumeroPartecipanti.setTextSize(titlesSize);
        lblNumeroBambini.setTextSize(titlesSize);
        lblRelazioneParentela.setTextSize(titlesSize);
        lblCoefficienteSpacconaggine.setTextSize(titlesSize);
        lblCostoRicevimento.setTextSize(titlesSize);
        lblRegaloConsigliato.setTextSize(titlesSize);
        lblRegalo.setTextSize(titlesSize);
        //Set texts size.
        lblInfo.setTextSize(textSize);
        lblBambiniEsclusi.setTextSize(textSize);
        lblStimato.setTextSize(textSize);
        lblNotaRegalo1.setTextSize(textSize);
        lblNotaRegalo2.setTextSize(textSize);
        //Set radiobuttons size.
        rbAmico.setTextSize(radioButtonSize);
        rbCugino.setTextSize(radioButtonSize);
        rbFratello.setTextSize(radioButtonSize);
        rbTestimone.setTextSize(radioButtonSize);
        rbGenitore.setTextSize(radioButtonSize);
        rbTirchio.setTextSize(radioButtonSize);
        rbNormale.setTextSize(radioButtonSize);
        rbBellaFigura.setTextSize(radioButtonSize);
        rbSpaccone.setTextSize(radioButtonSize);
        rbGradasso.setTextSize(radioButtonSize);
        //Set buttons size.
        bttAvanti_IN.setTextSize(buttonSize);
        bttAvanti_NP.setTextSize(buttonSize);
        bttIndietro_NP.setTextSize(buttonSize);
        bttAvanti_NB.setTextSize(buttonSize);
        bttIndietro_NB.setTextSize(buttonSize);
        bttAvanti_RP.setTextSize(buttonSize);
        bttIndietro_RP.setTextSize(buttonSize);
        bttAvanti_CS.setTextSize(buttonSize);
        bttIndietro_CS.setTextSize(buttonSize);
        bttAvanti_CR.setTextSize(buttonSize);
        bttIndietro_CR.setTextSize(buttonSize);
        bttAvanti_RC.setTextSize(buttonSize);
        bttIndietro_RC.setTextSize(buttonSize);
        //Set input texts size.
        txtCostoRicevimento.setTextSize(inputTextSize);
        txtNumeroPartecipanti.setTextSize(inputTextSize);
        txtNumeroBambini.setTextSize(inputTextSize);
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

    public static void hideKeyboard(Activity activity)
    {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null)
        {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
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
                hideKeyboard(StartActivity.this);
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
                hideKeyboard(StartActivity.this);
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
                hideKeyboard(StartActivity.this);
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
                hideKeyboard(StartActivity.this);
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
                hideKeyboard(StartActivity.this);

                //Calcolo e settaggio valore.
                calcoloRegalo();

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
                hideKeyboard(StartActivity.this);

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

    private void calcoloRegalo()
    {

        int numeroBambini,numeroInvitati;
        double costoPranzo,coefficienteParentela,coefficienteSpacconaggine,regaloAdulto,regaloBambino,regalo;
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

        regaloAdulto=costoPranzo*exp(coefficienteParentela)*exp(coefficienteSpacconaggine);
        regaloBambino=regaloAdulto/2;
        regalo=(numeroInvitati*regaloAdulto+numeroBambini*regaloBambino);
        lblRegalo.setText(dec.format(regalo));
        lblNotaRegalo1.setText("");
        lblNotaRegalo2.setText("");
        if(numeroInvitati>0 && numeroBambini>0)
            lblNotaRegalo1.setText(dec.format(regaloAdulto) + " per ogni adulto\n" + dec.format(regaloBambino) + " per ogni bambino");
        else
        {
            if(numeroInvitati>1)
                lblNotaRegalo1.setText(dec.format(regaloAdulto) + " per ogni adulto");
            else if(numeroBambini>0)
            {
                if(numeroBambini>1)
                {
                    lblNotaRegalo1.setText(dec.format(regaloBambino) + " per ogni bambino");
                    lblNotaRegalo2.setText("Ma cosa fai, mandi solo i bambini e tu rimani a casa?!");
                }
                else
                    lblNotaRegalo1.setText("Ma cosa fai, mandi solo i bambini e tu rimani a casa?!");
            }
            else if(numeroInvitati==0 && numeroBambini==0)
                lblNotaRegalo1.setText("Ma come, ti hanno invitato al matrimonio e tu non vai?!");
        }
    }
}
