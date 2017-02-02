package task3.hasmukhi.admin.task3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */

public class FragmentTwo extends Fragment {

    private Button btnb;
    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_two, container, false);
        btnb =(Button)view.findViewById(R.id.btn_goto_a);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentOne=new FragmentOne();
                getFragmentManager().beginTransaction()
                        .replace(R.id.ll_layout,fragmentOne)
                        .addToBackStack("")
                        .commit();
                        getFragmentManager().popBackStack();
            }
        });
        return view;
    }

}
