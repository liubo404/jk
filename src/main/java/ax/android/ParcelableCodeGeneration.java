package ax.android;

import lombok.Data;

/**
 * Created by Thinkpad on 2017/3/30.
 *
 * https://github.com/mcharmas/android-parcelable-intellij-plugin
 *
 * Usage

 Just press ALT + Insert (or your equivalent keybinding for code generation) in your editor and select Parcelable. It allows you to select the fields to be parceled.
 *
 */

@Data
public class ParcelableCodeGeneration  {
    private final String username;
    private final String password;

    /*@Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    public ParcelableCodeGeneration() {
    }

    protected ParcelableCodeGeneration(android.os.Parcel in) {
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final android.os.Parcelable.Creator<ParcelableCodeGeneration> CREATOR = new android.os.Parcelable.Creator<ParcelableCodeGeneration>() {
        @Override
        public ParcelableCodeGeneration createFromParcel(android.os.Parcel source) {
            return new ParcelableCodeGeneration(source);
        }

        @Override
        public ParcelableCodeGeneration[] newArray(int size) {
            return new ParcelableCodeGeneration[size];
        }
    };*/
}
