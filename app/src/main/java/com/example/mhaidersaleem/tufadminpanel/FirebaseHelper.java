package com.example.mhaidersaleem.tufadminpanel;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by M.HAiDER Saleem on 09/05/2018.
 */

public class FirebaseHelper {
    Long key= Long.valueOf(12);
    public FirebaseHelper()
    {}
    public boolean add_table(add_articles obj, String child,int key1) {


    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("info");



        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference imagesRef = rootRef.child("current_key");
        imagesRef.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    Log.d("Child","exist");
                    for (DataSnapshot ds: dataSnapshot.getChildren()) {
                        key = (Long) ds.child("key").getValue();
                    }

                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("db",databaseError.getMessage());
            }
        });
        if(key1<key)
        {
            key++;
            update_key(key);
         obj.key="img"+String.valueOf(key);
        }
        else {
            myRef.child(child).setValue(obj);

            update_key(Long.valueOf(key1));
        }
        return true;
}
public void update_key(Long ke)
{
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("current_key");
    myRef.child("key").setValue(ke);
}


}
