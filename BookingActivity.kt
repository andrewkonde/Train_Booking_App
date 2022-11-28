package com.example.booktrain

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.booktrain.databinding.ActivityBookingBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class BookingActivity : AppCompatActivity() {

    //private lateinit var binding : ActivityBookingBinding
    //private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = ActivityBookingBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        setContentView(R.layout.activity_booking)

        //Accessing the list items:
        val train_types = resources.getStringArray(R.array.train_types)

        //Accessing the spinner
        val spinner = findViewById<Spinner>(R.id.type_drop_down)
        if (spinner != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, train_types)
            spinner.adapter = adapter




        /*binding.next.setOnClickListener{

            val currentLocation = binding.currLocation.text.toString()
            val currentStation = binding.currStation.text.toString()
            val destination = binding.dest.text.toString()
            val trainTypeSelected = binding.typeDropDown.isSelected.toString()

            database = FirebaseDatabase.getInstance().getReference("booktrain")

            //val bookinginfo = bookings(currentLocation, currentStation, destination, trainTypeSelected)

            //------------------------------------------------------------------------------------------------

            //------------------------------------------------------------------------------------------------

            database.child(currentLocation).setValue(bookinginfo).addOnSuccessListener {

                binding.currLocation.text.clear()
                binding.currStation.text.clear()
                binding.dest.text.clear()
                //binding.typeDropDown.isSelected.clear()

                Toast.makeText(this, "Successfully Saved!", Toast.LENGTH_SHORT).show()

            }.addOnFailureListener{

                Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show()
            }*/

        }


    }
    }