package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementConfigureInputModel
 */
public class SDBranchLocationManagementConfigureInputModel   {
  private Object branchLocationManagementConfigurationActionTaskRecord = null;

  private String branchLocationManagementServicingSessionReference = null;

  private String branchLocationManagementServiceReference = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return branchLocationManagementServiceReference
  **/

  public String getBranchLocationManagementServiceReference() {
    return branchLocationManagementServiceReference;
  }

  public void setBranchLocationManagementServiceReference(String branchLocationManagementServiceReference) {
    this.branchLocationManagementServiceReference = branchLocationManagementServiceReference;
  }


  /**
   * Get branchLocationManagementServiceConfigurationRecord
   * @return branchLocationManagementServiceConfigurationRecord
  **/

  public SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecord getBranchLocationManagementServiceConfigurationRecord() {
    return branchLocationManagementServiceConfigurationRecord;
  }

  public void setBranchLocationManagementServiceConfigurationRecord(SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord) {
    this.branchLocationManagementServiceConfigurationRecord = branchLocationManagementServiceConfigurationRecord;
  }


}

