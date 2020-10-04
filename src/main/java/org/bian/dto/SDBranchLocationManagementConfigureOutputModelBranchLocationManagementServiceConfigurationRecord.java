package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement;
import org.bian.dto.SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup;
import org.bian.dto.SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementConfigureOutputModelBranchLocationManagementServiceConfigurationRecord
 */
public class SDBranchLocationManagementConfigureOutputModelBranchLocationManagementServiceConfigurationRecord   {
  private String branchLocationManagementServiceConfigurationSettingDescription = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription branchLocationManagementServiceSubscription = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement branchLocationManagementServiceAgreement = null;

  private String branchLocationManagementServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return branchLocationManagementServiceConfigurationSettingDescription
  **/

  public String getBranchLocationManagementServiceConfigurationSettingDescription() {
    return branchLocationManagementServiceConfigurationSettingDescription;
  }

  public void setBranchLocationManagementServiceConfigurationSettingDescription(String branchLocationManagementServiceConfigurationSettingDescription) {
    this.branchLocationManagementServiceConfigurationSettingDescription = branchLocationManagementServiceConfigurationSettingDescription;
  }


  /**
   * Get branchLocationManagementServiceConfigurationSetup
   * @return branchLocationManagementServiceConfigurationSetup
  **/

  public SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup getBranchLocationManagementServiceConfigurationSetup() {
    return branchLocationManagementServiceConfigurationSetup;
  }

  public void setBranchLocationManagementServiceConfigurationSetup(SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup) {
    this.branchLocationManagementServiceConfigurationSetup = branchLocationManagementServiceConfigurationSetup;
  }


  /**
   * Get branchLocationManagementServiceSubscription
   * @return branchLocationManagementServiceSubscription
  **/

  public SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription getBranchLocationManagementServiceSubscription() {
    return branchLocationManagementServiceSubscription;
  }

  public void setBranchLocationManagementServiceSubscription(SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription branchLocationManagementServiceSubscription) {
    this.branchLocationManagementServiceSubscription = branchLocationManagementServiceSubscription;
  }


  /**
   * Get branchLocationManagementServiceAgreement
   * @return branchLocationManagementServiceAgreement
  **/

  public SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement getBranchLocationManagementServiceAgreement() {
    return branchLocationManagementServiceAgreement;
  }

  public void setBranchLocationManagementServiceAgreement(SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement branchLocationManagementServiceAgreement) {
    this.branchLocationManagementServiceAgreement = branchLocationManagementServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return branchLocationManagementServiceStatus
  **/

  public String getBranchLocationManagementServiceStatus() {
    return branchLocationManagementServiceStatus;
  }

  public void setBranchLocationManagementServiceStatus(String branchLocationManagementServiceStatus) {
    this.branchLocationManagementServiceStatus = branchLocationManagementServiceStatus;
  }


}

