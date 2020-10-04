package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecordBranchLocationManagementServicePoliciesandGuidelines
 */
public class SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecordBranchLocationManagementServicePoliciesandGuidelines   {
  private String branchLocationManagementServiceEligibility = null;

  private String branchLocationManagementServiceIntendedUses = null;

  private String branchLocationManagementServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return branchLocationManagementServiceEligibility
  **/

  public String getBranchLocationManagementServiceEligibility() {
    return branchLocationManagementServiceEligibility;
  }

  public void setBranchLocationManagementServiceEligibility(String branchLocationManagementServiceEligibility) {
    this.branchLocationManagementServiceEligibility = branchLocationManagementServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return branchLocationManagementServiceIntendedUses
  **/

  public String getBranchLocationManagementServiceIntendedUses() {
    return branchLocationManagementServiceIntendedUses;
  }

  public void setBranchLocationManagementServiceIntendedUses(String branchLocationManagementServiceIntendedUses) {
    this.branchLocationManagementServiceIntendedUses = branchLocationManagementServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return branchLocationManagementServicePricingandTerms
  **/

  public String getBranchLocationManagementServicePricingandTerms() {
    return branchLocationManagementServicePricingandTerms;
  }

  public void setBranchLocationManagementServicePricingandTerms(String branchLocationManagementServicePricingandTerms) {
    this.branchLocationManagementServicePricingandTerms = branchLocationManagementServicePricingandTerms;
  }


}

