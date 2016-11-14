package ca.ualberta.ridr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Currently not super useful just allows driver to enter keyword and get to @SearchResultsView
 * May be scrapped in the near future
 */
public class SearchRequestsView extends Activity {

    private ArrayList<Request> requestList = new ArrayList<Request>();
    private ArrayAdapter<Request> adapter;
    final RequestController requestController = new RequestController();
    private TextView bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_requests);

        bodyText = (EditText) findViewById(R.id.searchRequestsText);
        Button searchButton = (Button) findViewById(R.id.searchRequestsButton);

        searchButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String text = bodyText.getText().toString();
                Intent intent = new Intent(SearchRequestsView.this, SearchResultsView.class);
                intent.putExtra("keyword", text);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
