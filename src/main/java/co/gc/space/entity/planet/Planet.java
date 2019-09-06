package co.gc.space.entity.planet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {

	private String name;
	private Boolean status;
	private Short discovered;
	private Long mass;
	private Float orbital;
	private Float radius;
	private Float temperature;
	private Long distance;
	private List<String> names;

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Short getDiscovered() {
		return discovered;
	}

	public void setDiscovered(Short discovered) {
		this.discovered = discovered;
	}

	public Long getMass() {
		return mass;
	}

	public void setMass(Long mass) {
		this.mass = mass;
	}

	public Float getOrbital() {
		return orbital;
	}

	public void setOrbital(Float orbital) {
		this.orbital = orbital;
	}

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Long getDistance() {
		return distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", status=" + status + ", discovered=" + discovered + ", mass=" + mass
				+ ", orbital=" + orbital + ", radius=" + radius + ", temperature=" + temperature + ", distance="
				+ distance + ", names=" + names + "]";
	}

}
