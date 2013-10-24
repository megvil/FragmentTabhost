package cn.andye.fragmenttabhost;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import cn.andye.fragmenttabhost.fra.Home1Fra;
import cn.andye.fragmenttabhost.fra.Home2Fra;
import cn.andye.fragmenttabhost.fra.Home3Fra;
import cn.andye.fragmenttabhost.fra.SettingFra;
/**
 * fragment 的切换类
 * @author andye
 *
 */
public class MainActivity extends FragmentActivity implements OnClickListener {

	private ImageView mBt1, mBt2, mBt3, mBt4;
	private ImageView mSelBg;
	private LinearLayout mTab_item_container;
	private FragmentManager mFM = null;

	
	LinearLayout content_container, content_container2;

	Intent m_Intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		init();

		changePerson();
	}

	private void init() {
		mTab_item_container = (LinearLayout) findViewById(R.id.tab_item_container);

		mBt1 = (ImageView) findViewById(R.id.tab_bt_1);
		mBt2 = (ImageView) findViewById(R.id.tab_bt_2);
		mBt3 = (ImageView) findViewById(R.id.tab_bt_3);
		mBt4 = (ImageView) findViewById(R.id.tab_bt_4);

		mBt1.setOnClickListener(this);
		mBt2.setOnClickListener(this);
		mBt3.setOnClickListener(this);
		mBt4.setOnClickListener(this);

		mSelBg = (ImageView) findViewById(R.id.tab_bg_view);
		content_container = (LinearLayout) findViewById(R.id.content_container);
		content_container2 = (LinearLayout) findViewById(R.id.content_container2);
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);

		LayoutParams lp = mSelBg.getLayoutParams();
		lp.width = mTab_item_container.getWidth() / 4;
	}

	private int mSelectIndex = 0;
	private View last, now;
	View v1, v2;

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.tab_bt_1:
			last = mTab_item_container.getChildAt(mSelectIndex);
			now = mTab_item_container.getChildAt(0);
			startAnimation(last, now);
			mSelectIndex = 0;

			changePerson();
			break;
		case R.id.tab_bt_2:
			last = mTab_item_container.getChildAt(mSelectIndex);
			now = mTab_item_container.getChildAt(1);
			startAnimation(last, now);
			mSelectIndex = 1;

			changeBussiness();
			break;
		case R.id.tab_bt_3:
			last = mTab_item_container.getChildAt(mSelectIndex);
			now = mTab_item_container.getChildAt(2);
			startAnimation(last, now);
			mSelectIndex = 2;

			changeMessage();
			break;
		case R.id.tab_bt_4:
			last = mTab_item_container.getChildAt(mSelectIndex);
			now = mTab_item_container.getChildAt(3);
			startAnimation(last, now);
			mSelectIndex = 3;

			changeSetting();
			break;
		default:
			break;
		}
	}

	private void startAnimation(View last, View now) {
		TranslateAnimation ta = new TranslateAnimation(last.getLeft(),
				now.getLeft(), 0, 0);
		ta.setDuration(300);
		ta.setFillAfter(true);
		mSelBg.startAnimation(ta);
	}

	/**
	 * 切换fragement
	 */
	private void changePerson() {
		Fragment f = new Home1Fra();
		if (null == mFM)
			mFM = getSupportFragmentManager();
		FragmentTransaction ft = mFM.beginTransaction();
		ft.replace(R.id.content_container, f);
		ft.commit();
	}

	/**
	 * 切换fragement
	 */
	public void changeBussiness() {
		Fragment f = new Home2Fra();
		if (null == mFM)
			mFM = getSupportFragmentManager();
		FragmentTransaction ft = mFM.beginTransaction();
		ft.replace(R.id.content_container, f);
		ft.commit();
	}

	/**
	 * 切换fragement
	 */
	public void changeMessage() {
		Fragment f = new Home3Fra();
		if (null == mFM)
			mFM = getSupportFragmentManager();
		FragmentTransaction ft = mFM.beginTransaction();
		ft.replace(R.id.content_container, f);
		ft.commit();
	}

	/**
	 * 切换fragement
	 */
	public void changeSetting() {
		Fragment f = new SettingFra();
		if (null == mFM)
			mFM = getSupportFragmentManager();
		FragmentTransaction ft = mFM.beginTransaction();
		ft.replace(R.id.content_container, f);
		ft.commit();
	}

	private static Boolean isQuit = false;
	private Timer timer = new Timer();

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if (isQuit == false) {
				isQuit = true;
				Toast.makeText(getBaseContext(), "再次点击确定退出软件",
						Toast.LENGTH_SHORT).show();
				TimerTask task = null;
				task = new TimerTask() {
					@Override
					public void run() {
						isQuit = false;
					}
				};
				timer.schedule(task, 2000);
			} else {
				finish();
			}
		} else {
		}
		return false;
	}

}
