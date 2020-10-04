package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription
 */
public class SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription   {
  private String branchLocationManagementServiceSubscriberReference = null;

  private String branchLocationManagementServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return branchLocationManagementServiceSubscriberReference
  **/

  public String getBranchLocationManagementServiceSubscriberReference() {
    return branchLocationManagementServiceSubscriberReference;
  }

  public void setBranchLocationManagementServiceSubscriberReference(String branchLocationManagementServiceSubscriberReference) {
    this.branchLocationManagementServiceSubscriberReference = branchLocationManagementServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return branchLocationManagementServiceSubscriberAccessProfile
  **/

  public String getBranchLocationManagementServiceSubscriberAccessProfile() {
    return branchLocationManagementServiceSubscriberAccessProfile;
  }

  public void setBranchLocationManagementServiceSubscriberAccessProfile(String branchLocationManagementServiceSubscriberAccessProfile) {
    this.branchLocationManagementServiceSubscriberAccessProfile = branchLocationManagementServiceSubscriberAccessProfile;
  }


}

