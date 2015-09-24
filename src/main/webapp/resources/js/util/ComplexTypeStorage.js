var complexTypes = {
	RelServHotelImage:  [  ]
	, 	RelServHotelRoomImage:  [  ]
	, 	CurrCourseView:  [ { "text": "currcurrency" } ]
	, 	CurrCurrencyView:  [  ]
	, 	DictGlobalView:  [  ]
	, 	DocDocumentsView:  [  ]
	, 	GroupGlobalView:  [  ]
	, 	InfoContactInformationView:  [  ]
	, 	InfoServicesView:  [ { "text": "dictglobal" }, { "text": "servcruise" }, { "text": "servexcursions" }, { "text": "servgifts" }, { "text": "servhotel" }, { "text": "servinsurances" }, { "text": "servticketsair" }, { "text": "servticketsrail" }, { "text": "servtour" }, { "text": "servtransfer" }, { "text": "servvisas" } ]
	, 	LocationAddressView:  [  ]
	, 	LocationCitiesView:  [ { "text": "locationcountries" } ]
	, 	LocationCountriesView:  [  ]
	, 	LocationTypePlacementView:  [ { "text": "dictglobal" } ]
	, 	OtherServicesStoreView:  [  ]
	, 	PaymentAccountRecordView:  [ { "text": "currcurrencybyresidualamountcurrency" }, { "text": "currcurrencybyoverdueamountcurrency" }, { "text": "currcurrencybypenaltycurrency" }, { "text": "currcurrencybymonthinstalcurrency" }, { "text": "currcurrencybyfinecurrency" }, { "text": "paymentaccount" } ]
	, 	PaymentAccountView:  [ { "text": "currcurrency" }, { "text": "dictglobalbypaymentmethod" }, { "text": "dictglobalbyservicetype" }, { "text": "infoservices" }, { "text": "tmaccount" } ]
	, 	PaymentContactRecordView:  [ { "text": "currcurrencybyoverdueamountcurrency" }, { "text": "currcurrencybymonthinstalcurrency" }, { "text": "currcurrencybyfinecurrency" }, { "text": "currcurrencybyresidualamountcurrency" }, { "text": "currcurrencybypenaltycurrency" }, { "text": "paymentcontact" } ]
	, 	PaymentContactView:  [ { "text": "currcurrency" }, { "text": "dictglobal" }, { "text": "tmcontact" }, { "text": "tmorder" } ]
	, 	PaymentDetailsView:  [  ]
	, 	PaymentPriceView:  [ { "text": "currcurrency" }, { "text": "paymenttariff" } ]
	, 	PaymentTariffView:  [ { "text": "servhotelroom" } ]
	, 	RelAccountContactsView:  [ { "text": "tmaccount" }, { "text": "tmcontact" } ]
	, 	RelCruiseContactsView:  [ { "text": "servcruise" }, { "text": "tmcontact" } ]
	, 	RelCruiseDocsView:  [ { "text": "docdocuments" }, { "text": "servcruise" } ]
	, 	RelReqServHotelDocDocumentsView:  [ { "text": "docdocuments" }, { "text": "reqservhotel" } ]
	, 	RelReqServHotelTmContactEasyView:  [ { "text": "reqservhotel" }, { "text": "tmcontacteasy" } ]
	, 	RelServHotelCreditCardsView:  [ { "text": "dictglobal" }, { "text": "servhotel" } ]
	, 	RelServHotelDocDocumentsView:  [ { "text": "docdocuments" }, { "text": "servhotel" } ]
	, 	RelServHotelEntertainmentAndSportView:  [ { "text": "dictglobal" }, { "text": "servhotel" } ]
	, 	RelServHotelFeaturesView:  [ { "text": "dictglobal" }, { "text": "servhotel" } ]
	, 	RelServHotelImageView:  [ { "text": "servhotel" }, { "text": "tmimage" } ]
	, 	RelServHotelInfoCommercialView:  [ { "text": "servhotel" }, { "text": "tmcommercial" } ]
	, 	RelServHotelInfoHotelServicesView:  [ { "text": "servhotel" }, { "text": "servhotelservices" } ]
	, 	RelServHotelInfoPoliciesView:  [ { "text": "servhotel" }, { "text": "tmpolicies" } ]
	, 	RelServHotelRoomFeaturesView:  [ { "text": "dictglobal" }, { "text": "servhotelroom" } ]
	, 	RelServHotelRoomImageView:  [ { "text": "servhotelroom" }, { "text": "tmimage" } ]
	, 	RelServHotelServKidsRuleView:  [ { "text": "servhotel" }, { "text": "servkidsrule" } ]
	, 	RelServKidsRuleFeaturesView:  [ { "text": "dictglobal" }, { "text": "servkidsrule" } ]
	, 	RelServTransferTmContactView:  [ { "text": "servtransfer" }, { "text": "tmcontact" } ]
	, 	RelTmOrderDocDocumentsView:  [ { "text": "docdocuments" }, { "text": "tmorder" } ]
	, 	RelTmOrderInfoServicesView:  [ { "text": "infoservices" }, { "text": "tmorder" } ]
	, 	RelTmOrderServGiftsView:  [ { "text": "servgifts" }, { "text": "tmorder" } ]
	, 	RelTmOrderTmContactView:  [ { "text": "tmcontact" }, { "text": "tmorder" } ]
	, 	RelTourDocsView:  [ { "text": "docdocuments" }, { "text": "servtour" } ]
	, 	RelTourHotelsView:  [ { "text": "servhotel" }, { "text": "servtour" } ]
	, 	RelTourServicesView:  [ { "text": "infoservices" }, { "text": "servtour" } ]
	, 	ReqCruiseHotelsView:  [ { "text": "servcruise" }, { "text": "servhotel" } ]
	, 	ReqCruiseServicesView:  [ { "text": "dictglobal" }, { "text": "infoservices" }, { "text": "servcruise" } ]
	, 	ReqHotelRoomsBusyView:  [ { "text": "dictglobal" }, { "text": "servhotelroom" } ]
	, 	ReqServHotelRoomBusyView:  [ { "text": "dictglobal" }, { "text": "servhotelroom" } ]
	, 	ReqServHotelView:  [ { "text": "dictglobalbypaymenttype" }, { "text": "dictglobalbyplacement" }, { "text": "servhotel" }, { "text": "servhotelroom" }, { "text": "usersbyrequestuser" }, { "text": "usersbyresponseuser" } ]
	, 	ServCruiseView:  [ { "text": "dictglobal" }, { "text": "tmaccount" } ]
	, 	ServExcursionsView:  [ { "text": "currcurrency" }, { "text": "locationcities" }, { "text": "tmaccount" } ]
	, 	ServGiftsView:  [ { "text": "dictglobal" } ]
	, 	ServHotelRoomView:  [ { "text": "dictglobalbyfood" }, { "text": "dictglobalbyroomtype" }, { "text": "groupglobal" }, { "text": "servhotel" } ]
	, 	ServHotelServicesView:  [ { "text": "dictglobalbyfeature" }, { "text": "dictglobalbyservice" } ]
	, 	ServHotelView:  [ { "text": "currcurrency" }, { "text": "dictglobalbyserviceid" }, { "text": "dictglobalbyreserveticketstype" }, { "text": "dictglobalbyplacement" }, { "text": "dictglobalbytype" }, { "text": "dictglobalbycategory" }, { "text": "dictglobalbyquality" }, { "text": "infocontactinformation" }, { "text": "locationaddress" }, { "text": "locationcities" }, { "text": "locationcountries" }, { "text": "locationtypeplacement" }, { "text": "paymentdetails" }, { "text": "tmaccount" } ]
	, 	ServInsurancesView:  [ { "text": "currcurrency" }, { "text": "dictglobal" }, { "text": "locationcountries" }, { "text": "tmaccountbyaccount" }, { "text": "tmaccountbyinsaccount" } ]
	, 	ServKidsRuleView:  [  ]
	, 	ServTicketsAirView:  [ { "text": "currcurrency" }, { "text": "dictglobalbytypeplanedep" }, { "text": "dictglobalbytypeplanearrival" }, { "text": "dictglobalbyairclass" }, { "text": "tmaccountbyaccount" }, { "text": "tmaccountbyaircompanyarrival" }, { "text": "tmaccountbyaircompanydep" } ]
	, 	ServTicketsRailView:  [ { "text": "currcurrency" }, { "text": "tmaccount" } ]
	, 	ServTourView:  [ { "text": "groupglobal" }, { "text": "locationcities" }, { "text": "locationcountries" }, { "text": "tmaccount" } ]
	, 	ServTransferRoutePointView:  [ { "text": "servtransferroute" } ]
	, 	ServTransferRouteView:  [ { "text": "currcurrency" }, { "text": "servtransfer" } ]
	, 	ServTransferView:  [ { "text": "currcurrency" }, { "text": "dictglobalbytransport" }, { "text": "dictglobalbypaymenttype" }, { "text": "dictglobalbytypetransfer" }, { "text": "locationcities" }, { "text": "locationcountries" }, { "text": "tmaccount" } ]
	, 	ServVisasView:  [ { "text": "currcurrency" }, { "text": "dictglobal" }, { "text": "locationcountries" }, { "text": "tmaccount" } ]
	, 	ShopServHotelView:  [  ]
	, 	TmAccountAddressesView:  [ { "text": "locationcities" }, { "text": "tmaccount" } ]
	, 	TmAccountCommunicationsView:  [ { "text": "dictglobal" }, { "text": "locationcities" }, { "text": "tmaccount" } ]
	, 	TmAccountDetailsView:  [ { "text": "tmaccount" } ]
	, 	TmAccountView:  [ { "text": "locationcountries" } ]
	, 	TmCommercialView:  [ { "text": "dictglobal" } ]
	, 	TmContactAddressesView:  [ { "text": "locationcities" }, { "text": "tmcontact" } ]
	, 	TmContactCommunicationsView:  [ { "text": "dictglobal" }, { "text": "locationcities" }, { "text": "tmcontact" } ]
	, 	TmContactEasyView:  [ { "text": "locationcountries" } ]
	, 	TmContactView:  [ { "text": "locationcountries" } ]
	, 	TmFirmsView:  [  ]
	, 	TmImageView:  [  ]
	, 	TmIncidentsView:  [ { "text": "servhotel" }, { "text": "servtour" }, { "text": "servtransfer" }, { "text": "servvisas" }, { "text": "tmaccount" }, { "text": "tmcontact" } ]
	, 	TmOrderView:  [ { "text": "dictglobal" }, { "text": "tmaccount" }, { "text": "tmcontact" } ]
	, 	TmPoliciesView:  [ { "text": "dictglobalbyfeature" }, { "text": "dictglobalbyservice" } ]
	, 	TmUserInfoView:  [  ]
	, 	UserRolesView:  [ { "text": "users" } ]
	, 	UsersView:  [ { "text": "tmimage" } ]
}

function getComplexType(type) {
	return complexTypes[type];
}