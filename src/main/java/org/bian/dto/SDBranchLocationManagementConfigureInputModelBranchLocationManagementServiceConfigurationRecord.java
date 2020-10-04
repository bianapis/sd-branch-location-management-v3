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
 * SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecord
 */
public class SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecord   {
  private String branchLocationManagementServiceConfigurationSettingReference = null;

  private String branchLocationManagementServiceConfigurationSettingType = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup branchLocationManagementServiceConfigurationSetup = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceSubscription branchLocationManagementServiceSubscription = null;

  private SDBranchLocationManagementConfigureInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceAgreement branchLocationManagementServiceAgreement = null;


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


}

