package com.deppon.crm.module.client.sync.cc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.deppon.crm.module.client.sync.domain.CustTransationOperation.OperationFlg;

public class TCustShuttleaddressOperation implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4023258934636805426L;

	public OperationFlg getOperationFlg() {
		return operationFlg;
	}

	public void setOperationFlg(OperationFlg operationFlg) {
		this.operationFlg = operationFlg;
	}

	private OperationFlg operationFlg;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private BigDecimal fid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATETIME
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private Date fcreatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATEUSERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private BigDecimal fcreateuserid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTUPDATETIME
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private Date flastupdatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTMODIFYUSERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private BigDecimal flastmodifyuserid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESS
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private String faddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FPOSTCODE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private String fpostcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FPROVINCE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private String fprovince;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCITY
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private String fcity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FAREA
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private String farea;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESSTYPE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private String faddresstype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FMEMBERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private BigDecimal fmemberid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FSTATUS
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	private BigDecimal fstatus;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FID
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public BigDecimal getFid() {
		return fid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FID
	 * @param fid  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFid(BigDecimal fid) {
		this.fid = fid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATETIME
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATETIME
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public Date getFcreatetime() {
		return fcreatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATETIME
	 * @param fcreatetime  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATETIME
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFcreatetime(Date fcreatetime) {
		this.fcreatetime = fcreatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATEUSERID
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATEUSERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public BigDecimal getFcreateuserid() {
		return fcreateuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATEUSERID
	 * @param fcreateuserid  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FCREATEUSERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFcreateuserid(BigDecimal fcreateuserid) {
		this.fcreateuserid = fcreateuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTUPDATETIME
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTUPDATETIME
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public Date getFlastupdatetime() {
		return flastupdatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTUPDATETIME
	 * @param flastupdatetime  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTUPDATETIME
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFlastupdatetime(Date flastupdatetime) {
		this.flastupdatetime = flastupdatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTMODIFYUSERID
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTMODIFYUSERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public BigDecimal getFlastmodifyuserid() {
		return flastmodifyuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTMODIFYUSERID
	 * @param flastmodifyuserid  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FLASTMODIFYUSERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFlastmodifyuserid(BigDecimal flastmodifyuserid) {
		this.flastmodifyuserid = flastmodifyuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESS
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESS
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public String getFaddress() {
		return faddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESS
	 * @param faddress  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESS
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FPOSTCODE
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FPOSTCODE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public String getFpostcode() {
		return fpostcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FPOSTCODE
	 * @param fpostcode  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FPOSTCODE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFpostcode(String fpostcode) {
		this.fpostcode = fpostcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FPROVINCE
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FPROVINCE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public String getFprovince() {
		return fprovince;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FPROVINCE
	 * @param fprovince  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FPROVINCE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFprovince(String fprovince) {
		this.fprovince = fprovince;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCITY
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FCITY
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public String getFcity() {
		return fcity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FCITY
	 * @param fcity  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FCITY
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFcity(String fcity) {
		this.fcity = fcity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FAREA
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FAREA
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public String getFarea() {
		return farea;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FAREA
	 * @param farea  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FAREA
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFarea(String farea) {
		this.farea = farea;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESSTYPE
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESSTYPE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public String getFaddresstype() {
		return faddresstype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESSTYPE
	 * @param faddresstype  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FADDRESSTYPE
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFaddresstype(String faddresstype) {
		this.faddresstype = faddresstype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FMEMBERID
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FMEMBERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public BigDecimal getFmemberid() {
		return fmemberid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FMEMBERID
	 * @param fmemberid  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FMEMBERID
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFmemberid(BigDecimal fmemberid) {
		this.fmemberid = fmemberid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FSTATUS
	 * @return  the value of DEVELOP.T_CUST_SHUTTLEADDRESS.FSTATUS
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public BigDecimal getFstatus() {
		return fstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column DEVELOP.T_CUST_SHUTTLEADDRESS.FSTATUS
	 * @param fstatus  the value for DEVELOP.T_CUST_SHUTTLEADDRESS.FSTATUS
	 * @mbggenerated  Mon May 28 16:56:56 CST 2012
	 */
	public void setFstatus(BigDecimal fstatus) {
		this.fstatus = fstatus;
	}

}
