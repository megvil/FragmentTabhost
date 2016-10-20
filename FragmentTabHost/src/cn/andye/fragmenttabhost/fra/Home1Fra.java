package cn.andye.fragmenttabhost.fra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import cn.andye.fragmenttabhost.R;

/**
 * home1
 * 
 * @author andye
 * 
 */
public class Home1Fra extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.index_1, null);
		init(v);

		return v;
	}

	private void init(View v) {

		// headerIV = (ImageView) v.findViewById(R.id.person2_header_iv);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// case R.id.person2_shopping: // °´Å¥²Ù×÷
		// break;
		default:
			break;
		}
	}

}
