package com.techlabs.test_class;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techlabs.exception.MarkerAlreadyAssignedException;
import com.techlabs.game.Cell;
import com.techlabs.game.Marker;

public class CellTest {

	
//	@Test
//	public void getMarkerWhenMarkerIsEmpty() {
//		assertTrue(new Cell(0, 0).getMarker().equals(Marker.EMPTY));
//	}
//
//	@Test(expected = MarkerAlreadyAssignedException.class)
//	public void setMarkerWhenMarkerNotEmpty() {
//		new Cell(0, 0).setMarker(Marker.O);
//		new Cell(0, 0).setMarker(Marker.X);
//	}
	
	@Test
	public void getMarkerWhenMarkerIsMarked()
	{
		Cell c1=new Cell();
		c1.setMarker(Marker.O);
		Marker expected = Marker.O;
		Marker actual=c1.getMarker();
		assertEquals(expected, actual);
	}

	@Test
	public void checkCellWhenMarkerIsEmpty()
	{
		Cell c2=new Cell();
		c2.setMarker(Marker.EMPTY);
		Marker m2=c2.getMarker();
		assertFalse(!m2.equals(Marker.EMPTY));
	}
	
	@Test
	public void checkCellIfCellAlreadyMarked()
	{
		Cell c3=new Cell();
		c3.setMarker(Marker.X);
		Marker m3=c3.getMarker();
		assertTrue(!m3.equals(Marker.EMPTY));
	}
	
	@Test
	public void retriveMarkXIfMarkSetIsX()
	{
		Cell c4=new Cell();
		c4.setMarker(Marker.X);
		Marker m4=c4.getMarker();
		assertEquals(m4,Marker.X);
	}
	
	@Test
	public void retriveMarkOIfMarkSetIsO()
	{
		Cell c5=new Cell();
		c5.setMarker(Marker.X);
		Marker m5=c5.getMarker();
		assertEquals(m5,Marker.X);
	}
	
	@Test(expected = MarkerAlreadyAssignedException.class)
	public void setMarkWhenMarkerAlreadyAssigned()
	{
		Cell c5=new Cell();
		c5.setMarker(Marker.O);
		c5.setMarker(Marker.X);
	}
	
}
