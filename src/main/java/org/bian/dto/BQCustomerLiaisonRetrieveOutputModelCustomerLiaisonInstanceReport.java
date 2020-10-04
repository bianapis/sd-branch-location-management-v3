package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonRetrieveOutputModelCustomerLiaisonInstanceReport
 */
public class BQCustomerLiaisonRetrieveOutputModelCustomerLiaisonInstanceReport   {
  private Object customerLiaisonInstanceReportRecord = null;

  private String customerLiaisonInstanceReportType = null;

  private String customerLiaisonInstanceReportParameters = null;

  private Object customerLiaisonInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerLiaisonInstanceReportRecord
  **/

  public Object getCustomerLiaisonInstanceReportRecord() {
    return customerLiaisonInstanceReportRecord;
  }

  public void setCustomerLiaisonInstanceReportRecord(Object customerLiaisonInstanceReportRecord) {
    this.customerLiaisonInstanceReportRecord = customerLiaisonInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerLiaisonInstanceReportType
  **/

  public String getCustomerLiaisonInstanceReportType() {
    return customerLiaisonInstanceReportType;
  }

  public void setCustomerLiaisonInstanceReportType(String customerLiaisonInstanceReportType) {
    this.customerLiaisonInstanceReportType = customerLiaisonInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerLiaisonInstanceReportParameters
  **/

  public String getCustomerLiaisonInstanceReportParameters() {
    return customerLiaisonInstanceReportParameters;
  }

  public void setCustomerLiaisonInstanceReportParameters(String customerLiaisonInstanceReportParameters) {
    this.customerLiaisonInstanceReportParameters = customerLiaisonInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerLiaisonInstanceReport
  **/

  public Object getCustomerLiaisonInstanceReport() {
    return customerLiaisonInstanceReport;
  }

  public void setCustomerLiaisonInstanceReport(Object customerLiaisonInstanceReport) {
    this.customerLiaisonInstanceReport = customerLiaisonInstanceReport;
  }


}

