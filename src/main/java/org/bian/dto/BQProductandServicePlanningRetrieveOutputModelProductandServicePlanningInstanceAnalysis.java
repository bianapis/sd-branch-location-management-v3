package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningRetrieveOutputModelProductandServicePlanningInstanceAnalysis
 */
public class BQProductandServicePlanningRetrieveOutputModelProductandServicePlanningInstanceAnalysis   {
  private Object productandServicePlanningInstanceAnalysisRecord = null;

  private String productandServicePlanningInstanceAnalysisReportType = null;

  private String productandServicePlanningInstanceAnalysisParameters = null;

  private Object productandServicePlanningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productandServicePlanningInstanceAnalysisRecord
  **/

  public Object getProductandServicePlanningInstanceAnalysisRecord() {
    return productandServicePlanningInstanceAnalysisRecord;
  }

  public void setProductandServicePlanningInstanceAnalysisRecord(Object productandServicePlanningInstanceAnalysisRecord) {
    this.productandServicePlanningInstanceAnalysisRecord = productandServicePlanningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productandServicePlanningInstanceAnalysisReportType
  **/

  public String getProductandServicePlanningInstanceAnalysisReportType() {
    return productandServicePlanningInstanceAnalysisReportType;
  }

  public void setProductandServicePlanningInstanceAnalysisReportType(String productandServicePlanningInstanceAnalysisReportType) {
    this.productandServicePlanningInstanceAnalysisReportType = productandServicePlanningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productandServicePlanningInstanceAnalysisParameters
  **/

  public String getProductandServicePlanningInstanceAnalysisParameters() {
    return productandServicePlanningInstanceAnalysisParameters;
  }

  public void setProductandServicePlanningInstanceAnalysisParameters(String productandServicePlanningInstanceAnalysisParameters) {
    this.productandServicePlanningInstanceAnalysisParameters = productandServicePlanningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productandServicePlanningInstanceAnalysisReport
  **/

  public Object getProductandServicePlanningInstanceAnalysisReport() {
    return productandServicePlanningInstanceAnalysisReport;
  }

  public void setProductandServicePlanningInstanceAnalysisReport(Object productandServicePlanningInstanceAnalysisReport) {
    this.productandServicePlanningInstanceAnalysisReport = productandServicePlanningInstanceAnalysisReport;
  }


}

