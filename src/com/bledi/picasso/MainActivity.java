package com.bledi.picasso;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView listView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = ( ListView ) findViewById(R.id.listview);
        	
        ExampleViewModel firstRow = new ExampleViewModel("First Row", "http://upload.wikimedia.org/wikipedia/commons/6/6f/Freiburger_Alpen.JPG");    
        ExampleViewModel secondRow = new ExampleViewModel("Second Row", "http://blog.caranddriver.com/wp-content/uploads/2013/05/lamborghini_egoista_three_quarter_front_view.jpg");    
        ExampleViewModel thirdRow = new ExampleViewModel("Third Row", "http://4.bp.blogspot.com/-vXnf7GjcXmg/UfJZE9rWc2I/AAAAAAAAGRc/x2CIlHM9IAA/s1600/aphoto49721.jpg");
   
        List<ExampleViewModel> viewModels = new ArrayList<ExampleViewModel>();
        viewModels.add(firstRow);
        viewModels.add(secondRow);
        viewModels.add(thirdRow);
        
        ExampleAdapter adapter = new ExampleAdapter(this, viewModels);
        listView.setAdapter(adapter);
     
    }
}
