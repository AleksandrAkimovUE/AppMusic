package umu.tds.apps.AppMusic.model;

import umu.tds.apps.AppMusic.NotImplementedExcepcion;

public abstract class Discount {
	private int discount;
	
	protected int calculateDiscount() throws Exception {
		throw new NotImplementedExcepcion();
	}
}
