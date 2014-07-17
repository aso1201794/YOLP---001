package jp.ac.st.asojuku.yolp001;

import jp.co.yahoo.android.maps.GeoPoint;
import jp.co.yahoo.android.maps.MapController;
import jp.co.yahoo.android.maps.MapView;
import android.app.Activity;
import android.app.Fragment;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity implements LocationListener {

	
	
	LocationManager mLocationManager = null;
	
	MapView mMapView = null;
	
	int lastLatitube = 0;
	
	int lastLogitude = 0;
	
	
	
	@Override
	public void onLocationChanged(Location location) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment())
					.commit();
		}
	}
	
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		
		mMapView = new MapView(this,"nN1bWVyc2VjcmV0Jng9Mjgdj0zaiZpPTdhZ1hERlB4QU01ViZzPWNvbnN1bWVyc2VjcmV0Jng9Mjg-");
		mMapView.setBuiltInZoomControls(true);
		mMapView.setScalebar(true);
		
		double lat = 35.658516;
		double lon = 133.701773;
		GeoPoint gp = new GeoPoint((int)(lat * 1000000), (int)(lon * 1000000));
		
		MapController c = mMapView.getMapController();
		
		c.setCenter(gp);
		c.setZoom(3);
		setContentView(mMapView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}

}
