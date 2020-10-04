package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceAnalysis;
import org.bian.dto.BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningRetrieveInputModel
 */
public class BQProductandServicePlanningRetrieveInputModel   {
  private Object productandServicePlanningRetrieveActionTaskRecord = null;

  private String productandServicePlanningRetrieveActionRequest = null;

  private BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceReport productandServicePlanningInstanceReport = null;

  private BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceAnalysis productandServicePlanningInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productandServicePlanningRetrieveActionTaskRecord
  **/

  public Object getProductandServicePlanningRetrieveActionTaskRecord() {
    return productandServicePlanningRetrieveActionTaskRecord;
  }

  public void setProductandServicePlanningRetrieveActionTaskRecord(Object productandServicePlanningRetrieveActionTaskRecord) {
    this.productandServicePlanningRetrieveActionTaskRecord = productandServicePlanningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productandServicePlanningRetrieveActionRequest
  **/

  public String getProductandServicePlanningRetrieveActionRequest() {
    return productandServicePlanningRetrieveActionRequest;
  }

  public void setProductandServicePlanningRetrieveActionRequest(String productandServicePlanningRetrieveActionRequest) {
    this.productandServicePlanningRetrieveActionRequest = productandServicePlanningRetrieveActionRequest;
  }


  /**
   * Get productandServicePlanningInstanceReport
   * @return productandServicePlanningInstanceReport
  **/

  public BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceReport getProductandServicePlanningInstanceReport() {
    return productandServicePlanningInstanceReport;
  }

  public void setProductandServicePlanningInstanceReport(BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceReport productandServicePlanningInstanceReport) {
    this.productandServicePlanningInstanceReport = productandServicePlanningInstanceReport;
  }


  /**
   * Get productandServicePlanningInstanceAnalysis
   * @return productandServicePlanningInstanceAnalysis
  **/

  public BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceAnalysis getProductandServicePlanningInstanceAnalysis() {
    return productandServicePlanningInstanceAnalysis;
  }

  public void setProductandServicePlanningInstanceAnalysis(BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceAnalysis productandServicePlanningInstanceAnalysis) {
    this.productandServicePlanningInstanceAnalysis = productandServicePlanningInstanceAnalysis;
  }


}

