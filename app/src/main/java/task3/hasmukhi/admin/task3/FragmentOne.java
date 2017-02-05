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
public class FragmentOne extends Fragment {

    private Button btna;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_one, container, false);
        btna = (Button)view.findViewById(R.id.btn_goto_b);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragmentTwo=new FragmentTwo();
                FragmentManager fm=  getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.ll_layout,fragmentTwo);
                ft.addToBackStack("");
                ft.commit();
               // getFragmentManager().popBackStack();
            }
        });
        return view;
    }

}
