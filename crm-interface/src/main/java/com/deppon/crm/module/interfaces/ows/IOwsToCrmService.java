package com.deppon.crm.module.interfaces.ows;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Holder;

import com.deppon.crm.module.interfaces.ows.domain.CommonExceptionInfo_Exception;
import com.deppon.crm.module.interfaces.ows.domain.CreateNewCouponRequest;
import com.deppon.crm.module.interfaces.ows.domain.CreateNewCouponResponse;
import com.deppon.crm.module.interfaces.ows.domain.ESBHeader;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "IOwsToCrmService", targetNamespace = "http://ows.service.interfaces.module.crm.deppon.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IOwsToCrmService {


	/**
	 * 
	 * @param esbHeader
	 * @param createNewCouponRequest
	 * @return returns
	 *         com.deppon.crm.module.interfaces.ows.domain.CreateNewCouponResponse
	 * @throws CommonExceptionInfo_Exception
	 */
	@WebMethod(action = "http://createNewCoupon.ows.service.interfaces.module.crm.deppon.com")
	@WebResult(name = "CreateNewCouponResponse", targetNamespace = "http://www.deppon.com/crm/remote/ows/domain/entity", partName = "CreateNewCouponResponse")
	public CreateNewCouponResponse createNewCoupon(
			@WebParam(name = "esbHeader", targetNamespace = "http://www.deppon.com/esb/header", header = true, mode = WebParam.Mode.INOUT, partName = "esbHeader") Holder<ESBHeader> esbHeader,
			@WebParam(name = "CreateNewCouponRequest", targetNamespace = "http://www.deppon.com/crm/remote/ows/domain/entity", partName = "CreateNewCouponRequest") CreateNewCouponRequest createNewCouponRequest)
			throws CommonExceptionInfo_Exception;


}