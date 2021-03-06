package com.cse5324.projecthotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class SpecificReservation extends AppCompatActivity {
    ListView listContent;
    String StartDate="",StartTime="",HotelName="",NumberofRooms="",CheckinDate="",CheckoutDate="",RoomType="",TotalPrice="";
    TextView Startdate,Starttime,Hotelname,Numberofrooms,Checkindate,Checkoutdate,Roomtype,Totalprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_reservation);

        getSupportActionBar().setTitle("Specific Reservation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String text = getIntent().getExtras().getString("listselected");

        HashMap<String,String> send=new HashMap<String, String>();
        String[] nums = text.split(",");
        for(int i = 0;i<nums.length;i++)
        {
            String[] n = nums[i].split("=");
            n[0] = n[0].replace("{","");
            n[0] = n[0].replace("}","");
            n[1] = n[1].replace("{","");
            n[1] = n[1].replace("}","");

            String nw = n[0];

            nw = nw.replace(" " , "");

            if(nw.equals("StartDate"))
            {
                StartDate = n[1];
            }
            else if(nw.equals("StartTime"))
            {
                StartTime = n[1];
            }
            else if(nw.equals("HotelName"))
            {
                HotelName = n[1];
            }
            else if(nw.equals("NumberofRooms"))
            {
                NumberofRooms = n[1];
            }
            else if(nw.equals("CheckinDate"))
            {
                CheckinDate = n[1];
            }
            else if(nw.equals("CheckoutDate"))
            {
                CheckoutDate = n[1];
            }
            else if(nw.equals("RoomType"))
            {
                RoomType = n[1];
            }
            else if(nw.equals("TotalPrice"))
            {
                TotalPrice = n[1];
            }

            Startdate = (TextView)findViewById(R.id.StartDate);
            Startdate.setText(StartDate);

            Starttime = (TextView)findViewById(R.id.StartTime);
            Starttime.setText(StartTime);

            Hotelname = (TextView)findViewById(R.id.HotelName);
            Hotelname.setText(HotelName);

            Numberofrooms = (TextView)findViewById(R.id.NumberofRooms);
            Numberofrooms.setText(NumberofRooms);

            Checkindate = (TextView)findViewById(R.id.CheckinDate);
            Checkindate.setText(CheckinDate);

            Checkoutdate = (TextView)findViewById(R.id.CheckoutDate);
            Checkoutdate.setText(CheckoutDate);

            Roomtype = (TextView)findViewById(R.id.Roomtype);
            Roomtype.setText(RoomType);

            Totalprice = (TextView)findViewById(R.id.TotalPrice);
            Totalprice.setText(TotalPrice);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}