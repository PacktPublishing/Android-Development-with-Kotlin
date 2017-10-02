public class MainActivity extends Activity { 
 
    TextView questionLabelView 
    EditText answerLabelView 
    Button confirmButtonView 
 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        questionLabelView = findViewById<TextView>
              (R.id.main_question_label);    
        answerLabelView   = findViewById<EditText>
              (R.id.main_answer_label);    
        confirmButtonView = findViewById<Button>
              (R.id.main_button_confirm);      
    } 
}