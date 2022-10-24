package com.example.auto;


import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

    public class Mask implements Parcelable {


        private int ID;
        private String Name;
        private String Power;
        private String Image;


        protected Mask(Parcel in) {
            ID = in.readInt();
            Name = in.readString();
            Power = in.readString();
            Image = in.readString();
        }

        public static final Creator<Mask> CREATOR = new Creator<Mask>() {
            @Override
            public Mask createFromParcel(Parcel in) {
                return new Mask(in);
            }

            @Override
            public Mask[] newArray(int size) {
                return new Mask[size];
            }
        };



        public Mask(int ID, String name, String power, String imge) {
            this.ID = ID;
            Name = name;
            Power = power;
            Image = imge;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(ID);
            dest.writeString(Name);
            dest.writeString(Power);
            dest.writeString(Image);
        }


        public int getID() {
            return ID;
        }

        public String getName() {
            return Name;
        }

        public String getPower() {
            return Power;
        }

        public String getImage() {
            return Image;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setPower(String power) {
            Power = power;
        }

        public void setImage(String image) {
            Image = image;
        }
    }
