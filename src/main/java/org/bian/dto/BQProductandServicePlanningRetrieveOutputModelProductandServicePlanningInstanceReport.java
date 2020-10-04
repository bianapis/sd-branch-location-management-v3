package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningRetrieveOutputModelProductandServicePlanningInstanceReport
 */
public class BQProductandServicePlanningRetrieveOutputModelProductandServicePlanningInstanceReport   {
  private Object productandServicePlanningInstanceReportRecord = null;

  private String productandServicePlanningInstanceReportType = null;

  private String productandServicePlanningInstanceReportParameters = null;

  private Object productandServicePlanningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productandServicePlanningInstanceReportRecord
  **/

  public Object getProductandServicePlanningInstanceReportRecord() {
    return productandServicePlanningInstanceReportRecord;
  }

  public void setProductandServicePlanningInstanceReportRecord(Object productandServicePlanningInstanceReportRecord) {
    this.productandServicePlanningInstanceReportRecord = productandServicePlanningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productandServicePlanningInstanceReportType
  **/

  public String getProductandServicePlanningInstanceReportType() {
    return productandServicePlanningInstanceReportType;
  }

  public void setProductandServicePlanningInstanceReportType(String productandServicePlanningInstanceReportType) {
    this.productandServicePlanningInstanceReportType = productandServicePlanningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productandServicePlanningInstanceReportParameters
  **/

  public String getProductandServicePlanningInstanceReportParameters() {
    return productandServicePlanningInstanceReportParameters;
  }

  public void setProductandServicePlanningInstanceReportParameters(String productandServicePlanningInstanceReportParameters) {
    this.productandServicePlanningInstanceReportParameters = productandServicePlanningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productandServicePlanningInstanceReport
  **/

  public Object getProductandServicePlanningInstanceReport() {
    return productandServicePlanningInstanceReport;
  }

  public void setProductandServicePlanningInstanceReport(Object productandServicePlanningInstanceReport) {
    this.productandServicePlanningInstanceReport = productandServicePlanningInstanceReport;
  }


}

