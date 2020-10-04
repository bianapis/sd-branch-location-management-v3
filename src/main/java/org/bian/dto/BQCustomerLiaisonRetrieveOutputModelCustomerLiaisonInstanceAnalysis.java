package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonRetrieveOutputModelCustomerLiaisonInstanceAnalysis
 */
public class BQCustomerLiaisonRetrieveOutputModelCustomerLiaisonInstanceAnalysis   {
  private Object customerLiaisonInstanceAnalysisRecord = null;

  private String customerLiaisonInstanceAnalysisReportType = null;

  private String customerLiaisonInstanceAnalysisParameters = null;

  private Object customerLiaisonInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerLiaisonInstanceAnalysisRecord
  **/

  public Object getCustomerLiaisonInstanceAnalysisRecord() {
    return customerLiaisonInstanceAnalysisRecord;
  }

  public void setCustomerLiaisonInstanceAnalysisRecord(Object customerLiaisonInstanceAnalysisRecord) {
    this.customerLiaisonInstanceAnalysisRecord = customerLiaisonInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerLiaisonInstanceAnalysisReportType
  **/

  public String getCustomerLiaisonInstanceAnalysisReportType() {
    return customerLiaisonInstanceAnalysisReportType;
  }

  public void setCustomerLiaisonInstanceAnalysisReportType(String customerLiaisonInstanceAnalysisReportType) {
    this.customerLiaisonInstanceAnalysisReportType = customerLiaisonInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerLiaisonInstanceAnalysisParameters
  **/

  public String getCustomerLiaisonInstanceAnalysisParameters() {
    return customerLiaisonInstanceAnalysisParameters;
  }

  public void setCustomerLiaisonInstanceAnalysisParameters(String customerLiaisonInstanceAnalysisParameters) {
    this.customerLiaisonInstanceAnalysisParameters = customerLiaisonInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerLiaisonInstanceAnalysisReport
  **/

  public Object getCustomerLiaisonInstanceAnalysisReport() {
    return customerLiaisonInstanceAnalysisReport;
  }

  public void setCustomerLiaisonInstanceAnalysisReport(Object customerLiaisonInstanceAnalysisReport) {
    this.customerLiaisonInstanceAnalysisReport = customerLiaisonInstanceAnalysisReport;
  }


}

