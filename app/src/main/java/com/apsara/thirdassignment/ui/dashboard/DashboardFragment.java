package com.apsara.thirdassignment.ui.dashboard;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.apsara.thirdassignment.R;

public class DashboardFragment extends Fragment implements View.OnClickListener {
    private Button btnSave;
    private EditText etFName, etAge;
    private EditText etAddress;
   // private TextView txtSG;
    private RadioButton rdMale, rdFemale, rdOthers;
    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        etFName = view.findViewById(R.id.etFName);
        etAge = view.findViewById(R.id.etAge);
        etAddress=view.findViewById(R.id.etAddress);
        //txtSG = view.findViewById(R.id.txtSG);
        rdMale = view.findViewById(R.id.rdMale);
        rdFemale = view.findViewById(R.id.rdFemale);
        rdOthers = view.findViewById(R.id.rdOthers);
        btnSave = view.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etFName.getText())) {
            etFName.setError("Please enter your full name");
            etFName.requestFocus();
            return;
        } else if (TextUtils.isEmpty(etAge.getText())) {
            etAge.setError("Please enter your age");
            etAge.requestFocus();
            return;
        } else if (TextUtils.isEmpty(etAddress.getText())) {
            etAddress.setError("Please enter your full address");
            etAddress.requestFocus();
            return;
        }

    }
}