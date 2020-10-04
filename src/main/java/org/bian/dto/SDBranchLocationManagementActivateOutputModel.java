package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementActivateOutputModel
 */
public class SDBranchLocationManagementActivateOutputModel   {
  private String branchLocationManagementActivationActionTaskReference = null;

  private Object branchLocationManagementActivationActionTaskRecord = null;

  private String branchLocationManagementServicingSessionReference = null;

  private Object branchLocationManagementServicingSessionRecord = null;

  private SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord = null;

  private String branchLocationManagementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return branchLocationManagementActivationActionTaskReference
  **/

  public String getBranchLocationManagementActivationActionTaskReference() {
    return branchLocationManagementActivationActionTaskReference;
  }

  public void setBranchLocationManagementActivationActionTaskReference(String branchLocationManagementActivationActionTaskReference) {
    this.branchLocationManagementActivationActionTaskReference = branchLocationManagementActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return branchLocationManagementActivationActionTaskRecord
  **/

  public Object getBranchLocationManagementActivationActionTaskRecord() {
    return branchLocationManagementActivationActionTaskRecord;
  }

  public void setBranchLocationManagementActivationActionTaskRecord(Object branchLocationManagementActivationActionTaskRecord) {
    this.branchLocationManagementActivationActionTaskRecord = branchLocationManagementActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchLocationManagementServicingSessionReference
  **/

  public String getBranchLocationManagementServicingSessionReference() {
    return branchLocationManagementServicingSessionReference;
  }

  public void setBranchLocationManagementServicingSessionReference(String branchLocationManagementServicingSessionReference) {
    this.branchLocationManagementServicingSessionReference = branchLocationManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return branchLocationManagementServicingSessionRecord
  **/

  public Object getBranchLocationManagementServicingSessionRecord() {
    return branchLocationManagementServicingSessionRecord;
  }

  public void setBranchLocationManagementServicingSessionRecord(Object branchLocationManagementServicingSessionRecord) {
    this.branchLocationManagementServicingSessionRecord = branchLocationManagementServicingSessionRecord;
  }


  /**
   * Get branchLocationManagementServiceConfigurationRecord
   * @return branchLocationManagementServiceConfigurationRecord
  **/

  public SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecord getBranchLocationManagementServiceConfigurationRecord() {
    return branchLocationManagementServiceConfigurationRecord;
  }

  public void setBranchLocationManagementServiceConfigurationRecord(SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord) {
    this.branchLocationManagementServiceConfigurationRecord = branchLocationManagementServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return branchLocationManagementServicingSessionStatus
  **/

  public String getBranchLocationManagementServicingSessionStatus() {
    return branchLocationManagementServicingSessionStatus;
  }

  public void setBranchLocationManagementServicingSessionStatus(String branchLocationManagementServicingSessionStatus) {
    this.branchLocationManagementServicingSessionStatus = branchLocationManagementServicingSessionStatus;
  }


}

