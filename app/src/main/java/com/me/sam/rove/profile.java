package com.me.sam.rove;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;


public class profile extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    private TextView tvUserName,tvTravelling;
    private EditText etUserName, etTravellingWith;
    private ImageButton edit;
    private Button btnCamera, btnGallery, b,c;
    private Boolean editBool = false;
    private ImageView profilePic;
    private String uid;
    private ProgressDialog mRegProgress;

    private StorageReference mStorage;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;

    private static final int CAMERA_REQUEST = 1;
    private static final int GALLERY_REQUEST = 2;


    public profile() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container,false);

        tvUserName = (TextView) view.findViewById(R.id.tvUserName);
        tvTravelling = (TextView) view.findViewById(R.id.tvTravelling);
        etUserName = (EditText) view.findViewById(R.id.etUserName);
        etTravellingWith = (EditText) view.findViewById(R.id.etTravellingWith);
        profilePic = (ImageView) view.findViewById(R.id.imgBtnProfilePic);
        edit = (ImageButton) view.findViewById(R.id.imgBtnEdit);
        btnCamera = (Button) view.findViewById(R.id.btnCamera);
        btnGallery = (Button) view.findViewById(R.id.btnGallery);
        b = (Button) view.findViewById(R.id.logOut);
c = (Button) view.findViewById(R.id.memories);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                Uri uri = Uri.parse(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath()
                        + "/Pictures");
                intent.setDataAndType(uri, "image/*");
                startActivity(Intent.createChooser(intent, "Your Memories"));
            }
        });

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mStorage = FirebaseStorage.getInstance().getReference();

        mRegProgress = new ProgressDialog(getActivity());


        etUserName.setVisibility(View.GONE);
        etTravellingWith.setVisibility(View.GONE);
        btnCamera.setVisibility(View.GONE);
        btnGallery.setVisibility(View.GONE);


//        FirebaseUser user = mAuth.getCurrentUser();
//        mDatabase.child("Users").child(user.getUid()).child("UserName").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                tvUserName.setText(dataSnapshot.getValue().toString());
//                etUserName.setText(dataSnapshot.getValue().toString());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(getActivity(),"LOG OUT",Toast.LENGTH_LONG).show();
            }
        });



        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editBool==true){
                    tvUserName.setVisibility(View.VISIBLE);
                    tvTravelling.setVisibility(View.VISIBLE);
                    etUserName.setVisibility(View.GONE);
                    etTravellingWith.setVisibility(View.GONE);
                    btnCamera.setVisibility(View.GONE);
                    btnGallery.setVisibility(View.GONE);

                    FirebaseUser user = mAuth.getCurrentUser();
                    mDatabase.child("Users").child(user.getUid()).child("UserName").setValue(etUserName.getText().toString().trim());
                    tvUserName.setText(etUserName.getText().toString().trim());

                    edit.setImageResource(R.drawable.edit);

                }else{

                    tvUserName.setVisibility(View.GONE);
                    tvTravelling.setVisibility(View.GONE);
                    etUserName.setVisibility(View.VISIBLE);
                    etTravellingWith.setVisibility(View.VISIBLE);
                    btnCamera.setVisibility(View.VISIBLE);
                    btnGallery.setVisibility(View.VISIBLE);
                    edit.setImageResource(R.drawable.save);
                }

                editBool=!editBool;

            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }


        });

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent, GALLERY_REQUEST);
            }
        });






        // Inflate the layout for this fragment
        return view;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        profilePic.setScaleType(ImageView.ScaleType.CENTER_CROP);

        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {

            // uri = data.getData();

            //Toast.makeText(getActivity(),data.getExtras().get("data")+"",Toast.LENGTH_LONG).show();

            mRegProgress.setMessage("Please wait till profile picture updates");

            mRegProgress.setCanceledOnTouchOutside(false);
            mRegProgress.show();

            Bitmap photo = (Bitmap) data.getExtras().get("data");
            profilePic.setImageBitmap(photo);
            Uri uri = getImageUri(getActivity(), photo);
            //Toast.makeText(getActivity(),uri+"",Toast.LENGTH_LONG).show();

            FirebaseUser user = mAuth.getCurrentUser();
            uid = user.getUid();

            StorageReference filePath = mStorage.child("UserProfilePhoto").child(uid);
            filePath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    mRegProgress.dismiss();

                    //Toast.makeText(getActivity(),"succefully updated",Toast.LENGTH_LONG).show();

                }
            });



        }else if (requestCode == GALLERY_REQUEST && resultCode == Activity.RESULT_OK){

            mRegProgress.setMessage("Please wait till profile picture updates");

            mRegProgress.setCanceledOnTouchOutside(false);
            mRegProgress.show();

            Uri uri = data.getData();
            FirebaseUser user = mAuth.getCurrentUser();
            uid = user.getUid();
            StorageReference filePath = mStorage.child("UserProfilePhoto").child(uid);
            filePath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    mRegProgress.dismiss();

                    //Toast.makeText(getActivity(),"succefully updated",Toast.LENGTH_LONG).show();

                }
            });
            profilePic.setImageURI(uri);

        }
    }

    public Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }

}
