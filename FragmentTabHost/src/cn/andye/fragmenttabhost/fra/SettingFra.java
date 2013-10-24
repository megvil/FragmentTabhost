package cn.andye.fragmenttabhost.fra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.andye.fragmenttabhost.R;

/**
 * 设置界面
 * 
 * @author andye
 * 
 */
public class SettingFra extends Fragment implements OnClickListener {
	private View v;

	// private String id;
	// private RelativeLayout main_bg;
	// private RelativeLayout title_bg;
	// private TextView mTV_Pwd;
	// private TextView mTV_version;
	// private TextView mTV_help, mTV_theme;
	// private TextView setting_list_about;
	// private Button mB_exit;
	// private LinearLayout themeLL;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.setting, null);
		init(v);

		return v;
	}

	private void init(View v) {
		// main_bg = (RelativeLayout) v.findViewById(R.id.setting_bg);
		// title_bg = (RelativeLayout) v.findViewById(R.id.title_setting);
		// mTV_version = (TextView) v.findViewById(R.id.setting_list_version);
		// mTV_help = (TextView) v.findViewById(R.id.setting_list_help);
		// setting_list_about = (TextView)
		// v.findViewById(R.id.setting_list_about);
		// mB_exit.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// switch (v.getId()) {
		// case R.id.setting_list_version:// 版本说明
		// break;
		// case R.id.setting_list_about:// 关于
		//
		// break;
		// case R.id.setting_list_help:// 帮助中心
		// break;
		//
		// case R.id.setting_exit:
		//
		// break;
		// default:
		// break;
		// }
	}

}
