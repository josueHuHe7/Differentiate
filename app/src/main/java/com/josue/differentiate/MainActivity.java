package com.josue.differentiate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText outputTextField;
    private ImageView fieldImageOutput;
    private String answerImage;
    private String answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    /**
     * Initializes global variables
     */
    private void initialize() {
        outputTextField = (EditText) findViewById(R.id.textualDescription);
        fieldImageOutput = (ImageView) findViewById(R.id.graphicDescription);
        answerText = "* La información debe estar siempre clara y bien estructurada.\n\n" +
                "* Tu currículum no debe pasar de una o dos hojas, como máximo.\n\n" +
                "* Utiliza un papel de color blanco o de colores claros, en formato A4 y de calidad.\n\n" +
                "* Escribe con una fuente legible y espaciada que facilite la lectura.\n\n" +
                "* Imprime el currículum, no lo escribas a mano ni los mecanografíes.\n\n" +
                "* Resaltar tus logros, y maquilla los fracasos, pero nunca inventes.\n\n" +
                "* La fotografía debe ser reciente, de color y de tamaño carnet.\n\n" +
                "* Escribe por una sola cara del folio.\n\n" +
                "* Cuida el estilo y evita los errores de ortografía.\n\n" +
                "* Envía siempre certificados originales, nunca fotocopias.\n";
        answerImage = "1";
    }

    /**
     * Shows the results on screen as selected
     */
    public void show(View view) {
        outputTextField.setText(answerText);
        if (answerImage == "1") {
            fieldImageOutput.setImageResource(R.drawable.imageuno);
        } else {
            if (answerImage == "2") {
                fieldImageOutput.setImageResource(R.drawable.imagedos);
            } else {
                if (answerImage == "3") {
                    fieldImageOutput.setImageResource(R.drawable.imagetres);
                } else {
                    if (answerImage == "4") {
                        fieldImageOutput.setImageResource(R.drawable.imagecuatro);
                    } else {
                        fieldImageOutput.setImageResource(R.drawable.imagecinco);
                    }
                }
            }
        }
    }

    /**
     * Sets the response for selecting Resume
     */
    public void setsAnswerResume(View view) {
        answerText = "* La información debe estar siempre clara y bien estructurada.\n\n" +
                "* Tu currículum no debe pasar de una o dos hojas, como máximo.\n\n" +
                "* Utiliza un papel de color blanco o de colores claros, en formato A4 y de calidad.\n\n" +
                "* Escribe con una fuente legible y espaciada que facilite la lectura.\n\n" +
                "* Imprime el currículum, no lo escribas a mano ni los mecanografíes.\n\n" +
                "* Resaltar tus logros, y maquilla los fracasos, pero nunca inventes.\n\n" +
                "* La fotografía debe ser reciente, de color y de tamaño carnet.\n\n" +
                "* Escribe por una sola cara del folio.\n\n" +
                "* Cuida el estilo y evita los errores de ortografía.\n\n" +
                "* Envía siempre certificados originales, nunca fotocopias.\n";
        answerImage = "1";
    }

    /**
     * Sets the response to the selection of Clothing
     */
    public void setsResponseClothing(View view) {
        answerText = "* Son mejores los colores conservadores en algún tono azul o gris. Usar un color negro   puede resultar demasiado serio. Si lo usas, asegúrate de llevar otro color cerca de tu cara para suavizar la imagen.\n\n" +
                "* Es preferible usar camisas que camisetas. Si la situación lo requiere, lleva corbata.\n\n" +
                "* Los pantalones formales se verán fantásticos, sobre todo si coinciden con la chaqueta del traje.\n\n" +
                "* Si eres mujer, no te pintes las uñas con colores chillones ni estrambóticos. Mantén las uñas cuidadas y limpias.\n\n" +
                "* No conviene usar pantalones de pescador ni piratas.\n\n" +
                "* Evita cargarte de joyería innecesaria.\n\n" +
                "* Si optas por llevar las piernas desnudas, usa medias, aunque haga calor. Las medias pueden ser de color neutral, o de algún color que combine con tus zapatos.\n\n" +
                "* Evita las cazadoras de cuero (chamarras), son demasiado deportivas.\n\n" +
                "* No uses sandalias, chanclas o calzado por el estilo.\n\n" +
                "* Cambia la apariencia de tu forma de vestir en una segunda entrevista, cambiando el color de tu blusa, camisa, o corbata.\n";
        answerImage = "2";
    }

    /**
     * Sets the response to the selection of Punctuality
     */
    public void setsResponsePunctuality(View view) {
        answerText = "* Cuando no llegamos a tiempo a una entrevista de trabajo, estamos proyectando un mensaje acerca de nuestra incapacidad para organizarnos y para planificar.\n\n" +
                "* La puntualidad no solamente es una forma de respetar a los otros, es también una forma de indicarles que estamos interesados, por lo que si llegamos tarde a una entrevista de trabajo, estaremos diciendo de una forma indirecta que no nos importa en absoluto lo que tienen para decirnos.\n\n" +
                "* Otra de las razones que demuestran la importancia de la puntualidad se basan en el hecho de que la credibilidad de nuestra palabra está en juego. Cuando las personas son impuntuales, no se puede decir que tengan credibilidad, es decir que nadie puede confiar en ellos para ningún aspecto de la vida.\n\n" +
                "* Cuando las personas son impuntuales suele decirse que poseen un tipo de personalidad que le agrada llamar la atención de los otros, ser el centro de atención, en otros aspectos puede decirse que las personas impuntuales suelen ser irrespetuosas y con falencias de carácter. \n";
        answerImage = "3";
    }

    /**
     * Sets the response to the selection of Extra Knowledge
     */
    public void setsResponseExtraKnowledge(View view) {
        answerText = "* Conoce todo lo que puedas de la empresa.\n\n" +
                "* Ve a la empresa y pregunta sobre la persona que te ara la entrevista, averigua como es su carácter para estar preparado.\n\n" +
                "* Conoce como es la vestimenta que usan en la empresa para no ir de forma muy sobresaliente o muy inapropiadamente.\n" +
                "* Averigua las tareas que se realizan en el puesto al que te postulas. \n\n" +
                "* Averigua cuanto tiempo te toma llegar desde tu domicilio hasta la empresa.\n\n" +
                "* Hazte una relación de tus puntos débiles y prepara argumentos para defenderlos.\n\n" +
                "* Si te citan por escrito, lo correcto es que llames para confirmar tu asistencia.\n";
        answerImage = "4";
    }

    /**
     * Sets the response to the selection of questions and answers
     */
    public void setsResponseQuestionsAndAnswers(View view) {
        answerText = "Familiarízate con algunas de las preguntas difíciles más comunes y prepara con anticipación las respuestas.\n";
        answerImage = "5";
    }
}
