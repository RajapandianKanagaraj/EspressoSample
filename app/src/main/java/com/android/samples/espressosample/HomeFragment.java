package com.android.samples.espressosample;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends android.app.Fragment implements View.OnClickListener{

    private EditText testField1;
    private EditText testField2;
    private Button addBtn;
    private Button multiplyBtn;
    private Button divideBtn;
    private TextView result;
    private Context context;
    public HomeFragment() {
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        this.context = context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        testField1 = (EditText)rootView.findViewById(R.id.text_field1);
        testField2 = (EditText)rootView.findViewById(R.id.text_field2);
        addBtn = (Button)rootView.findViewById(R.id.add);
        multiplyBtn = (Button)rootView.findViewById(R.id.multiply);
        divideBtn = (Button)rootView.findViewById(R.id.divide);
        result = (TextView)rootView.findViewById(R.id.result);
        addBtn.setOnClickListener(this);
        multiplyBtn.setOnClickListener(this);
        divideBtn.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        if(v == addBtn) {
            String value1 = testField1.getText().toString();
            String value2 = testField2.getText().toString();
            if(value1 != null && value2 != null && !value1.isEmpty() && !value2.isEmpty()) {
                int resultValue = Integer.valueOf(value1) + Integer.valueOf(value2);
                result.setText("" + resultValue);
            }
        }else  if(v == multiplyBtn){
            String value1 = testField1.getText().toString();
            String value2 = testField2.getText().toString();
            if(value1 != null && value2 != null && !value1.isEmpty() && !value2.isEmpty()) {
                int resultValue = Integer.valueOf(value1) * Integer.valueOf(value2);
                result.setText("" + resultValue);
            }
        }else  if(v == divideBtn){
            try {
                String value1 = testField1.getText().toString();
                String value2 = testField2.getText().toString();
                if(value1 != null && value2 != null && !value1.isEmpty() && !value2.isEmpty()) {
                    if (Integer.valueOf(value1) < Integer.valueOf(value2)) {
                        result.setText("0");
                    } else {
                        int resultValue = Integer.valueOf(value1) / Integer.valueOf(value2);
                        result.setText("" + resultValue);
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


