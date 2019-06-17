package com.tachlab.circle;

public class Circle {
	private float radius;
	public BorderColor border;
	
	public BorderColor getBorder() {
		return border;
	}
	public void setBorder(BorderColor border) {
		this.border = border;
	}
	public void setRadius(float radius) {
		this.radius=radius;
	}
	public float getRadius() {
		return this.radius;
	}
	
	public float getArea() {
		return (float) (Math.PI*this.radius*this.radius);
	}
}
