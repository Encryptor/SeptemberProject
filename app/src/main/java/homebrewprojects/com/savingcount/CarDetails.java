package homebrewprojects.com.savingcount;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Brian on 8/30/2015.
 */
public class CarDetails extends Fragment {

    public TextView txtMake;
    public TextView txtModel;
    public TextView txtHp;
    public TextView txtZeroToSixty;
    public TextView txtPrice;
    public ImageView imageViewCar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.car_info, container, false);

        Log.d("CarDetails", "lexus onCreateView called");

        txtMake = (TextView) view.findViewById(R.id.txt_make);
        txtModel = (TextView) view.findViewById(R.id.txt_model);
        txtHp = (TextView) view.findViewById(R.id.txt_hp);
        txtZeroToSixty = (TextView) view.findViewById(R.id.txt_zero_sixty);
        txtPrice = (TextView) view.findViewById(R.id.txt_price);
        imageViewCar = (ImageView) view.findViewById(R.id.imageViewCar);

        return view;
    }
}
