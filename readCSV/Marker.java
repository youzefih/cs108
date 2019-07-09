import java.util.ArrayList;

public class Marker {
	public String getIdentificationString() {
		return "Program 9b, Youssef Iraqi";
	}

	protected String description;
	protected String iconLabel;
	protected String iconUrl;
	protected GeoLocation loc;
	protected String name;
	private boolean hasLocation;
	private boolean hasIconUrl;

	public Marker() {
		super();
		this.description = "";
		this.iconLabel = "";
		this.iconUrl = "";
		this.loc = null;
		this.name = "";
		this.hasLocation = false;
		this.hasIconUrl = false;
	}

	public Marker(boolean loc , boolean url) {
		super();
		this.description = "";
		this.iconLabel = "";
		this.iconUrl = "";
		this.loc = new GeoLocation();
		this.name = "";
		this.hasLocation = loc;
		this.hasIconUrl = url;

	}

	public String getDescription() {
		return description;

	}

	public String getIconLabel() {
		return iconLabel;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public double getLatitude() {
		return this.loc.getLatitude();
	}

	public double getLongitude() {
		return this.loc.getLongitude();
	}

	public String getName() {
		return name;
	}

	public boolean hasGeoLocation() {
		return this.hasLocation;
	}

	public boolean hasIconUrl() {
		return this.hasIconUrl;
	}

	boolean fillMarker(ArrayList<String> values) {
		if (!hasLocation) {
			this.name = values.get(0);
			this.description = values.get(1);
		} else {
			this.setLatitude(values.get(0));
			this.setLongitude(values.get(1));
			this.description = values.get(2);
		}
		if (hasIconUrl) {
			this.iconLabel = values.get(3);
			this.iconUrl = values.get(4);
		}
		return true;
	}

	public void setDescription(String description) {
		this.description = description;

	}

	public void setIconLabel(String iconLabel) {
		this.iconLabel = iconLabel;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public void setLatitude(double lat) {
		this.loc.setLatitude(lat);
	}

	public void setLatitude(String lat) {
		this.loc.setLatitude(Double.parseDouble(lat));

	}

	public void setLongitude(double lon) {
		this.loc.setLongitude(lon);
	}

	public void setLongitude(String lon) {
		this.loc.setLongitude(Double.parseDouble(lon));
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return (hasLocation ? loc.getLatitude() + ", " + loc.getLongitude() : name) + ", " + description
				+ (!iconUrl.isEmpty() ? ", " + iconLabel + ", " + iconUrl : "");
	}

	public static void main(String[] args) {
		Marker m = new Marker();
		System.out.println(m);
		Marker m3 = new Marker(true, false);
		System.out.println(m3);
		Marker m5 = new Marker(true, true);
		System.out.println(m5);
	}

}
