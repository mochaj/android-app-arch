package com.app.arch.svc;

import java.util.HashMap;

import android.database.CursorWindow;
import android.os.Parcel;
import android.os.Parcelable;

public class AppCursor implements Parcelable {

    private CursorWindow mCursorWindow;

    private HashMap<String, Integer> mProjectionMap = new HashMap<String, Integer>();

    public AppCursor(CursorWindow cursorWindow) {
        mCursorWindow = cursorWindow;
    }

    public AppCursor(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public void readFromParcel(Parcel source) {
    }

    public static final Parcelable.Creator<AppCursor> CREATOR = new Parcelable.Creator<AppCursor>() {

        @Override
        public AppCursor createFromParcel(Parcel source) {
            return new AppCursor(source);
        }

        @Override
        public AppCursor[] newArray(int size) {
            return new AppCursor[size];
        }
    };
}
