package atl.phillython;

import java.util.ArrayList;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class PathTracker {
	static ArrayList<LatLng> points = new ArrayList<LatLng>();
	static ArrayList<PointOfInterest> pois = new ArrayList<PointOfInterest>();
	
	
	public static void firstPoint(LatLng firstPoint, GoogleMap gmap) {
		points.add(firstPoint);
	}
	
	public static void updatePoints(LatLng newPoint, GoogleMap gmap) {
		points.add(newPoint);
		PolylineOptions polylineOptions = new PolylineOptions();
		polylineOptions.addAll(points);
		Polyline route = gmap.addPolyline(polylineOptions);
	}
	
	public static void storePOI(PointOfInterest poi) {
		pois.add(poi);
	}
	
	public static ArrayList<PointOfInterest> getPassedPOIs() {
		return pois;
	}
	
}
