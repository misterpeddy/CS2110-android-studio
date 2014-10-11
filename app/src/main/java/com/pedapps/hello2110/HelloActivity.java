package com.pedapps.hello2110;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class HelloActivity extends Activity {
    private Button do_nothing_button;
    private TextView hello_world_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Do all the setup associated with the Activity class
        setContentView(R.layout.activity_hello); //Set our view to activity_pretty.xml
        connectLayoutItems();
        respondToEvents();
    }

    /*
    Connect to the Button and TextView in the Layout (activity_hello.xml)
     */
    public void connectLayoutItems() {
        do_nothing_button = (Button) findViewById(R.id.send_button);
        hello_world_text = (TextView) findViewById(R.id.hello_text);
    }

    /*
    Respond to the do_nothing_button onClick event: display a Toast
     */
    public void respondToEvents() {
        do_nothing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button actually doesn't do anything..", Toast.LENGTH_LONG).show();
                /*
                Ok This is not as complicated as it looks. A Toast is just a little alert that pops up for a split second.
                Toast.makeText(Context context, String text, Integer duration) takes these 3 arguments and creates a Toast.
                the .show() tells the OS to show the toast for the given duration.

                parameters:
                Toast.LENGTH_LONG : LENGTH_LONG is a final static integer declared in the Toast class. All it does is return the
                value 1. This tells the Toast object it should display the Toast for a long period of time (as opposed to
                Toast.LENGTH_SHORT)

                String text : This one is trivial.. you give it the String you want to be displayed with the Toast

                getApplicationContext() : Ok, this one is not fun at all. This parameter needs to be the Context of the Activity.
                Context is probably the hardest class for you to understand. But in short, Context is what allows each Activity
                to fit into the Application's Context. So each Activity has a Context, and each Application has sort of a global
                Context. Google Android Context for a better/more through explanation. Don't worry if you don't understand it though.

                * Disclaimer for more advanced Android developers: Yes, I am aware that getApplicationContext() should never be
                * used for Objects with short lifespans. But it is a whole lot less cryptic than HelloActivity.this
                * (which would be the correct alternative). This is a minor point though, so no need to actually worry about this.

                 */
            }
        });
    }



    /*
        Everything past this point can be ignored.
        It is auto-generated code that comes with any class that extends the Activity class.
        In fact, you can erase it if you want and nothing will happen - I kept it in here so that
        your shell didn't have methods that mine didn't...
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
