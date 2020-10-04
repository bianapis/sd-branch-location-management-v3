package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecordBranchLocationManagementServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord
 */
public class SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord   {
  private String branchLocationManagementServiceType = null;

  private String branchLocationManagementServiceVersion = null;

  private String branchLocationManagementServiceDescription = null;

  private SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecordBranchLocationManagementServicePoliciesandGuidelines branchLocationManagementServicePoliciesandGuidelines = null;

  private String branchLocationManagementServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return branchLocationManagementServiceType
  **/

  public String getBranchLocationManagementServiceType() {
    return branchLocationManagementServiceType;
  }

  public void setBranchLocationManagementServiceType(String branchLocationManagementServiceType) {
    this.branchLocationManagementServiceType = branchLocationManagementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return branchLocationManagementServiceVersion
  **/

  public String getBranchLocationManagementServiceVersion() {
    return branchLocationManagementServiceVersion;
  }

  public void setBranchLocationManagementServiceVersion(String branchLocationManagementServiceVersion) {
    this.branchLocationManagementServiceVersion = branchLocationManagementServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return branchLocationManagementServiceDescription
  **/

  public String getBranchLocationManagementServiceDescription() {
    return branchLocationManagementServiceDescription;
  }

  public void setBranchLocationManagementServiceDescription(String branchLocationManagementServiceDescription) {
    this.branchLocationManagementServiceDescription = branchLocationManagementServiceDescription;
  }


  /**
   * Get branchLocationManagementServicePoliciesandGuidelines
   * @return branchLocationManagementServicePoliciesandGuidelines
  **/

  public SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecordBranchLocationManagementServicePoliciesandGuidelines getBranchLocationManagementServicePoliciesandGuidelines() {
    return branchLocationManagementServicePoliciesandGuidelines;
  }

  public void setBranchLocationManagementServicePoliciesandGuidelines(SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecordBranchLocationManagementServicePoliciesandGuidelines branchLocationManagementServicePoliciesandGuidelines) {
    this.branchLocationManagementServicePoliciesandGuidelines = branchLocationManagementServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return branchLocationManagementServiceSchedule
  **/

  public String getBranchLocationManagementServiceSchedule() {
    return branchLocationManagementServiceSchedule;
  }

  public void setBranchLocationManagementServiceSchedule(String branchLocationManagementServiceSchedule) {
    this.branchLocationManagementServiceSchedule = branchLocationManagementServiceSchedule;
  }


}

