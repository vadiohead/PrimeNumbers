/**
 * small application for convenient search of prime numbers
 *
 * @author clyde
 * @version 1.0
 */
package com.example.primenumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;

import android.util.Log;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    String definition;
    String range_error;
    String negative_error;
    String text;
    String from;
    String to;
    String output;
    String calculate;
    String defaultString;
    String language;
    String not_found;
    String found;
    String copy;
    String toastClipboard;

    TextView definitionView;
    TextView textView;
    TextView startView;
    TextView endView;
    TextView result;
    TextView defaultView;
    Button copyButton;
    Button calculateButton;

    TextView fromView;
    TextView toView;
    String numbers;
    int start = 2;
    int end = 1000;

    /**
     * called when the activity is first created.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("BLOODY HELL", "LANGUAGE CHANGING PROCESS INITIATED");
                /**
                 * retrieves language from strings.xml
                 *
                 * @switch ID of a language
                 */
                switch (i) {
                    case 0:
                        if(definition != null) { // prevents Toast from making text on launch
                            Toast.makeText(MainActivity.this,
                                    getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();
                        }
                        definition = getResources().getString(R.string.definition);
                        defaultString = getResources().getString(R.string.display);

                        not_found = getResources().getString(R.string.not_found);
                        found = getResources().getString(R.string.found);

                        range_error = getResources().getString(R.string.range_error);
                        negative_error = getResources().getString(R.string.negative_error);

                        text = getResources().getString(R.string.text);
                        from = getResources().getString(R.string.from);
                        to = getResources().getString(R.string.to);

                        output = getResources().getString(R.string.output);
                        calculate = getResources().getString(R.string.calculate);
                        language = getResources().getString(R.string.language);
                        copy = getResources().getString(R.string.copy);
                        toastClipboard = getResources().getString(R.string.toast_clipboard);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_bxr), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_bxr);
                        defaultString = getResources().getString(R.string.display_bxr);

                        not_found = getResources().getString(R.string.not_found_bxr);
                        found = getResources().getString(R.string.found_bxr);

                        range_error = getResources().getString(R.string.range_error_bxr);
                        negative_error = getResources().getString(R.string.negative_error_bxr);

                        text = getResources().getString(R.string.text_bxr);
                        from = getResources().getString(R.string.from_bxr);
                        to = getResources().getString(R.string.to_bxr);

                        output = getResources().getString(R.string.output_bxr);
                        calculate = getResources().getString(R.string.calculate_bxr);
                        language = getResources().getString(R.string.language_bxr);
                        copy = getResources().getString(R.string.copy_bxr);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_bxr);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_esp), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_esp);
                        defaultString = getResources().getString(R.string.display_esp);

                        not_found = getResources().getString(R.string.not_found_esp);
                        found = getResources().getString(R.string.found_esp);

                        range_error = getResources().getString(R.string.range_error_esp);
                        negative_error = getResources().getString(R.string.negative_error_esp);

                        text = getResources().getString(R.string.text_esp);
                        from = getResources().getString(R.string.from_esp);
                        to = getResources().getString(R.string.to_esp);

                        output = getResources().getString(R.string.output_esp);
                        calculate = getResources().getString(R.string.calculate_esp);
                        language = getResources().getString(R.string.language_esp);
                        copy = getResources().getString(R.string.copy_esp);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_esp);
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_et), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_et);
                        defaultString = getResources().getString(R.string.display_et);

                        not_found = getResources().getString(R.string.not_found_et);
                        found = getResources().getString(R.string.found_et);

                        range_error = getResources().getString(R.string.range_error_et);
                        negative_error = getResources().getString(R.string.negative_error_et);

                        text = getResources().getString(R.string.text_et);
                        from = getResources().getString(R.string.from_et);
                        to = getResources().getString(R.string.to_et);

                        output = getResources().getString(R.string.output_et);
                        calculate = getResources().getString(R.string.calculate_et);
                        language = getResources().getString(R.string.language_et);
                        copy = getResources().getString(R.string.copy_et);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_et);
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_kz), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_kz);
                        defaultString = getResources().getString(R.string.display_kz);

                        not_found = getResources().getString(R.string.not_found_kz);
                        found = getResources().getString(R.string.found_kz);

                        range_error = getResources().getString(R.string.range_error_kz);
                        negative_error = getResources().getString(R.string.negative_error_kz);

                        text = getResources().getString(R.string.text_kz);
                        from = getResources().getString(R.string.from_kz);
                        to = getResources().getString(R.string.to_kz);

                        output = getResources().getString(R.string.output_kz);
                        calculate = getResources().getString(R.string.calculate_kz);
                        language = getResources().getString(R.string.language_kz);
                        copy = getResources().getString(R.string.copy_kz);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_kz);
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_mm), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_mm);
                        defaultString = getResources().getString(R.string.display_mm);

                        not_found = getResources().getString(R.string.not_found_mm);
                        found = getResources().getString(R.string.found_mm);

                        range_error = getResources().getString(R.string.range_error_mm);
                        negative_error = getResources().getString(R.string.negative_error_mm);

                        text = getResources().getString(R.string.text_mm);
                        from = getResources().getString(R.string.from_mm);
                        to = getResources().getString(R.string.to_mm);

                        output = getResources().getString(R.string.output_mm);
                        calculate = getResources().getString(R.string.calculate_mm);
                        language = getResources().getString(R.string.language_mm);
                        copy = getResources().getString(R.string.copy_mm);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_mm);
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_ru), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_ru);
                        defaultString = getResources().getString(R.string.display_ru);

                        not_found = getResources().getString(R.string.not_found_ru);
                        found = getResources().getString(R.string.found_ru);

                        range_error = getResources().getString(R.string.range_error_ru);
                        negative_error = getResources().getString(R.string.negative_error_ru);

                        text = getResources().getString(R.string.text_ru);
                        from = getResources().getString(R.string.from_ru);
                        to = getResources().getString(R.string.to_ru);

                        output = getResources().getString(R.string.output_ru);
                        calculate = getResources().getString(R.string.calculate_ru);
                        language = getResources().getString(R.string.language_ru);
                        copy = getResources().getString(R.string.copy_ru);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_ru);
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this,
                                getResources().getString(R.string.toast_vn), Toast.LENGTH_SHORT).show();
                        definition = getResources().getString(R.string.definition_vn);
                        defaultString = getResources().getString(R.string.display_vn);

                        not_found = getResources().getString(R.string.not_found_vn);
                        found = getResources().getString(R.string.found_vn);

                        range_error = getResources().getString(R.string.range_error_vn);
                        negative_error = getResources().getString(R.string.negative_error_vn);

                        text = getResources().getString(R.string.text_vn);
                        from = getResources().getString(R.string.from_vn);
                        to = getResources().getString(R.string.to_vn);

                        output = getResources().getString(R.string.output_vn);
                        calculate = getResources().getString(R.string.calculate_vn);
                        language = getResources().getString(R.string.language_vn);
                        copy = getResources().getString(R.string.copy_vn);
                        toastClipboard = getResources().getString(R.string.toast_clipboard_vn);
                        break;
                }
                // set views' text
                definitionView.setText(definition);
                defaultView.setText(defaultString);
                textView.setText(text);
                startView.setText(from);
                endView.setText(to);
                copyButton.setText(copy);
                calculateButton.setText(calculate);
                Log.d("BLOODY HELL", "LANGUAGE CHANGING PROCESS FINISHED");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // required for OnItemSelectedListener(), but does not have to be implemented
            }
        });
        String[] languages = {getResources().getString(R.string.language),
                                getResources().getString(R.string.language_bxr),
                                getResources().getString(R.string.language_esp),
                                getResources().getString(R.string.language_et),
                                getResources().getString(R.string.language_kz),
                                getResources().getString(R.string.language_mm),
                                getResources().getString(R.string.language_ru),
                                getResources().getString(R.string.language_vn)};
        int[] icons = {R.drawable.english, R.drawable.buryat, R.drawable.spanish, R.drawable.amharic,
                R.drawable.kazakh, R.drawable.burmese, R.drawable.russian, R.drawable.vietnamese};

        SpinnerIcons adapter = new SpinnerIcons(this, languages, icons); // call spinner with icons
        spinner.setAdapter(adapter);

        // initialise views
        textView = findViewById(R.id.textView2);
        textView.setText(text);

        startView = findViewById(R.id.from);
        startView.setText(from);
        endView = findViewById(R.id.to);
        endView.setText(to);

        copyButton = findViewById(R.id.copy);
        copyButton.setText(copy);
        calculateButton = findViewById(R.id.calculate);
        calculateButton.setText(calculate);

        definitionView = findViewById(R.id.definition);
        definitionView.setText(definition);
        defaultView = findViewById(R.id.numbers);
        defaultView.setText(defaultString);

        fromView = findViewById(R.id.fromValue);
        toView = findViewById(R.id.toValue);
        result = findViewById(R.id.numbers);
        Log.d("BLOODY HELL", "ACTIVITY CREATED");
    }

    /**
     * copies the result to the clipboard
     * @param v
     */
    public void copyToClipboard(View v) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Copied Text", result.getText());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(this, toastClipboard, Toast.LENGTH_SHORT).show();
    }

    /**
     * calculates prime numbers in the given range
     * @param v
     */
    public void calculate(View v) {
        Log.d("BLOODY HELL", "BUTTON PRESSED");
        String fromText = fromView.getText().toString().trim();
        String toText = toView.getText().toString().trim();

        // validate inputs (just in case)
        if (fromText.isEmpty() || toText.isEmpty()) {
            result.setText("Please enter valid numbers in both fields.");
        }
        try {
            start = Integer.parseInt(fromText);
            end = Integer.parseInt(toText);
        }
        catch (NumberFormatException e) {
            result.setText("Invalid input. Please enter numeric values.");
        }
        Log.d("BLOODY HELL", "START: " + start + " END: " + end);

        numbers = "";
        boolean check; // flag to check if number is prime

        if(start > end) { // check if start is greater than end
            numbers = range_error;
            result.setText(numbers);
            Log.d("BLOODY HELL", "FROM LESS THAN TO");
        }
        else if(start < 0) { // check if start is negative
            numbers = negative_error;
            result.setText(numbers);
            Log.d("BLOODY HELL", "FROM NEGATIVE");
        }
        else { // calculate prime numbers
            Log.d("BLOODY HELL", "PROCESS INITIATED");
            for(int i = start; i <= end; i++) {     // loop through range
                check = true;                       // reset check flag
                for(int k = 2; k < i/2; k++) {      // loop through numbers from 2 to i/2
                    if(i % k == 0) {
                        check = false;
                    }
                }
                if(check == true) {
                    if(i == 1 || i == 0) {          // 1 and 0 are not prime numbers
                        continue;
                    }
                    numbers = numbers + i + "\n";
                }
            }
            if(numbers.isEmpty() == true) {         // is called if no prime numbers were found
                result.setText(not_found+" "+start+"-"+end);
            }
            else {
                result.setText(found+" "+start+"-"+end+":\n" + numbers);
            }
            Log.d("BLOODY HELL", "PROCESS FINISHED");
        }
    }
}