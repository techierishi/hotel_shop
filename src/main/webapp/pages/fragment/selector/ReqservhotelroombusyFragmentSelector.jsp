<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div class="edit-form">
	<div ng-if="!loading">
		<div class="modal-header">
			<button type="button" class="close round-button" ng-click="cancel()">&times;</button>
			<h4 class="modal-title">
				<spring:message code="default.listof" /> <spring:message code="label.ReqServHotelRoomBusy" />
			<h4>
		</div>
		<div class="row modal-body padding-top-0">
		<c:if test="${debug}">
			<div class="row">
				<div class="margin-left-30">
					<a href="../data/reqservhotelroombusyview?initLists=true&initDicts=true" target="_blank" class="btn btn-default">JSON DATA</a>
				</div>
			</div>
		</c:if>
			<div class="row">
				<div class="col-md-12 filterBar">
					<div class="fill-content has-feedback modal-title">
						<input type="text" ng-model="searchKeywordReqServHotelRoomBusy" class="form-control"
								ng-model-options="{ debounce: 300 }"
								placeholder="<spring:message code="default.filterKeyword" />"
								tabindex="1"  /> 
						<i class="form-control-feedback glyphicon glyphicon-search"></i>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="table-responsive margin-bottom-5 table-body ledit-scroll scrollable-content-500"
					when-scrolled="loadDataReqServHotelRoomBusy()">
					<table class="table table-hover table-striped table-bordered margin-bottom-5 padding-all-2">
						<thead>
							<tr>
								<th class="picker-th"></th>
						<th ng-if="::checkVisibility('label')">
							<div ng-click="sort('label')" >
								<a class="sortable-column-name"><span><spring:message code="label.label" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.label, 'fa-caret-up': !details.label }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('busystart')">
							<div ng-click="sort('busystart')" >
								<a class="sortable-column-name"><span><spring:message code="label.busyStart" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.busyStart, 'fa-caret-up': !details.busyStart }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('busyend')">
							<div ng-click="sort('busyend')" >
								<a class="sortable-column-name"><span><spring:message code="label.busyEnd" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.busyEnd, 'fa-caret-up': !details.busyEnd }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('servhotelroom')">
							<div ng-click="sort('servhotelroom')" >
								<a class="sortable-column-name"><span><spring:message code="label.servHotelRoom" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.servHotelRoom, 'fa-caret-up': !details.servHotelRoom }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dictglobal')">
							<div ng-click="sort('dictglobal')" >
								<a class="sortable-column-name"><span><spring:message code="label.dictGlobal" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dictGlobal, 'fa-caret-up': !details.dictGlobal }"></i>
							</div>
						</th>

							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="item in filteredReqServHotelRoomBusy = ( dataReqServHotelRoomBusy | filter:searchKeywordReqServHotelRoomBusy ) track by $index"
								ng-class="{ 'success': item.checked }">
								<td class="picker-td"><input type="checkbox" ng-model="item.checked" ng-change="onSelectionChanged(item)" class="picker-input"/></td>
						<td ng-if="::checkVisibility('label')"><label>{{ ::item.label }}</label></td>
						<td ng-if="::checkVisibility('busystart')"><label>{{ ::item.busystart }}</label></td>
						<td ng-if="::checkVisibility('busyend')"><label>{{ ::item.busyend }}</label></td>
						<td ng-if="::checkVisibility('servhotelroom')"><label>{{ ::item.servhotelroom }}</label></td>
						<td ng-if="::checkVisibility('dictglobal')"><label>{{ ::item.dictglobal }}</label></td>
							</tr>
						</tbody>
					</table>
				  </div>
			</div>
			<div class="col-md-12 margin-bottom-10">
				<div class="btn-toolbar">
	  				<div class="btn-group">
						<button type="button" class="btn btn-default">
							<i class="fa fa-list-alt fa-lg"></i>
							<span><spring:message code="default.total" />:{{ selectedItems.length }} / {{ filteredReqServHotelRoomBusy.length }} / {{ dataReqServHotelRoomBusy.length }}</span>
						</button>
						<button type="button" ng-disabled="scrollable.dataLoading" class="btn btn-primary" ng-click="loadDataReqServHotelRoomBusy()">
							<i class="fa fa-database fa-lg" ng-class="{'fa-refresh fa-spin': scrollable.dataLoading, 'fa-database': !scrollable.dataLoading}"></i>
							<span><spring:message code="default.loadMore" /></span>
						</button>
	  				</div>
	  			</div>
			</div>
		</div>
		<div class="modal-footer">
			<div class="col-xs-6 col-md-6">
				<a ng-click="cancel()" class="btn btn-default btn-block btn-lg">
					<spring:message code="default.cancel" />
				</a>
			</div>
			<div class="col-xs-6 col-md-6">
				<a ng-click="submitFunc()"
					class="btn btn-success btn-block btn-lg"> <spring:message
						code="default.submit" />
				</a>
			</div>
		</div>
	</div>
	 <div ng-show="loading" class="loading-bar-holder border-none">
		<div class="loading-bar">
			<i class="glyphicon glyphicon-refresh fa-spin loading-spinner"></i>
		</div>
	</div>
</div>
