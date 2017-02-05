package task3.hasmukhi.admin.task3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment {


    private Button btnc;
    public FragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_three, container, false);
        btnc=(Button) view.findViewById(R.id.btn_goto_back);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentOne=new FragmentOne();
                FragmentManager fm =getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                //ft.replace(R.id.ll_layout,fragmentOne);
                ft.addToBackStack("");
                fm.popBackStack();
                ft.commit();
            }
        });
        return view;
    }

}
