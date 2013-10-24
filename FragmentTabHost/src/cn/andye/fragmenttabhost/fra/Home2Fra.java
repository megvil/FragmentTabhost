package cn.andye.fragmenttabhost.fra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import cn.andye.fragmenttabhost.R;
/**
 * home2
 * @author andye
 *
 */
public class Home2Fra extends Fragment implements OnClickListener {


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.index_2, null);

		return v;
	}

	@Override
	public void onClick(View v) {
	}

}
