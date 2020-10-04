package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecord
 */
public class SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecord   {
  private String branchLocationManagementServiceConfigurationSettingReference = null;

  private String branchLocationManagementServiceConfigurationSettingType = null;

  private SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return branchLocationManagementServiceConfigurationSettingReference
  **/

  public String getBranchLocationManagementServiceConfigurationSettingReference() {
    return branchLocationManagementServiceConfigurationSettingReference;
  }

  public void setBranchLocationManagementServiceConfigurationSettingReference(String branchLocationManagementServiceConfigurationSettingReference) {
    this.branchLocationManagementServiceConfigurationSettingReference = branchLocationManagementServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return branchLocationManagementServiceConfigurationSettingType
  **/

  public String getBranchLocationManagementServiceConfigurationSettingType() {
    return branchLocationManagementServiceConfigurationSettingType;
  }

  public void setBranchLocationManagementServiceConfigurationSettingType(String branchLocationManagementServiceConfigurationSettingType) {
    this.branchLocationManagementServiceConfigurationSettingType = branchLocationManagementServiceConfigurationSettingType;
  }


  /**
   * Get branchLocationManagementServiceConfigurationSetup
   * @return branchLocationManagementServiceConfigurationSetup
  **/

  public SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup getBranchLocationManagementServiceConfigurationSetup() {
    return branchLocationManagementServiceConfigurationSetup;
  }

  public void setBranchLocationManagementServiceConfigurationSetup(SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup) {
    this.branchLocationManagementServiceConfigurationSetup = branchLocationManagementServiceConfigurationSetup;
  }


}

