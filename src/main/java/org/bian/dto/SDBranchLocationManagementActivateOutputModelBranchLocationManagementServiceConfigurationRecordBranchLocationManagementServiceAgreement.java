package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement
 */
public class SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement   {
  private String branchLocationManagementServiceAgreementReference = null;

  private String branchLocationManagementServiceUserReference = null;

  private String branchLocationManagementServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return branchLocationManagementServiceAgreementReference
  **/

  public String getBranchLocationManagementServiceAgreementReference() {
    return branchLocationManagementServiceAgreementReference;
  }

  public void setBranchLocationManagementServiceAgreementReference(String branchLocationManagementServiceAgreementReference) {
    this.branchLocationManagementServiceAgreementReference = branchLocationManagementServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return branchLocationManagementServiceUserReference
  **/

  public String getBranchLocationManagementServiceUserReference() {
    return branchLocationManagementServiceUserReference;
  }

  public void setBranchLocationManagementServiceUserReference(String branchLocationManagementServiceUserReference) {
    this.branchLocationManagementServiceUserReference = branchLocationManagementServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return branchLocationManagementServiceAgreementTermsandConditions
  **/

  public String getBranchLocationManagementServiceAgreementTermsandConditions() {
    return branchLocationManagementServiceAgreementTermsandConditions;
  }

  public void setBranchLocationManagementServiceAgreementTermsandConditions(String branchLocationManagementServiceAgreementTermsandConditions) {
    this.branchLocationManagementServiceAgreementTermsandConditions = branchLocationManagementServiceAgreementTermsandConditions;
  }


}

