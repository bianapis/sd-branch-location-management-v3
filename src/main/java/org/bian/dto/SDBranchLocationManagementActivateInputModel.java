package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementActivateInputModel
 */
public class SDBranchLocationManagementActivateInputModel   {
  private Object branchLocationManagementActivationActionTaskRecord = null;

  private String branchLocationManagementCenterReference = null;

  private String branchLocationManagementServiceReference = null;

  private SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return branchLocationManagementCenterReference
  **/

  public String getBranchLocationManagementCenterReference() {
    return branchLocationManagementCenterReference;
  }

  public void setBranchLocationManagementCenterReference(String branchLocationManagementCenterReference) {
    this.branchLocationManagementCenterReference = branchLocationManagementCenterReference;
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

  public SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecord getBranchLocationManagementServiceConfigurationRecord() {
    return branchLocationManagementServiceConfigurationRecord;
  }

  public void setBranchLocationManagementServiceConfigurationRecord(SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecord branchLocationManagementServiceConfigurationRecord) {
    this.branchLocationManagementServiceConfigurationRecord = branchLocationManagementServiceConfigurationRecord;
  }


}

