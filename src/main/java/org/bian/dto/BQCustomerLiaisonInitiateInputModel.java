package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonInitiateInputModel
 */
public class BQCustomerLiaisonInitiateInputModel   {
  private String branchLocationManagementPlanInstanceReference = null;

  private Object customerLiaisonInitiateActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Branch Location Management Plan instance 
   * @return branchLocationManagementPlanInstanceReference
  **/

  public String getBranchLocationManagementPlanInstanceReference() {
    return branchLocationManagementPlanInstanceReference;
  }

  public void setBranchLocationManagementPlanInstanceReference(String branchLocationManagementPlanInstanceReference) {
    this.branchLocationManagementPlanInstanceReference = branchLocationManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerLiaisonInitiateActionRecord
  **/

  public Object getCustomerLiaisonInitiateActionRecord() {
    return customerLiaisonInitiateActionRecord;
  }

  public void setCustomerLiaisonInitiateActionRecord(Object customerLiaisonInitiateActionRecord) {
    this.customerLiaisonInitiateActionRecord = customerLiaisonInitiateActionRecord;
  }


}

