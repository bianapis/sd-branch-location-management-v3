package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceReport
 */
public class BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceReport   {
  private String productandServicePlanningInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productandServicePlanningInstanceReportReference
  **/

  public String getProductandServicePlanningInstanceReportReference() {
    return productandServicePlanningInstanceReportReference;
  }

  public void setProductandServicePlanningInstanceReportReference(String productandServicePlanningInstanceReportReference) {
    this.productandServicePlanningInstanceReportReference = productandServicePlanningInstanceReportReference;
  }


}

