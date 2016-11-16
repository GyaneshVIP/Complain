package com.example.andy.complain.uis;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.andy.complain.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddComplain extends Fragment {

    private String word,categoryName,countryName;

    Button submit;
    TextView confirmation;
    Spinner cat,cntry;
   // Firebase myFirebaseRef;
    private String[] urlList;
    String[] words={"a","b","c","d","e"
            ,"f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","y","z","1"};
    String[] categoryList={"-------Select Category-------","Airlines",
            "Banks",
            "Credit",
            "Cards",
            "Insurance",
            "Loans",
            "Stock Market",
            "Tax Service",
            "Car Dealers",
            "Car Driving Schools",
            "Car Rentals",
            "Car Service Centers",
            "Cars,Vans & SUVS",
            "Gas Stations",
            "Motorcycles & Scooters",
            "Clothing Shoes & Accessories",
            "Computers & Accessories",
            "Computer Software",
            "Desktop Computers",
            "Laptops /Notebooks",
            "Insitutes",
            "Schools",
            "Universities",
            "Digital Cameras",
            "Mobile HandSets",
            "Printers",
            "Refigrators",
            "TVs",
            "Washing Machines",
            "Water Heaters and Geysers",
            "Amusement Parks",
            "Cinema",
            "Clubs,Bars,Resturants",
            "Movie Rentals",
            "Neighbours",
            "Online Dating Serices",
            "Sexual Abuse",
            "Food",
            "Government Organizations",
            "Citizenships and Immigrations",
            "Municipal Corporation",
            "Passport Services",
            "Police",
            "Postal and Delivery Services",
            "Cosmetics",
            "Dental Services",
            "Doctors",
            "Hair & Beauty Salons",
            "Health and Life Insurances",
            "Hospitals",
            "Pharmacy",
            "Plastic Surgery",
            "Weight Loss Products",
            "Appliances",
            "Furniture",
            "Utility Services",
            "Broadband",
            "Hosting & Web Design",
            "Lottery & Sweepstake Emails",
            "Online Games",
            "Online Shopping",
            "Jewelery and Watches",
            "Employees",
            "Employers",
            "Work at Home,Part Time Jobs",
            "Kids and Baby",
            "Law and Civils",
            "Lawyers and Attorney",
            "Magzines and Newspapers",
            "Movement and Delivery",
            "Nature adn Environment",
            "News and Media",
            "Other",
            "Pets and Amimal",
            "Security Services",
            "Airlines",
            "Railways",
            "Taxi",
            "Real States",
            "Building Developers",
            "House,Apartment Rental",
            "Fast Food Resturants",
            "Society and Culture",
            "Fitness Centers",
            "Landline & Home Phone Provider",
            "Mobile Services Providers",
            "Airlines",
            "Travel Agents",
            "Unauthorized charges",
            "Unsolicited Phone Calls",
            "Wedding Services"
    };

    ArrayAdapter<String> categoryspinner,countryAdapters;


    public AddComplain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_complain, container, false);

        //edit text which get user company name
        EditText compName=(EditText)view.findViewById(R.id.et_complain_companyName);

        //edit text to get complain subject
        EditText compSubject=(EditText)view.findViewById(R.id.et_complain_complainSubject);

        //edit text to get complain details
        EditText compDetails=(EditText)view.findViewById(R.id.et_complain_complianDetails);

        //edit text to get zip code details
        EditText zipCode=(EditText)view.findViewById(R.id.et_complain_zipCode);

        //edit text to get website details
        EditText website=(EditText)view.findViewById(R.id.et_complain_website);

        //edit text to get confirmation
        EditText confirmation=(EditText)view.findViewById(R.id.et_complain_confirmation);

        //Initializing the button for click listener for submiting complain
        Button submitComplain=(Button)view.findViewById(R.id.btn_complain_submit);



             //   cmpsubject,cmpdetails,zip,city,website,confircode;

        submitComplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });







        return view;
    }

}
