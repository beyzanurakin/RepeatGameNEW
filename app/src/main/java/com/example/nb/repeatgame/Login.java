package com.example.nb.repeatgame;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    EditText edt_title, edt_content;
    Button btn_post;
    RecyclerView reyclerView;

    //firebase
    FirebaseDatabase firebaseDatabase;
    DatabaseReference ref;
    FirebaseRecyclerOptions<Post> options;
    FirebaseRecyclerAdapter<Post, MyRecyclerViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edt_content = (EditText)(findViewById(R.id.edt_content));
        edt_title = (EditText) (findViewById(R.id.edt_title));
        btn_post = (Button)(findViewById(R.id.btn_post));
        //reyclerView = (RecyclerView)(findViewById(R.id.recyler_view));

     //   databaseReference = FirebaseDatabase.getInstance();

       // String url = "https://repaetgame.firebaseio.com";

        //databaseReference = firebaseDatabase.getReference(url);


        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref = FirebaseDatabase.getInstance().getReference();
                System.out.println(ref);
                Post post =new Post(edt_title.getText().toString(),edt_content.getText().toString());
                ref.child("0").setValue(post);

                Intent intent = new Intent(Login.this,PlayPage.class);
                startActivity(intent);

            }
        });

      //  displayComment();

    }




}
