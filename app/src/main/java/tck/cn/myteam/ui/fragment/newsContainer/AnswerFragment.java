package tck.cn.myteam.ui.fragment.newsContainer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class AnswerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        TextView textView = new TextView(getContext());
        textView.setText("问答");
        return textView;
    }
}
