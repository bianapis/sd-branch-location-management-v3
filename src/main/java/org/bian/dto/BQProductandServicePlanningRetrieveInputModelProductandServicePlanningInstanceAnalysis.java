package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceAnalysis
 */
public class BQProductandServicePlanningRetrieveInputModelProductandServicePlanningInstanceAnalysis   {
  private String productandServicePlanningInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productandServicePlanningInstanceAnalysisReference
  **/

  public String getProductandServicePlanningInstanceAnalysisReference() {
    return productandServicePlanningInstanceAnalysisReference;
  }

  public void setProductandServicePlanningInstanceAnalysisReference(String productandServicePlanningInstanceAnalysisReference) {
    this.productandServicePlanningInstanceAnalysisReference = productandServicePlanningInstanceAnalysisReference;
  }


}

