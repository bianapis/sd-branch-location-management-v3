package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedService;
import org.bian.dto.SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementRetrieveOutputModel
 */
public class SDBranchLocationManagementRetrieveOutputModel   {
  private String branchLocationManagementRetrieveActionTaskReference = null;

  private Object branchLocationManagementRetrieveActionTaskRecord = null;

  private String branchLocationManagementRetrieveActionResponse = null;

  private SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementRetrieveActionRecord branchLocationManagementRetrieveActionRecord = null;

  private SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedService branchLocationManagementOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return branchLocationManagementRetrieveActionTaskReference
  **/

  public String getBranchLocationManagementRetrieveActionTaskReference() {
    return branchLocationManagementRetrieveActionTaskReference;
  }

  public void setBranchLocationManagementRetrieveActionTaskReference(String branchLocationManagementRetrieveActionTaskReference) {
    this.branchLocationManagementRetrieveActionTaskReference = branchLocationManagementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchLocationManagementRetrieveActionTaskRecord
  **/

  public Object getBranchLocationManagementRetrieveActionTaskRecord() {
    return branchLocationManagementRetrieveActionTaskRecord;
  }

  public void setBranchLocationManagementRetrieveActionTaskRecord(Object branchLocationManagementRetrieveActionTaskRecord) {
    this.branchLocationManagementRetrieveActionTaskRecord = branchLocationManagementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return branchLocationManagementRetrieveActionResponse
  **/

  public String getBranchLocationManagementRetrieveActionResponse() {
    return branchLocationManagementRetrieveActionResponse;
  }

  public void setBranchLocationManagementRetrieveActionResponse(String branchLocationManagementRetrieveActionResponse) {
    this.branchLocationManagementRetrieveActionResponse = branchLocationManagementRetrieveActionResponse;
  }


  /**
   * Get branchLocationManagementRetrieveActionRecord
   * @return branchLocationManagementRetrieveActionRecord
  **/

  public SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementRetrieveActionRecord getBranchLocationManagementRetrieveActionRecord() {
    return branchLocationManagementRetrieveActionRecord;
  }

  public void setBranchLocationManagementRetrieveActionRecord(SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementRetrieveActionRecord branchLocationManagementRetrieveActionRecord) {
    this.branchLocationManagementRetrieveActionRecord = branchLocationManagementRetrieveActionRecord;
  }


  /**
   * Get branchLocationManagementOfferedService
   * @return branchLocationManagementOfferedService
  **/

  public SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedService getBranchLocationManagementOfferedService() {
    return branchLocationManagementOfferedService;
  }

  public void setBranchLocationManagementOfferedService(SDBranchLocationManagementRetrieveOutputModelBranchLocationManagementOfferedService branchLocationManagementOfferedService) {
    this.branchLocationManagementOfferedService = branchLocationManagementOfferedService;
  }


}

