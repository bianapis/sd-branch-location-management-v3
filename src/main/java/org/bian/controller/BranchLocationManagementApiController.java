/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class BranchLocationManagementApiController {

	@Autowired
	BranchLocationManagementApiService service;
	
	@Manage.Activate
	public BianResponse<SDBranchLocationManagementActivateOutputModel> activate(@RequestBody BianRequest<SDBranchLocationManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("customerliaison")
	@Manage.Capture
	public BianResponse<BQCustomerLiaisonCaptureOutputModel> captureCustomerliaison(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCustomerLiaisonCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCustomerliaison(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productandserviceplanning")
	@Manage.Capture
	public BianResponse<BQProductandServicePlanningCaptureOutputModel> captureProductandserviceplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductandServicePlanningCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProductandserviceplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffandlocationplanning")
	@Manage.Capture
	public BianResponse<BQStaffandLocationPlanningCaptureOutputModel> captureStaffandlocationplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffandLocationPlanningCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureStaffandlocationplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Capture
	public BianResponse<BQTroubleshootingCaptureOutputModel> captureTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Capture
	public BianResponse<CRBranchLocationManagementPlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDBranchLocationManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchLocationManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("productandserviceplanning")
	@Manage.Control
	public BianResponse<BQProductandServicePlanningControlOutputModel> controlProductandserviceplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductandServicePlanningControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlProductandserviceplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Control
	public BianResponse<CRBranchLocationManagementPlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Exchange
	public BianResponse<CRBranchLocationManagementPlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDBranchLocationManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchLocationManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRBranchLocationManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Initiate
	public BianResponse<CRBranchLocationManagementPlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("customerliaison")
	@Manage.Initiate
	public BianResponse<BQCustomerLiaisonInitiateOutputModel> initiateCustomerliaison(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCustomerLiaisonInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCustomerliaison(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Initiate
	public BianResponse<BQTroubleshootingInitiateOutputModel> initiateTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTroubleshootingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTroubleshooting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("customerliaison")
	@Manage.Request
	public BianResponse<BQCustomerLiaisonRequestOutputModel> requestCustomerliaison(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCustomerLiaisonRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCustomerliaison(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productandserviceplanning")
	@Manage.Request
	public BianResponse<BQProductandServicePlanningRequestOutputModel> requestProductandserviceplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductandServicePlanningRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProductandserviceplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffandlocationplanning")
	@Manage.Request
	public BianResponse<BQStaffandLocationPlanningRequestOutputModel> requestStaffandlocationplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffandLocationPlanningRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestStaffandlocationplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Request
	public BianResponse<BQTroubleshootingRequestOutputModel> requestTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRBranchLocationManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Retrieve
	public BianResponse<CRBranchLocationManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("customerliaison")
	@Manage.Retrieve
	public BianResponse<BQCustomerLiaisonRetrieveOutputModel> retrieveCustomerliaison(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomerliaison(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productandserviceplanning")
	@Manage.Retrieve
	public BianResponse<BQProductandServicePlanningRetrieveOutputModel> retrieveProductandserviceplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductandserviceplanning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("staffandlocationplanning")
	@Manage.Retrieve
	public BianResponse<BQStaffandLocationPlanningRetrieveOutputModel> retrieveStaffandlocationplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStaffandlocationplanning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("troubleshooting")
	@Manage.Retrieve
	public BianResponse<BQTroubleshootingRetrieveOutputModel> retrieveTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDBranchLocationManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRBranchLocationManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("customerliaison")
	@Manage.Update
	public BianResponse<BQCustomerLiaisonUpdateOutputModel> updateCustomerliaison(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCustomerLiaisonUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCustomerliaison(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productandserviceplanning")
	@Manage.Update
	public BianResponse<BQProductandServicePlanningUpdateOutputModel> updateProductandserviceplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductandServicePlanningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductandserviceplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffandlocationplanning")
	@Manage.Update
	public BianResponse<BQStaffandLocationPlanningUpdateOutputModel> updateStaffandlocationplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffandLocationPlanningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateStaffandlocationplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Update
	public BianResponse<BQTroubleshootingUpdateOutputModel> updateTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
