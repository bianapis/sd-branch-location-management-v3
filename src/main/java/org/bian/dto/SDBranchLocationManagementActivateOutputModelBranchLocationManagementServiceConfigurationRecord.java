package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup;
import org.bian.dto.SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement;
import org.bian.dto.SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecord
 */
public class SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecord   {
  private String branchLocationManagementServiceConfigurationSettingReference = null;

  private String branchLocationManagementServiceConfigurationSettingDescription = null;

  private SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup = null;

  private SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription branchLocationManagementServiceSubscription = null;

  private SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement branchLocationManagementServiceAgreement = null;

  private String branchLocationManagementServiceStatus = null;


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

  public SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup getBranchLocationManagementServiceConfigurationSetup() {
    return branchLocationManagementServiceConfigurationSetup;
  }

  public void setBranchLocationManagementServiceConfigurationSetup(SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup) {
    this.branchLocationManagementServiceConfigurationSetup = branchLocationManagementServiceConfigurationSetup;
  }


  /**
   * Get branchLocationManagementServiceSubscription
   * @return branchLocationManagementServiceSubscription
  **/

  public SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription getBranchLocationManagementServiceSubscription() {
    return branchLocationManagementServiceSubscription;
  }

  public void setBranchLocationManagementServiceSubscription(SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription branchLocationManagementServiceSubscription) {
    this.branchLocationManagementServiceSubscription = branchLocationManagementServiceSubscription;
  }


  /**
   * Get branchLocationManagementServiceAgreement
   * @return branchLocationManagementServiceAgreement
  **/

  public SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement getBranchLocationManagementServiceAgreement() {
    return branchLocationManagementServiceAgreement;
  }

  public void setBranchLocationManagementServiceAgreement(SDBranchLocationManagementActivateOutputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement branchLocationManagementServiceAgreement) {
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

