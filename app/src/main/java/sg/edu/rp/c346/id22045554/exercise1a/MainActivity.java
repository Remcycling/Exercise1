package sg.edu.rp.c346.id22045554.exercise1a;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvTodo;
    ArrayList<ToDoItem> alTodo;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.listViewTodo);
        alTodo = new ArrayList<>();

        Calendar date = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date.set(2020,8,1);
        date2.set(2020,8,2);

        ToDoItem item1 = new ToDoItem("Go for movie",date, 3);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2,4);

        alTodo.add(item1);
        alTodo.add(item2);


        adapter = new CustomAdapter(this, R.layout.row, alTodo);

        lvTodo.setAdapter(adapter);


    }
}