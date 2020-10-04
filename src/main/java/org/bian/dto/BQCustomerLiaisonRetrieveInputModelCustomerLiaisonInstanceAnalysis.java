package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonRetrieveInputModelCustomerLiaisonInstanceAnalysis
 */
public class BQCustomerLiaisonRetrieveInputModelCustomerLiaisonInstanceAnalysis   {
  private String customerLiaisonInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerLiaisonInstanceAnalysisReference
  **/

  public String getCustomerLiaisonInstanceAnalysisReference() {
    return customerLiaisonInstanceAnalysisReference;
  }

  public void setCustomerLiaisonInstanceAnalysisReference(String customerLiaisonInstanceAnalysisReference) {
    this.customerLiaisonInstanceAnalysisReference = customerLiaisonInstanceAnalysisReference;
  }


}

