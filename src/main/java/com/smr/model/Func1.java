
package com.smr.model;



import java.io.Serializable;
import java.sql.Date;

/**
 * @author karthy
 *
 */
public class Func1 implements Serializable {
	private  int fld1;
	private  String fld2;

	private Date fld3;

	public int getFld1() {
		return fld1;
	}

	public void setFld1(int fld1) {
		this.fld1 = fld1;
	}

	public String getFld2() {
		return fld2;
	}

	public void setFld2(String fld2) {
		this.fld2 = fld2;
	}

	public Date getFld3() {
		return fld3;
	}

	public void setFld3(Date fld3) {
		this.fld3 = fld3;
	}

	public Func1() {
	}

	public Func1(int fld1, String fld2, Date fld3) {
		this.fld1 = fld1;
		this.fld2 = fld2;
		this.fld3 = fld3;
	}

	@Override
	public String toString() {
		return "fld1:"+fld1+",fld2:"+fld2+",fld3:"+fld3;
	}
}
