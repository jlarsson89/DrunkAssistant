package blah.drunkassistant;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent intent = new Intent(this, BarMaps.class);
        //startActivity(intent);

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Warning!");
        alertDialog.setMessage("Please drink responsibly. \n https://www.drinkaware.co.uk/");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();

        List<String> choises = new ArrayList<String>();
        choises.add("Pub");
        choises.add("Night Club");
        choises.add("Bar");
        Spinner barSelection = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, choises);
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        barSelection.setAdapter(dataAdapter);

    }
}
