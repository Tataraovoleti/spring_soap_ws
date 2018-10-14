package com.tata.spring.ws.proxies;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-01-17T19:47:43.284+05:30
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://com.tata.hpe", name = "EmployeeDetailsService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EmployeeDetailsService {

    @WebMethod(operationName = "EmployeeDetails")
    @Oneway
    public void employeeDetails(
        @WebParam(partName = "EmployeeDetailsRequest", name = "EmployeeDetailsRequest", targetNamespace = "http://com.tata.hpe")
        EmployeeDetailsRequest employeeDetailsRequest
    );
}