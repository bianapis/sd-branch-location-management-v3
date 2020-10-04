package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementConfigureOutputModelBranchLocationManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementConfigureOutputModel
 */
public class SDBranchLocationManagementConfigureOutputModel   {
  private String branchLocationManagementConfigurationActionTaskReference = null;

  private Object branchLocationManagementConfigurationActionTaskRecord = null;

  private SDBranchLocationManagementConfigureOutputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord = null;

  private String branchLocationManagementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return branchLocationManagementConfigurationActionTaskReference
  **/

  public String getBranchLocationManagementConfigurationActionTaskReference() {
    return branchLocationManagementConfigurationActionTaskReference;
  }

  public void setBranchLocationManagementConfigurationActionTaskReference(String branchLocationManagementConfigurationActionTaskReference) {
    this.branchLocationManagementConfigurationActionTaskReference = branchLocationManagementConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return branchLocationManagementConfigurationActionTaskRecord
  **/

  public Object getBranchLocationManagementConfigurationActionTaskRecord() {
    return branchLocationManagementConfigurationActionTaskRecord;
  }

  public void setBranchLocationManagementConfigurationActionTaskRecord(Object branchLocationManagementConfigurationActionTaskRecord) {
    this.branchLocationManagementConfigurationActionTaskRecord = branchLocationManagementConfigurationActionTaskRecord;
  }


  /**
   * Get branchLocationManagementServiceConfigurationRecord
   * @return branchLocationManagementServiceConfigurationRecord
  **/

  public SDBranchLocationManagementConfigureOutputModelBranchLocationManagementServiceConfigurationRecord getBranchLocationManagementServiceConfigurationRecord() {
    return branchLocationManagementServiceConfigurationRecord;
  }

  public void setBranchLocationManagementServiceConfigurationRecord(SDBranchLocationManagementConfigureOutputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord) {
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

