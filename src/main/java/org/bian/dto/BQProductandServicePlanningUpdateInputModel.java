package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningUpdateInputModel
 */
public class BQProductandServicePlanningUpdateInputModel   {
  private String branchLocationManagementPlanInstanceReference = null;

  private String productandServicePlanningInstanceReference = null;

  private Object productandServicePlanningUpdateActionTaskRecord = null;

  private String productandServicePlanningUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product and Service Planning instance 
   * @return productandServicePlanningInstanceReference
  **/

  public String getProductandServicePlanningInstanceReference() {
    return productandServicePlanningInstanceReference;
  }

  public void setProductandServicePlanningInstanceReference(String productandServicePlanningInstanceReference) {
    this.productandServicePlanningInstanceReference = productandServicePlanningInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productandServicePlanningUpdateActionTaskRecord
  **/

  public Object getProductandServicePlanningUpdateActionTaskRecord() {
    return productandServicePlanningUpdateActionTaskRecord;
  }

  public void setProductandServicePlanningUpdateActionTaskRecord(Object productandServicePlanningUpdateActionTaskRecord) {
    this.productandServicePlanningUpdateActionTaskRecord = productandServicePlanningUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productandServicePlanningUpdateActionRequest
  **/

  public String getProductandServicePlanningUpdateActionRequest() {
    return productandServicePlanningUpdateActionRequest;
  }

  public void setProductandServicePlanningUpdateActionRequest(String productandServicePlanningUpdateActionRequest) {
    this.productandServicePlanningUpdateActionRequest = productandServicePlanningUpdateActionRequest;
  }


}

